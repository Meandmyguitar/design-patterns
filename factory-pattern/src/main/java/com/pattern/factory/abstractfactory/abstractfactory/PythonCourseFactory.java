package com.pattern.factory.abstractfactory.abstractfactory;

import com.pattern.factory.abstractfactory.INote;
import com.pattern.factory.abstractfactory.IVideo;
import com.pattern.factory.abstractfactory.PythonNote;
import com.pattern.factory.abstractfactory.PythonVideo;

/**
 * Created by Tom.
 */
public class PythonCourseFactory extends CourseFactory {

    public INote createNote() {
        super.init();
        return new PythonNote();
    }


    public IVideo createVideo() {
        super.init();
        return new PythonVideo();
    }
}
