package com.pattern.adapter.demo.passport.adapterv2;

/**
 * Created by wangzhengpeng
 */
public class Test {
    public static void main(String[] args) {
        IPassportForThird adapter = new PassportForThirdAdapter();
        adapter.loginForQQ("sdfasdfasfasfas");
    }
}
