package com.pattern.factory.factorymethod.factorymethod;

import com.pattern.factory.factorymethod.ICourse;

/**
 * Created by wangzhengpeng
 */
public class FactoryMethodTest {

    public static void main(String[] args) {

        ICourseFactory factory = new PythonCourseFactory();
        ICourse course = factory.create();
        course.record();

        factory = new JavaCourseFactory();
        course = factory.create();
        course.record();


    }

}
