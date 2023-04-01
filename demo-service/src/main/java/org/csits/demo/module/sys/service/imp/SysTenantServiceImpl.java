package org.csits.demo.module.sys.service.imp;

import org.csits.demo.module.sys.entity.SysTenant;
import org.csits.demo.module.sys.mapper.SysTenantMapper;
import org.csits.demo.module.sys.service.ISysTenantService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 多租户信息表 服务实现类
 * </p>
 *
 * @author lhf
 * @since 2023-04-01
 */
@Service
public class SysTenantServiceImpl extends ServiceImpl<SysTenantMapper, SysTenant> implements ISysTenantService {

}
