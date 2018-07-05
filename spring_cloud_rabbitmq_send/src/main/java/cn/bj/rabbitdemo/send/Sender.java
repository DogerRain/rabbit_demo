package cn.bj.rabbitdemo.send;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author liuboren
 * @Title:消息发送者
 * @Description:
 * @date 2018/6/27 14:40
 */
@Component
public class Sender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(){
        String context = "hello"+ new Date();
        System.out.println("Sender :"+ context);
        this.rabbitTemplate.convertAndSend("hello",context);
    }

}
