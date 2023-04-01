package org.csits.demo.module.sys.service.imp;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.apache.commons.lang3.ObjectUtils;
import org.csits.demo.module.sys.entity.SysUser;
import org.csits.demo.module.sys.entity.custom.CustomSysUser;
import org.csits.demo.module.sys.mapper.SysUserMapper;
import org.csits.demo.module.sys.service.ISysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.csits.demo.utils.MessageService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author lhf
 * @since 2023-04-01
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

    @Autowired
    private MessageService messageService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        LambdaQueryWrapper<SysUser> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(SysUser::getUsername, username);
        SysUser sysUser = baseMapper.selectOne(lambdaQueryWrapper);
        if (ObjectUtils.isEmpty(sysUser)) {
            throw new UsernameNotFoundException(messageService.getMessage("001"));
        }
        CustomSysUser customSysUser = new CustomSysUser();
        BeanUtils.copyProperties(sysUser, customSysUser);
        return customSysUser;
    }

    @Override
    public boolean save(SysUser entity) {
        PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        entity.setPassword(passwordEncoder.encode(entity.getPassword()));
        return super.save(entity);
    }
}
