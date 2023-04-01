package org.csits.demo.module.sys.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.csits.demo.comm.Result;
import org.csits.demo.module.sys.entity.SysUser;
import org.csits.demo.module.sys.entity.custom.CustomSysUser;
import org.csits.demo.module.sys.service.ISysUserService;
import org.csits.demo.utils.MessageService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author lhf
 * @since 2023-04-01
 */
@Controller
@RequestMapping("/sys/sysUser")
public class SysUserController {

    @Autowired
    private ISysUserService sysUserService;

    @Autowired
    private MessageService messageService;

    @Operation(method = "POST", summary = "添加用户信息")
    @PostMapping("/add")
    public Result add(@RequestBody @Validated CustomSysUser sysUser) {
        SysUser sysUser1 = new SysUser();
        BeanUtils.copyProperties(sysUser, sysUser1);
        boolean result = sysUserService.save(sysUser1);
        if(!result){
            Result.error(messageService.getMessage("004"));
        }
        return Result.OK(messageService.getMessage("0004"));
    }

    @Operation(method = "GET", summary = "获取当前登陆的用户信息")
    @GetMapping("/currentUser")
    public Result currentUser(@AuthenticationPrincipal CustomSysUser sysUser) {
        return Result.OK(sysUser);
    }
}
