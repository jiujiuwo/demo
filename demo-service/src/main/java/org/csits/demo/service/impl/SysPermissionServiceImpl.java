package org.csits.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.csits.demo.domain.SysPermission;
import org.csits.demo.mapper.SysPermissionMapper;
import org.csits.demo.service.SysPermissionService;
import org.springframework.stereotype.Service;

/**
* @author lhf
* @description 针对表【sys_permission(菜单权限表)】的数据库操作Service实现
* @createDate 2023-02-11 19:13:34
*/
@Service
public class SysPermissionServiceImpl extends ServiceImpl<SysPermissionMapper, SysPermission>
    implements SysPermissionService{

}




