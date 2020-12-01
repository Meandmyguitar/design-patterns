package com.pattern.chain.auth.builderchain;

import com.pattern.chain.auth.Member;

/**
 * Created by wangzhengpeng
 */
public class LoginHandler extends Handler {
    public void doHandler(Member member) {
        System.out.println("登录成功！");
        member.setRoleName("管理员");
        if(null != next) {
            next.doHandler(member);
        }
    }
}
