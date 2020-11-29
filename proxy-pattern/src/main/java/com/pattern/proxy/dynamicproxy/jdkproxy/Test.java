package com.pattern.proxy.dynamicproxy.jdkproxy;

public class Test {

    public static void main(String[] args) {
        JdkMeipo jdkMeipo = new JdkMeipo();
        IPerson zhangSan = jdkMeipo.getInstance(new ZhangSan());
        zhangSan.findLove();
        zhangSan.buyInsure();

        IPerson zhaoSiMiss = jdkMeipo.getInstance(new ZhaoSiMiss());
        zhaoSiMiss.findLove();

    }
}
