package demo;

import org.csits.demo.DemoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.TimeUnit;

@SpringBootTest(classes = DemoApplication.class)
@RunWith(SpringRunner.class)
public class SpringDataRedisTest {

    @Autowired
    RedisTemplate redisTemplate;

    @Test
    public void testRedis(){
        System.out.println(redisTemplate.getDefaultSerializer());
        redisTemplate.opsForValue().set("name","李海风",200, TimeUnit.SECONDS);
        String result  = (String) redisTemplate.opsForValue().get("name");
        System.out.println(result);
    }

}
