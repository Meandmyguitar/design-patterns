package com.pattern.chain.auth.optimiaze;

/**
 * Created by wangzhengpeng
 */
public class Test {
    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        memberService.login("tom","666");
    }
}
