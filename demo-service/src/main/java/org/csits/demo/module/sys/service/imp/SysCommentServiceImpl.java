package org.csits.demo.module.sys.service.imp;

import org.csits.demo.module.sys.entity.SysComment;
import org.csits.demo.module.sys.mapper.SysCommentMapper;
import org.csits.demo.module.sys.service.ISysCommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统评论回复表 服务实现类
 * </p>
 *
 * @author lhf
 * @since 2023-04-01
 */
@Service
public class SysCommentServiceImpl extends ServiceImpl<SysCommentMapper, SysComment> implements ISysCommentService {

}
