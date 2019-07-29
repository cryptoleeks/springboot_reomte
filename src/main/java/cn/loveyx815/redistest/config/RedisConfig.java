package cn.loveyx815.redistest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import redis.clients.jedis.JedisPoolConfig;

@Configuration
public class RedisConfig {

    private RedisConnectionFactory connectionFactory =null;

    @Bean(name = "RedisconnectionFactory")
    public RedisConnectionFactory initRedisConnectionFactory(){
        if (this.connectionFactory!=null){
            return  this.connectionFactory;

        }
        JedisPoolConfig poolConfig=new JedisPoolConfig();
        //最大空闲树
        poolConfig.setMaxIdle(30);
        //最大连接数
        poolConfig.setMaxTotal(50);
        //最大等待树s
        poolConfig.setMaxWaitMillis(2000);
        //创建连接工厂
        JedisConnectionFactory connectionFactory=new JedisConnectionFactory(poolConfig);
        //获取单机的Redis配置
        RedisStandaloneConfiguration rsCfg=connectionFactory.getStandaloneConfiguration();
        connectionFactory.setHostName("127.0.0.1");
        connectionFactory.setPort(6379);
        //connectionFactory.setPassword("root");
        this.connectionFactory=connectionFactory;
        return  connectionFactory;
    }
    @Bean(name="redisTemplate")
    public RedisTemplate<Object,Object> initRedisTemplate(){
        RedisTemplate<Object,Object> redisTemplate =new RedisTemplate<>();
        redisTemplate.setConnectionFactory(initRedisConnectionFactory());
        return redisTemplate;
    }
}
