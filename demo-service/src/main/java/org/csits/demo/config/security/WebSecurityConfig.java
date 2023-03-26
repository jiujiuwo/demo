package org.csits.demo.config.security;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.csits.demo.comm.Result;
import org.csits.demo.module.sys.entity.custom.CustomSysUser;
import org.csits.demo.module.sys.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.authorization.AuthorizationDecision;
import org.springframework.security.authorization.AuthorizationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.access.intercept.RequestAuthorizationContext;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import java.util.Locale;

import static org.csits.demo.config.ApplicationConfiguration.LOCALE;

@Slf4j
@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

    @Autowired
    private ISysUserService userService;

    @Autowired
    private MessageSource messageSource;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeRequests((authorize) -> authorize
                        .anyRequest().authenticated()
                )
                .formLogin((form) -> form
                        .loginProcessingUrl("/user/login/check")
                        .successHandler(authenticationSuccessHandler())
                        .failureHandler(authenticationFailureHandler())
                        .permitAll()
                )
                .csrf().disable();
        return http.build();
    }

    @Bean
    AuthorizationManager<RequestAuthorizationContext> ipAddressAuthorizationManager() {
        return (authentication, context) -> new AuthorizationDecision(context.getRequest().getRemoteAddr().startsWith("192.168.1.1"));
    }

    @Bean
    public DaoAuthenticationProvider daoAuthenticationProvider() {
        DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
        daoAuthenticationProvider.setUserDetailsService(userService);
        return daoAuthenticationProvider;
    }

    @Bean
    public AuthenticationSuccessHandler authenticationSuccessHandler() {
        return (request, response, authentication) -> {
            response.setContentType(MediaType.APPLICATION_JSON_VALUE);
            CustomSysUser customSysUser = (CustomSysUser) authentication.getPrincipal();
            Result result = Result.OK(customSysUser);
            log.info(JSONObject.toJSONString(result));
            response.getWriter().write(JSONObject.toJSONString(result));
            response.getWriter().flush();
        };
    }

    @Bean
    public AuthenticationFailureHandler authenticationFailureHandler() {
        return (request, response, exception) -> {
            response.setContentType(MediaType.APPLICATION_JSON_VALUE);
            Result result = Result.error(messageSource.getMessage("001", null, Locale.forLanguageTag(LOCALE)));
            log.info(JSONObject.toJSONString(result));
            response.getWriter().write(JSONObject.toJSONString(result));
            response.getWriter().flush();
        };
    }
}