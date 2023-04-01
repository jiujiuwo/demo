package org.csits.demo.module.sys.service.imp;

import org.csits.demo.module.sys.entity.SysLog;
import org.csits.demo.module.sys.mapper.SysLogMapper;
import org.csits.demo.module.sys.service.ISysLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统日志表 服务实现类
 * </p>
 *
 * @author lhf
 * @since 2023-04-01
 */
@Service
public class SysLogServiceImpl extends ServiceImpl<SysLogMapper, SysLog> implements ISysLogService {

}
