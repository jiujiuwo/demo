package org.csits.demo.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.csits.demo.domain.SysUser;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Tag(name = "用户管理接口", description = "用户的增删改查操作")
public interface IUserController {
    @GetMapping("/list")
    @Operation(description = "获取用户列表")
    List<SysUser> getUserList();
}
