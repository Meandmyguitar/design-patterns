package com.pattern.factory.factorymethod.factorymethod;

import com.pattern.factory.factorymethod.ICourse;
import com.pattern.factory.factorymethod.JavaCourse;

/**
 * Created by wangzhengpeng
 */
public class JavaCourseFactory implements ICourseFactory {

    public ICourse create() {
        return new JavaCourse();
    }
}
