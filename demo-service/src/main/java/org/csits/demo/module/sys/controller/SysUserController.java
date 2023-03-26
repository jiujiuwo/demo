package org.csits.demo.module.sys.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.csits.demo.api.qo.LoginQo;
import org.csits.demo.comm.Result;
import org.csits.demo.module.sys.entity.SysUser;
import org.csits.demo.module.sys.entity.custom.CustomSysUser;
import org.csits.demo.module.sys.service.ISysUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author lhf
 * @since 2023-03-25
 */
@Tag(name = "定义用户相关的操作")
@RestController
@RequestMapping("/user")
public class SysUserController {

    @Autowired
    private ISysUserService sysUserService;

    @Operation(method = "POST", summary = "添加用户信息")
    @PostMapping("/add")
    public Result add(@RequestBody @Validated CustomSysUser sysUser) {
        SysUser sysUser1 = new SysUser();
        BeanUtils.copyProperties(sysUser, sysUser1);
        boolean result = sysUserService.save(sysUser1);
        return Result.OK(result);
    }

    @Operation(method = "GET", summary = "获取当前登陆的用户信息")
    @GetMapping("/currentUser")
    public Result currentUser(@AuthenticationPrincipal CustomSysUser sysUser) {
        return Result.OK(sysUser);
    }
}
