package com.pattern.state.general.simple;

/**
 * Created by wangzhengpeng.
 */
public class Test {
    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new ConcreteStateB());
        context.handle();
    }
}
