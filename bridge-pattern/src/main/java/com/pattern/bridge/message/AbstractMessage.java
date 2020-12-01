package com.pattern.bridge.message;

/**
 * Created by wangzhengpeng
 */
public abstract class AbstractMessage {

    private IMessage message;

    public AbstractMessage(IMessage message) {
        this.message = message;
    }

    void sendMessage(String message,String toUser){
        this.message.send(message,toUser);
    }
}
