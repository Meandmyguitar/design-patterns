package com.pattern.chain.auth.optimiaze;


import com.pattern.chain.auth.Member;

/**
 * Created by wangzhengpeng
 */
public class MemberService {

    public void login(String loginName,String loginPass){
        Handler validateHandler = new ValidateHandler();
        Handler loginHandler = new LoginHandler();
        Handler authHandler = new AuthHandler();

        validateHandler.next(loginHandler);
        loginHandler.next(authHandler);

        validateHandler.doHandler(new Member(loginName,loginPass));

    }

}
