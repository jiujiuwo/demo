package org.csits.demo.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import org.csits.demo.api.qo.SysUserQo;
import org.csits.demo.domain.SysUser;

/**
 * @author lhf
 * @description 针对表【sys_user(用户表)】的数据库操作Service
 * @createDate 2023-02-11 16:06:53
 */
public interface SysUserService extends IService<SysUser> {

    Page<SysUser> selectPageVo(SysUserQo sysUserQo);

}
