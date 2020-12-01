package com.pattern.adapter.demo.passport.adapterv2.adapters;

import com.pattern.adapter.demo.passport.ResultMsg;

/**
 * Created by wangzhengpeng
 */
public class LoginForTelAdapter extends AbstractAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTelAdapter;
    }

    public ResultMsg login(String id, Object adapter) {
        return super.loginForRegister(id,null);
    }

}
