package org.csits.demo.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.csits.demo.api.IUserController;
import org.csits.demo.api.qo.SysUserQo;
import org.csits.demo.domain.SysUser;
import org.csits.demo.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

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

    @GetMapping("/hello")
    public void testI18n(){
        messageSource.getMessage("200",null, LocaleContextHolder.getLocale());
    }

    @PostMapping("/listPage")
    @ResponseBody
    public Object listPage(@Validated @RequestBody SysUserQo sysUserQo){
        Page<SysUser> result = sysUserService.selectPageVo(sysUserQo);
        return result;
    }
}
