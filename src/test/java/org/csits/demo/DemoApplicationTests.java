package org.csits.demo;


import org.csits.demo.domain.SysUser;
import org.csits.demo.service.SysUserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = DemoApplication.class)
@RunWith(SpringRunner.class)
class DemoApplicationTests {

    @Autowired
    SysUserService sysUserService;

    @Test
    void contextLoads() {
        SysUser sysUser = new SysUser();
        sysUser.setId("456");
        sysUserService.save(sysUser);
        sysUserService.list().forEach(System.out::println);
    }

}
