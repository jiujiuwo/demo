package org.csits.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.csits.demo.domain.SysRole;
import org.csits.demo.service.SysRoleService;
import org.csits.demo.mapper.SysRoleMapper;
import org.springframework.stereotype.Service;

/**
* @author lhf
* @description 针对表【sys_role(角色表)】的数据库操作Service实现
* @createDate 2023-02-11 19:03:55
*/
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole>
    implements SysRoleService{

}




