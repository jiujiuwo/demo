package org.csits.demo.quartz;

import org.csits.demo.module.sys.entity.SysUser;
import org.csits.demo.module.sys.service.ISysUserService;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.UUID;

public class MyDemoSchedule extends QuartzJobBean {

    @Autowired
    private ISysUserService sysUserService;

    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        SysUser sysUser = new SysUser();
        sysUser.setId(UUID.randomUUID().toString().replaceAll("-", ""));
        sysUser.setUsername(UUID.randomUUID().toString().replaceAll("-", ""));
        sysUserService.save(sysUser);
    }
}
