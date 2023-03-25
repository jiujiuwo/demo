package org.csits.demo.module.sys.service.imp;

import org.csits.demo.module.sys.entity.SysCategory;
import org.csits.demo.module.sys.mapper.SysCategoryMapper;
import org.csits.demo.module.sys.service.ISysCategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lhf
 * @since 2023-03-25
 */
@Service
public class SysCategoryServiceImpl extends ServiceImpl<SysCategoryMapper, SysCategory> implements ISysCategoryService {

}
