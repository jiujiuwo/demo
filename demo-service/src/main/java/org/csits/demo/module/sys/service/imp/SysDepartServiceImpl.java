package org.csits.demo.module.sys.service.imp;

import org.csits.demo.module.sys.entity.SysDepart;
import org.csits.demo.module.sys.mapper.SysDepartMapper;
import org.csits.demo.module.sys.service.ISysDepartService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 组织机构表 服务实现类
 * </p>
 *
 * @author lhf
 * @since 2023-03-25
 */
@Service
public class SysDepartServiceImpl extends ServiceImpl<SysDepartMapper, SysDepart> implements ISysDepartService {

}
