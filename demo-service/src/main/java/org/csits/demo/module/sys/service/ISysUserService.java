package org.csits.demo.module.sys.service;

import org.csits.demo.module.sys.entity.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author lhf
 * @since 2023-03-25
 */
public interface ISysUserService extends IService<SysUser> , UserDetailsService {

}
