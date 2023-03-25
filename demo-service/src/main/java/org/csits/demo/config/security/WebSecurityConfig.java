package org.csits.demo.config.security;

import org.csits.demo.module.sys.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.authorization.AuthorizationDecision;
import org.springframework.security.authorization.AuthorizationManager;
import org.springframework.security.config.annotation.authentication.configurers.userdetails.DaoAuthenticationConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.access.intercept.RequestAuthorizationContext;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

    @Autowired
    private ISysUserService userService;

    @Autowired

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeRequests((authorize) -> authorize
                        .anyRequest().authenticated()
                )
                .formLogin((form) -> form
                        .loginProcessingUrl("/user/login/check")
                        .permitAll()
                );
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
}