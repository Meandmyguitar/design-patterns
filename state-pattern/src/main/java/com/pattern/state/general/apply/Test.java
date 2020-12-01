package com.pattern.state.general.apply;

/**
 * Created by wangzhengpeng.
 */
public class Test {
    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new ConcreteStateA());
        context.handle();
    }
}
