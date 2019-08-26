package cn.loveyx815.userscript.service;


public interface ActiveMqService {

    //发送消息
    public void sendMsg(String message);
//    接收消息
    public void receiveMsg(String message);
}
