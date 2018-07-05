package cn.bj.rabbitmqdemo.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author liuboren
 * @Title:Rabbit配置类
 * @Description:
 * @date 2018/6/27 14:57
 */
@Configuration
public class RabbitConfig {
    public final static String QUEUE_NAME = "hello";

    @Bean
    public Queue helloQueue(){
      return new Queue(QUEUE_NAME);
    }

}
