package com.pattern.proxy.staticproxy;

public class Test {

    public static void main(String[] args) {
        Father father = new Father(new ZhangSan());
        father.findLove();

    }

}
