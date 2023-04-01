package org.csits.demo.module.sys.service.imp;

import org.csits.demo.module.sys.entity.SysFiles;
import org.csits.demo.module.sys.mapper.SysFilesMapper;
import org.csits.demo.module.sys.service.ISysFilesService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 知识库-文档管理 服务实现类
 * </p>
 *
 * @author lhf
 * @since 2023-04-01
 */
@Service
public class SysFilesServiceImpl extends ServiceImpl<SysFilesMapper, SysFiles> implements ISysFilesService {

}
