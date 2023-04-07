package org.csits.demo.module.rest.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.csits.demo.comm.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.security.web.csrf.CsrfTokenRequestHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@Tag(name = "公共的开放接口")
@RestController
@RequestMapping("/rest")
public class CommonRestController {

    @Autowired
    private HttpServletResponse response;

    @Autowired
    private HttpServletRequest request;

    @Autowired
    private CookieCsrfTokenRepository cookieCsrfTokenRepository;

    @Autowired
    private CsrfTokenRequestHandler csrfTokenRequestHandler;

    @Operation(summary = "获取csrf", description = "获取csrf以发起请求")
    @GetMapping("/csrf")
    public Result getCsrf() {
        CsrfToken csrfToken = cookieCsrfTokenRepository.loadToken(request);
        if (Objects.isNull(csrfToken)) {
            csrfToken = cookieCsrfTokenRepository.generateToken(request);
            cookieCsrfTokenRepository.saveToken(csrfToken, request, response);
        }
        return Result.OK(csrfToken.getToken());
    }


}
