package org.csits.demo.module.rest.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.csits.demo.comm.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class CommonRestController {

    @Autowired
    private HttpServletResponse response;

    @Autowired
    private HttpServletRequest request;

    @Autowired
    private CookieCsrfTokenRepository cookieCsrfTokenRepository;

    @GetMapping("/csrf")
    public Result getCsrf() {
        return Result.OK(cookieCsrfTokenRepository.loadToken(request).getToken());
    }


}
