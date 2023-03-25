package org.csits.demo.module.sys.service.imp;

import org.csits.demo.module.sys.entity.SysPermission;
import org.csits.demo.module.sys.mapper.SysPermissionMapper;
import org.csits.demo.module.sys.service.ISysPermissionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 菜单权限表 服务实现类
 * </p>
 *
 * @author lhf
 * @since 2023-03-25
 */
@Service
public class SysPermissionServiceImpl extends ServiceImpl<SysPermissionMapper, SysPermission> implements ISysPermissionService {

}
