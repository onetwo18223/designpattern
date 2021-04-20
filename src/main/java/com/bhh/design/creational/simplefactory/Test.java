package com.bhh.design.creational.simplefactory;

import lombok.extern.slf4j.Slf4j;

/**
 * @author bhh
 * @description 应用层, 高层模块
 * @date Created in 2021-04-20 9:22
 * @modified By
 */
@Slf4j
public class Test {
    public static void main(String[] args) {
        // v1
//        ICourse course = new JavaCourse();
//        course.getCourse();
        CourseFactory factory = new CourseFactory();
        ICourse java = factory.getCourse("java");
        java.getCourse();
    }
}
