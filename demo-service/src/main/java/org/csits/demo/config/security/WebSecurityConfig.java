package org.csits.demo.config.security;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.csits.demo.comm.Result;
import org.csits.demo.module.sys.entity.custom.CustomSysUser;
import org.csits.demo.module.sys.service.ISysUserService;
import org.csits.demo.utils.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.authorization.AuthorizationDecision;
import org.springframework.security.authorization.AuthorizationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.security.web.access.intercept.RequestAuthorizationContext;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
import org.springframework.security.web.csrf.CsrfTokenRequestHandler;
import org.springframework.security.web.csrf.XorCsrfTokenRequestAttributeHandler;

import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;


@Slf4j
@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

    @Autowired
    private ISysUserService userService;

    @Autowired
    private MessageService messageService;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeRequests(
                        (authorize) -> authorize.requestMatchers("/").authenticated())
                .authorizeRequests((authorize) -> authorize.requestMatchers("/rest/").permitAll())
                .csrf(csrf -> csrf.csrfTokenRepository(cookieCsrfTokenRepository())
                        .csrfTokenRequestHandler(csrfTokenRequestHandler())
                        .and())
                .formLogin((form) -> form
                        .loginProcessingUrl("/user/login/check")
                        .successHandler(authenticationSuccessHandler())
                        .failureHandler(authenticationFailureHandler()).permitAll())
                .exceptionHandling()
                .authenticationEntryPoint(authenticationEntryPoint())
                .accessDeniedHandler(accessDeniedHandler());

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
            response.setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
            CustomSysUser customSysUser = (CustomSysUser) authentication.getPrincipal();
            Result result = Result.OK(messageService.getMessage("000"), customSysUser);
            log.info(JSONObject.toJSONString(result));
            response.getWriter().write(JSONObject.toJSONString(result));
            response.getWriter().flush();
        };
    }

    @Bean
    public AuthenticationFailureHandler authenticationFailureHandler() {
        return (request, response, exception) -> {
            response.setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
            Result result = Result.error(messageService.getMessage("001"));
            log.info(JSONObject.toJSONString(result));
            response.getWriter().write(JSONObject.toJSONString(result));
            response.getWriter().flush();
        };
    }

    @Bean
    public AuthenticationEntryPoint authenticationEntryPoint() {
        return (request, response, authException) -> {
            response.setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
            Result result = Result.error(messageService.getMessage("002"));
            log.info(JSONObject.toJSONString(result));
            response.getWriter().write(JSONObject.toJSONString(result));
            response.getWriter().flush();
        };
    }

    @Bean
    public AccessDeniedHandler accessDeniedHandler() {
        return (request, response, accessDeniedException) -> {
            response.setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
            Result result = Result.error(messageService.getMessage("003"));
            log.info(JSONObject.toJSONString(result));
            response.getWriter().write(JSONObject.toJSONString(result));
            response.getWriter().flush();
        };
    }

    @Bean
    public CookieCsrfTokenRepository cookieCsrfTokenRepository() {
        return CookieCsrfTokenRepository.withHttpOnlyFalse();
    }

    @Bean
    public CsrfTokenRequestHandler csrfTokenRequestHandler() {
        XorCsrfTokenRequestAttributeHandler handler = new XorCsrfTokenRequestAttributeHandler();
        handler.setSecureRandom(new SecureRandom("sfdsafdad".getBytes(StandardCharsets.UTF_8)));
        handler.setCsrfRequestAttributeName("_csrf");
        CsrfTokenRequestHandler requestHandler = handler::handle;
        return requestHandler;
    }
}
