package com.pattern.mediator.rpc;

/**
 * Created by wangzhengpeng
 */
public class BService implements IService{
    Registy registy;
    BService(){
        registy.regist("bService",this);
    }
}
