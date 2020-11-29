package com.pattern.adapter.demo.power.classadapter;

/**
 * 不符合最小知道原则
 */
public class Test {
    public static void main(String[] args) {
        DC5 adapter = new PowerAdapter();
        adapter.output5V();
    }
}
