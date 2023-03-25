package org.csits.demo.module.sys.controller;

import org.csits.demo.api.qo.LoginQo;
import org.csits.demo.comm.Result;
import org.csits.demo.module.sys.entity.custom.CustomSysUser;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.validation.annotation.Validated;
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
 * @since 2023-03-25
 */
@Controller
@RequestMapping("/user")
public class SysUserController {

    @PostMapping("/login/check")
    public Result loginCheck(@RequestBody @Validated LoginQo loginQo, @AuthenticationPrincipal CustomSysUser sysUser) {
        return Result.OK(sysUser);
    }
}
