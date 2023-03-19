package demo;

import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.core.util.JsonUtils;
import org.csits.demo.DemoApplication;
import org.csits.demo.service.impl.MyRestTemplteService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.TimeUnit;

@SpringBootTest(classes = DemoApplication.class,webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@RunWith(SpringRunner.class)
@Slf4j
@ActiveProfiles("default")
public class SpringDataRedisTest {

    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    MyRestTemplteService myRestTemplteService;

    @Test
    public void testRedis() {
        System.out.println(redisTemplate.getDefaultSerializer());
        redisTemplate.opsForValue().set("name", "李海风", 200, TimeUnit.SECONDS);
        String result = (String) redisTemplate.opsForValue().get("name");
        System.out.println(result);
    }

    @Test
    public void testRestTemplate() {
        Object object = myRestTemplteService.getForObject("/", Object.class);
        log.info(object.toString());
    }

}
