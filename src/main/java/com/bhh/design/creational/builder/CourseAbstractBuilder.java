package com.bhh.design.creational.builder;

import lombok.extern.slf4j.Slf4j;

/**
 * @author bhh
 * @description CourseBuilder 抽象构造类
 * @date Created in 2021-04-20 15:53
 * @modified By
 */
@Slf4j
public abstract class CourseAbstractBuilder {
    Course course = new Course();
    public abstract void buildCourseName(String courseName);
    public abstract void buildCourseNote(String courseNote);
    public abstract void buildCourseVideo(String courseVideo);
    public abstract void buildCoursePrice(Double coursePrice);
    public abstract void buildCourseQA(String courseQA);

    public abstract Course makeCourse();
}
