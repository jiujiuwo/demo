package org.csits.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.csits.demo.domain.SysUser;
import org.csits.demo.mapper.SysUserMapper;
import org.csits.demo.service.SysUserService;
import org.springframework.stereotype.Service;

/**
* @author lhf
* @description 针对表【sys_user(用户表)】的数据库操作Service实现
* @createDate 2023-02-11 16:06:53
*/
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser>
    implements SysUserService{

}




