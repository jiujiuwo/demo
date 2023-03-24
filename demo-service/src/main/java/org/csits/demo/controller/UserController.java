package org.csits.demo.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.csits.demo.api.IUserController;
import org.csits.demo.api.qo.SysUserQo;
import org.csits.demo.comm.Result;
import org.csits.demo.domain.SysUser;
import org.csits.demo.service.SysUserService;
import org.csits.demo.config.MyRestTemplteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/user")
@Tag(name = "用户相关接口")
public class UserController implements IUserController {

    @Autowired
    SysUserService sysUserService;

    @Autowired
    RestTemplate myRestTemplate;

    @Autowired
    HttpServletRequest request;

    @Autowired
    HttpServletResponse response;

    @Autowired
    private MessageSource messageSource;

    @GetMapping("/list")
    @Operation(summary = "获取用户列表")
    public Result getUserList() {
        return Result.OK(sysUserService.list());
    }

    @GetMapping("/hello")
    @Operation(summary = "获取国际化支持")
    public Result testI18n() {
        return Result.OK(messageSource.getMessage("200", null, LocaleContextHolder.getLocale()));
    }

    @PostMapping("/listPage")
    @Operation(summary = "分页获取用户列表")
    @ResponseBody
    public Result listPage(@Validated @RequestBody SysUserQo sysUserQo) {
        Page<SysUser> result = sysUserService.selectPageVo(sysUserQo);
        return Result.OK(result);
    }

    @GetMapping("/getForObj")
    @Operation(summary = "调用restTemplate测试")
    @ResponseBody
    public Result testRestTemplate() {
        Object object = myRestTemplate.getForObject(request.getRequestURI(), Object.class);
        return Result.OK(object);
    }

    @GetMapping("/getForObj1")
    @Operation(summary = "调用restTemplate测试")
    @ResponseBody
    public Result testRestTemplate1() {
        Object object = myRestTemplate.getForObject(request.getRequestURI(), Object.class);
        return Result.OK(object);
    }
}
