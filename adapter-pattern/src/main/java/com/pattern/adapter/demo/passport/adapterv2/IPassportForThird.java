package com.pattern.adapter.demo.passport.adapterv2;

import com.pattern.adapter.demo.passport.ResultMsg;

/**
 * Created by wangzhengpeng
 */
public interface IPassportForThird {

    ResultMsg loginForQQ(String openId);

    ResultMsg loginForWechat(String openId);

    ResultMsg loginForToken(String token);

    ResultMsg loginForTelphone(String phone, String code);

}
