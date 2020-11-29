package com.pattern.factory.factorymethod.factorymethod;

import com.pattern.factory.factorymethod.ICourse;
import com.pattern.factory.factorymethod.PythonCourse;

/**
 * Created by Tom.
 */
public class PythonCourseFactory implements ICourseFactory {

    public ICourse create() {
        return new PythonCourse();
    }
}
