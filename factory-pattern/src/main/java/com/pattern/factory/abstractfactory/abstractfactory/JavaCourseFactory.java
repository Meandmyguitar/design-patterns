package com.pattern.factory.abstractfactory.abstractfactory;

import com.pattern.factory.abstractfactory.INote;
import com.pattern.factory.abstractfactory.IVideo;
import com.pattern.factory.abstractfactory.JavaNote;
import com.pattern.factory.abstractfactory.JavaVideo;

/**
 * Created by wangzhengpeng
 */
public class JavaCourseFactory extends CourseFactory {

    public INote createNote() {
        super.init();
        return new JavaNote();
    }

    public IVideo createVideo() {
        super.init();
        return new JavaVideo();
    }
}
