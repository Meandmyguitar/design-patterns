package com.pattern.proxy.staticproxy;

public class Father implements IDoSomething {

    private ZhangSan zhangsan;

    public Father(ZhangSan zhangsan) {
        this.zhangsan = zhangsan;
    }

    public void findLove() {
        System.out.println("张老三开始物色");
        zhangsan.findLove();
        System.out.println("开始交往");
    }

}
