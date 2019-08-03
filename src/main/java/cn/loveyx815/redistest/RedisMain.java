package cn.loveyx815.redistest;

import cn.loveyx815.redistest.listener.RedisMessageListener;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.listener.ChannelTopic;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.data.redis.listener.Topic;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.stereotype.Repository;

@SpringBootApplication(scanBasePackages = "cn.loveyx815.redistest")
@MapperScan(basePackages ="cn.loveyx815.redistest",annotationClass = Repository.class)
public class RedisMain {
    public static void main(String[] args) {
        SpringApplication.run(RedisMain.class, args);
    }

    //RedisTemplate
    @Autowired
    private StringRedisTemplate redisTemplate =null;

    //Redis连接工厂
    @Qualifier("RedisconnectionFactory")
    @Autowired
    private RedisConnectionFactory connectionFactory =null;

    //Redis消息监听器
    @Autowired
    private MessageListener messageListener =null;

    //任务池
    private ThreadPoolTaskScheduler taskScheduler=null;

    /**
     * 创建任务池，运行线程等待处理Redis消息
     *  @return
     */
    @Bean
    public ThreadPoolTaskScheduler initTaskScheduler(){
        if (taskScheduler != null){
            return taskScheduler;
        }
        taskScheduler =new ThreadPoolTaskScheduler();
        taskScheduler.setPoolSize(30);
        return taskScheduler;
    }

    @Bean
    public RedisMessageListenerContainer initRedisContainer(){
        RedisMessageListenerContainer container =new RedisMessageListenerContainer();
        //Redis连接工厂
        container.setConnectionFactory(connectionFactory);
        //设置任务池
        container.setTaskExecutor(initTaskScheduler());
        //定义监听渠道，名称为topic
        Topic topic =new ChannelTopic("topic1");
        //使用监听器监听Redis的消息
        container.addMessageListener(messageListener,topic);
        return  container;
    }

}
