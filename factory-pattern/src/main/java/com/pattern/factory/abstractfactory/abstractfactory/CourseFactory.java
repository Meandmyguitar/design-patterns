package com.pattern.factory.abstractfactory.abstractfactory;

import com.pattern.factory.abstractfactory.INote;
import com.pattern.factory.abstractfactory.IVideo;

/**
 * 抽象工厂是用户的主入口
 * 在Spring中应用得最为广泛的一种设计模式
 * 易于扩展
 * Created by wangzhengpeng
 */
public abstract class CourseFactory {

    public void init(){
        System.out.println("初始化基础数据");
    }

    protected abstract INote createNote();

    protected abstract IVideo createVideo();

}
