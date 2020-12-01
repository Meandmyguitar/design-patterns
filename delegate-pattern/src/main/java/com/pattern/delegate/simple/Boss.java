package com.pattern.delegate.simple;

/**
 * Created by wangzhengpeng
 */
public class Boss {
    public void command(String task,Leader leader){
        leader.doing(task);
    }
}
