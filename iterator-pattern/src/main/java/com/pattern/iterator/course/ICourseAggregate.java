package com.pattern.iterator.course;

/**
 * Created by wangzhengpeng
 */
public interface ICourseAggregate {
    void add(Course course);
    void remove(Course course);
    Iterator<Course> iterator();
}
