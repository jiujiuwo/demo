package org.csits.demo.module.sys.service.imp;

import org.csits.demo.module.sys.entity.SysRole;
import org.csits.demo.module.sys.mapper.SysRoleMapper;
import org.csits.demo.module.sys.service.ISysRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色表 服务实现类
 * </p>
 *
 * @author lhf
 * @since 2023-04-01
 */
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements ISysRoleService {

}
