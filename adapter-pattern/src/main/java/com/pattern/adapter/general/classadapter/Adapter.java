package com.pattern.adapter.general.classadapter;

/**
 * Created by wangzhengpeng
 */
public class Adapter extends Adaptee implements Target {
    public int request() {
        return super.specificRequest() / 10;
    }
}
