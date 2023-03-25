package org.csits.demo.module.sys.service.imp;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.commons.lang3.ObjectUtils;
import org.csits.demo.module.sys.entity.SysUser;
import org.csits.demo.module.sys.entity.custom.CustomSysUser;
import org.csits.demo.module.sys.mapper.SysUserMapper;
import org.csits.demo.module.sys.service.ISysUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Locale;

import static org.csits.demo.config.ApplicationConfiguration.LOCALE;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author lhf
 * @since 2023-03-25
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

    @Autowired
    private MessageSource messageSource;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        LambdaQueryWrapper<SysUser> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(SysUser::getUsername, username);
        SysUser sysUser = baseMapper.selectOne(lambdaQueryWrapper);
        if (ObjectUtils.isEmpty(sysUser)) {
            throw new UsernameNotFoundException(messageSource.getMessage("001", null, new Locale(LOCALE)));
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
