package com.bhh.design.creational.builder;

import lombok.extern.slf4j.Slf4j;

/**
 * @author bhh
 * @description 应用层
 * @date Created in 2021-04-20 16:03
 * @modified By
 */
@Slf4j
public class Test {
    public static void main(String[] args) {
        CourseAbstractBuilder builder = new CourseBuilder();
        Coach coach = new Coach(builder);
        Course course = coach.getCourse("JAVA设计模式", "没有笔记",
                "没有视频", 999.9, "有问题但不会回答");
        System.out.println(course);
    }
}
