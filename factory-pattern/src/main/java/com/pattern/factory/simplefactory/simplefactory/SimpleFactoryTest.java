package com.pattern.factory.simplefactory.simplefactory;

import com.pattern.factory.simplefactory.ICourse;
import com.pattern.factory.simplefactory.JavaCourse;
import com.pattern.factory.simplefactory.PythonCourse;

public class SimpleFactoryTest {

    public static void main(String[] args) {

        //        ICourse course = new JavaCourse();
        //        course.record();

        //        ICourseFactory factory = new ICourseFactory();
        //        ICourse course = factory.create("com.wzp.demo.pattern.factory.JavaCourse");
        //        course.record();

        CourseFactory factory = new CourseFactory();
        ICourse course = factory.create(JavaCourse.class);
        course.record();

        ICourse course1 = factory.create(PythonCourse.class);
        course1.record();

    }
}
