package cn.bj.rabbitdemo.controller;

import cn.bj.rabbitdemo.send.Sender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author liuboren
 * @Title:
 * @Description:
 * @date 2018/6/27 15:36
 */
@RestController
public class SendController {

    @Resource
    private Sender sender;

    @GetMapping("send")
    public void send(){
        sender.send();

    }
}
