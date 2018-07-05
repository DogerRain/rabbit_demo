package cn.bj.rabbitmqdemo.receive;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author liuboren
 * @Title:消息接受者
 * @Description:
 * @date 2018/6/27 14:54
 */
@Component
@RabbitListener(queues = "hello")
public class Receive {

    @RabbitHandler
    public void process(String hello){
        System.out.println("Receiver:"+hello);
    }
}
