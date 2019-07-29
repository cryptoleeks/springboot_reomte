package cn.loveyx815.redistest;

import cn.loveyx815.redistest.config.RedisConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;

public class RedisMain {
    public static void main(String[] args) {
        ApplicationContext ctx =new AnnotationConfigApplicationContext(RedisConfig.class);
        RedisTemplate redisTemplate=ctx.getBean(RedisTemplate.class);
        redisTemplate.opsForValue().set("key1","love");
        redisTemplate.opsForHash().put("hash","field","hlove");
    }
}
