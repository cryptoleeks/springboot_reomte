package cn.loveyx815.userscript.service;

import org.springframework.stereotype.Service;

import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

@ServerEndpoint("/ws")
@Service
public class WebSocketServiceImpl implements  WebSocketService {
     private  static  int onlineCout=0;

     private static CopyOnWriteArraySet<WebSocketServiceImpl> webSocketSet=new CopyOnWriteArraySet<>();

     private Session session;

     @OnOpen
    public void onOpen(Session session){
         this.session=session;
         webSocketSet.add(this);
         addOnlineCount();
         System.out.println("有新连接加入：当前在线人数"+getOnlineCount());
     }

     @OnMessage
     public void OnMessage(String message,Session session){
         System.out.println("来自客户端消息："+message);
        //群发消息
         for (WebSocketServiceImpl item:webSocketSet){
             try {
                 String username=item.session.getUserPrincipal().getName();
                 System.out.println(username);
             }
             catch (Exception e){
                 e.printStackTrace();
             }
         }
     }

     @OnError
     public void OnError(Session session,Throwable throwable){
         System.out.println("ERROR!");
         throwable.printStackTrace();
     }

    /** 发送消息
    * @Description:
    * @Param:
    * @return:
    * @Author: Yonggang Shi
    * @Date: 2019/8/26 0026
    */
     private  void sendMessage(String message) throws IOException{
         this.session.getBasicRemote().sendText(message);
     }


     //同步方法线程安全
    private static synchronized int  getOnlineCount() {
         return onlineCout;
    }

    private  static synchronized void addOnlineCount() {
     WebSocketServiceImpl.onlineCout++;
     }
    private  static synchronized void subOnlineCount() {
        WebSocketServiceImpl.onlineCout--;
    }

}

