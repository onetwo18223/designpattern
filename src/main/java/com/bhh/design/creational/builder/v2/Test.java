package com.bhh.design.creational.builder.v2;

import lombok.extern.slf4j.Slf4j;

/**
 * @author bhh
 * @description 应用层
 * @date Created in 2021-04-20 19:22
 * @modified By
 */
@Slf4j
public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buildCourseName("JAVA从入门到放弃")
                .buildCourseNote("没有笔记")
                .buildCoursePrice(99999.99)
                .buildCourseVideo("没有视频, 自己想象")
                .make();

        System.out.println(course);
    }
}
