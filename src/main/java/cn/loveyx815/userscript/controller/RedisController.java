package cn.loveyx815.userscript.controller;

import cn.loveyx815.userscript.entity.User;
import cn.loveyx815.userscript.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import redis.clients.jedis.Jedis;
@CrossOrigin(origins = {"http://localhost", "null"})
@Controller
@RequestMapping("/redis")
public class RedisController {

    @Autowired
    private UserService service=null;
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
    @RequestMapping("/adduser")
    @ResponseBody
    public Object addUser(){
        User user=new User();
        user.setNote("note1");
        user.setUserName("tom");

        return service.insertUser(user);
    }

    @RequestMapping(value = "/getuser/{idstr}",method = RequestMethod.GET)
    @ResponseBody
    public Object getUser(@PathVariable String idstr){
        if (idstr.isEmpty())
            return "param error";
        Long id=Long.parseLong(idstr);
        return service.getUser(id);
    }
}
