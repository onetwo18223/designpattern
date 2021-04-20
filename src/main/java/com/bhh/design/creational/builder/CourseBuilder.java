package com.bhh.design.creational.builder;

import lombok.extern.slf4j.Slf4j;

/**
 * @author bhh
 * @description CourseBuilder 实现 抽象构造类
 * @date Created in 2021-04-20 15:57
 * @modified By
 */
@Slf4j
public class CourseBuilder extends CourseAbstractBuilder {
    @Override
    public void buildCourseName(String courseName) {
        this.course.setCourseName(courseName);
    }

    @Override
    public void buildCourseNote(String courseNote) {
        this.course.setCourseNote(courseNote);
    }

    @Override
    public void buildCourseVideo(String courseVideo) {
        this.course.setCourseVideo(courseVideo);
    }

    @Override
    public void buildCoursePrice(Double coursePrice) {
        this.course.setCoursePrice(coursePrice);
    }

    @Override
    public void buildCourseQA(String courseQA) {
        this.course.setCourseQA(courseQA);
    }

    @Override
    public Course makeCourse() {
        return this.course;
    }
}
