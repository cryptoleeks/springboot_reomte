package cn.loveyx815.userscript.controller;

import cn.loveyx815.userscript.service.ActiveMqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MqController {
    @Autowired
    private ActiveMqService service=null;
    @GetMapping("/send")
    public Object sendMsg(){
        service.sendMsg("我发送的-------");
        return "200";
    }
    public  Object receiveMsg(){
        //service.receiveMsg();
        return null;
    }
}
