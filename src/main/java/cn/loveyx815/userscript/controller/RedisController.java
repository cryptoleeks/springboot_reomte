package cn.loveyx815.userscript.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import redis.clients.jedis.Jedis;

@Controller
@RequestMapping("/redis")
public class RedisController {

    @Autowired
    private RedisTemplate redisTemplate=null;

    @Autowired
    private StringRedisTemplate stringRedisTemplate=null;

    @RequestMapping("/string")
    @ResponseBody
    public Object testString(){
        redisTemplate.opsForValue().set("key1","value1");
        redisTemplate.opsForValue().set("key2","1");
        stringRedisTemplate.opsForValue().set("key3","value1");
        stringRedisTemplate.opsForValue().set("key4","1");
        Jedis jedis = (Jedis) stringRedisTemplate.getConnectionFactory().getConnection().getNativeConnection();

        return redisTemplate.opsForValue().get("key1")+"\n"+stringRedisTemplate.opsForValue().get("key3");

    }
}
