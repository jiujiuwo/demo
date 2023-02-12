package org.csits.demo.controller;

import org.csits.demo.api.IUserController;
import org.csits.demo.domain.SysUser;
import org.csits.demo.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController implements IUserController {

    @Autowired
    SysUserService sysUserService;

    @Autowired
    private MessageSource messageSource;
    @GetMapping("/list")
    @Override
    public List<SysUser> getUserList() {
        return sysUserService.list();
    }
}
