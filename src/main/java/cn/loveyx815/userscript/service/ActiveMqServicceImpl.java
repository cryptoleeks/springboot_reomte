package cn.loveyx815.userscript.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class ActiveMqServicceImpl implements ActiveMqService {

    @Autowired
    private JmsTemplate jmsTemplate =null;
    @Override
    public void sendMsg(String message) {
        System.out.println("sendmsg:"+message);
        jmsTemplate.convertAndSend(message);
    }

    @Override
    @JmsListener(destination = "activemq.default.destination")
    public void receiveMsg(String message) {
        System.out.println("receivemsq:"+message);

    }
}
