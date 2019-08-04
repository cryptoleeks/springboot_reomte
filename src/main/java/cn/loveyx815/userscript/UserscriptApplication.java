package cn.loveyx815.userscript;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;

import javax.annotation.PostConstruct;

@SpringBootApplication(scanBasePackages = {"cn.loveyx815.userscript.* "})
@MapperScan("cn.loveyx815.userscript.dao")
@EnableCaching
public class UserscriptApplication {

    @Autowired
    private RedisTemplate redisTemplate=null;

    //定义自定义初始化
    @PostConstruct
    public void init(){
        initRedisTemplate();
    }
    private void initRedisTemplate(){
        RedisSerializer stringSerializer=redisTemplate.getStringSerializer();
        redisTemplate.setKeySerializer(stringSerializer);
        redisTemplate.setHashKeySerializer(stringSerializer);
    }
    public static void main(String[] args) {
        SpringApplication.run(UserscriptApplication.class, args);
    }

}
