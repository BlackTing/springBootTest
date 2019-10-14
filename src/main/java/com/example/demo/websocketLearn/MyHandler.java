package com.example.demo.websocketLearn;

import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

/**
 * 创建一个webSocket服务处理实例
 * 处理Text 消息类型
 */
public class MyHandler extends TextWebSocketHandler {

    @Override
    public void handleMessage(WebSocketSession session, WebSocketMessage<?> message){

    }

}
