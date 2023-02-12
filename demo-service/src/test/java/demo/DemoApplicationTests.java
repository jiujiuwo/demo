package demo;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.csits.demo.DemoApplication;
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
        sysUserService.list().forEach(System.out::println);
        IPage<SysUser> page = new Page<>();
        page.setSize(2);
        page.setCurrent(3);
        sysUserMapper.selectPageVo(page);
    }
}
