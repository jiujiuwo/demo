package demo;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.csits.demo.DemoApplication;
import org.csits.demo.api.qo.SysUserQo;
import org.csits.demo.module.sys.entity.SysUser;
import org.csits.demo.module.sys.mapper.SysUserMapper;
import org.csits.demo.module.sys.service.ISysUserService;
import org.csits.demo.util.UuidUtils;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

@SpringBootTest(classes = DemoApplication.class)
@RunWith(SpringRunner.class)
class DemoApplicationTests {

    @Autowired
    ISysUserService sysUserService;
    @Autowired
    SysUserMapper sysUserMapper;

    @Test
    void contextLoads() {
        SysUser sysUser = new SysUser();
        sysUser.setId(UUID.randomUUID().toString().replace("-", ""));
        sysUserService.save(sysUser);
    }

    @Test
    void contextLoads2() {
        SysUser sysUser = new SysUser();
        Page<SysUser> page = new Page<>();
        SysUserQo sysUserQo = new SysUserQo();
        sysUser.setId("803ccd6d830140e59b1a7bed48d6abe8");
        sysUserQo.setCondition(sysUser);
        sysUserQo.setPage(page);
        Page<SysUser> result = sysUserService.page(page);
        System.out.println(result.getRecords());
    }

    @Test
    void testPassword() {
        SysUser sysUser = new SysUser();
        sysUser.setUsername("lihaifeng");
        sysUser.setPassword("lihaifeng");
        sysUser.setId(UuidUtils.getUUID());
        sysUserService.save(sysUser);
    }
}
