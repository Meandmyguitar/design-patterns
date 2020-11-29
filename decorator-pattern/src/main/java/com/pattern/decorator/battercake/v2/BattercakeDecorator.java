package com.pattern.decorator.battercake.v2;

public class BattercakeDecorator extends Battercake {

    //装饰器持有对象
    private Battercake battercake;

    public BattercakeDecorator(Battercake battercake) {
        this.battercake = battercake;
    }

    protected String getMsg() {
        return this.battercake.getMsg();
    }

    public int getPrice() {
        return this.battercake.getPrice();
    }

}
