package org.csits.demo.module.sys.service.imp;

import org.csits.demo.module.sys.entity.SysAnnouncement;
import org.csits.demo.module.sys.mapper.SysAnnouncementMapper;
import org.csits.demo.module.sys.service.ISysAnnouncementService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统通告表 服务实现类
 * </p>
 *
 * @author lhf
 * @since 2023-03-25
 */
@Service
public class SysAnnouncementServiceImpl extends ServiceImpl<SysAnnouncementMapper, SysAnnouncement> implements ISysAnnouncementService {

}
