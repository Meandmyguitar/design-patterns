package com.pattern.adapter.demo.passport.adapterv2.adapters;

import com.pattern.adapter.demo.passport.ResultMsg;

/**
 * Created by wangzhengpeng
 */
public interface ILoginAdapter {
    boolean support(Object object);
    ResultMsg login(String id,Object adapter);
}
