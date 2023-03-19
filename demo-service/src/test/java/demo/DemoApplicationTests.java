package demo;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.csits.demo.DemoApplication;
import org.csits.demo.api.qo.SysUserQo;
import org.csits.demo.domain.SysUser;
import org.csits.demo.mapper.SysUserMapper;
import org.csits.demo.service.SysUserService;
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
    SysUserService sysUserService;
    @Autowired
    SysUserMapper sysUserMapper;
    @Test
    void contextLoads() {
        SysUser sysUser = new SysUser();
        sysUser.setId(UUID.randomUUID().toString().replace("-",""));
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
        Page<SysUser> result = sysUserService.selectPageVo(sysUserQo);
        System.out.println(result.getRecords());
    }
}
