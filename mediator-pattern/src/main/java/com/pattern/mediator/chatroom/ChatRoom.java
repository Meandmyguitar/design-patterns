package com.pattern.mediator.chatroom;

/**
 * Created by wangzhengpeng
 */
public class ChatRoom {

    public void showMsg(User user,String msg){
        System.out.println("[" + user.getName() + "] : " + msg);
    }
}
