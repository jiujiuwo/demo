package org.csits.demo.module.sys.controller;

import com.alibaba.fastjson2.schema.ValidateResult;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ObjectUtils;
import org.csits.demo.comm.Result;
import org.csits.demo.module.sys.entity.SysUser;
import org.csits.demo.module.sys.entity.custom.CustomSysUser;
import org.csits.demo.module.sys.service.ISysUserService;
import org.csits.demo.utils.MessageService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author lhf
 * @since 2023-04-01
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class SysUserController {

    @Autowired
    private ISysUserService sysUserService;

    @Autowired
    private MessageService messageService;

    @Autowired
    private HttpServletRequest request;

    @Autowired
    private HttpServletResponse response;

    @Operation(method = "POST", summary = "添加用户信息")
    @PostMapping("/add")
    public Result add(@RequestBody @Valid CustomSysUser sysUser) {
        SysUser sysUser1 = new SysUser();
        BeanUtils.copyProperties(sysUser, sysUser1);
        boolean result = sysUserService.save(sysUser1);
        if (!result) {
            Result.error(messageService.getMessage("004"));
        }
        return Result.OK(messageService.getMessage("0004"));
    }

    @Operation(method = "GET", summary = "获取当前登陆的用户信息")
    @GetMapping("/currentUser")
    public Result currentUser(@AuthenticationPrincipal CustomSysUser sysUser) {
        if (ObjectUtils.isEmpty(sysUser)) {
            return Result.error(messageService.getMessage("002"));
        }
        return Result.OK(sysUser);
    }

    @Operation(method = "POST", summary = "获取当前登陆的用户信息")
    @PostMapping("/logout")
    public Result logout(@AuthenticationPrincipal CustomSysUser sysUser) {
        if (ObjectUtils.isEmpty(sysUser)) {
            return Result.error(messageService.getMessage("002"));
        }
        request.getSession().invalidate();
        return Result.OK();
    }
}
