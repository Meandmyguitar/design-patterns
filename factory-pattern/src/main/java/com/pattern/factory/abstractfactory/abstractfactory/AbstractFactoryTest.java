package com.pattern.factory.abstractfactory.abstractfactory;

/**
 * Created by wangzhengpeng
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {

        JavaCourseFactory factory = new JavaCourseFactory();

        factory.createNote().edit();
        factory.createVideo().record();

    }

}
