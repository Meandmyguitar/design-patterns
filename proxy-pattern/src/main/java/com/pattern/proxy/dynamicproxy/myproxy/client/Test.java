package com.pattern.proxy.dynamicproxy.myproxy.client;

public class Test {

    public static void main(String[] args) {
        MyMeipo myMeipo = new MyMeipo();
        IPerson zhangsan = myMeipo.getInstance(new Zhangsan());
        zhangsan.findLove();

        //        IPerson zhaoliu = jdkMeipo.getInstance(new ZhaoLiu());
        //        zhaoliu.findLove();
        //        zhaoliu.buyInsure();

    }
}
