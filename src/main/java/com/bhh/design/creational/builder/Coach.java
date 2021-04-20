package com.bhh.design.creational.builder;

import lombok.extern.slf4j.Slf4j;

/**
 * @author bhh
 * @description 教练类, 用于封装 CourseBuilder
 * @date Created in 2021-04-20 16:00
 * @modified By
 */
@Slf4j
public class Coach {
    private CourseAbstractBuilder courseAbstractBuilder;

    public Coach(CourseAbstractBuilder courseAbstractBuilder) {
        this.courseAbstractBuilder = courseAbstractBuilder;
    }

    public Course getCourse(String courseName, String courseNote, String courseVideo,
                            Double coursePrice, String courseQA){
        courseAbstractBuilder.buildCourseName(courseName);
        courseAbstractBuilder.buildCourseNote(courseNote);
        courseAbstractBuilder.buildCourseVideo(courseVideo);
        courseAbstractBuilder.buildCoursePrice(coursePrice);
        courseAbstractBuilder.buildCourseQA(courseQA);

        return courseAbstractBuilder.makeCourse();
    }
}
