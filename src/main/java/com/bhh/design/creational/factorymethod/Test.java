package com.bhh.design.creational.factorymethod;

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
        CourseFactory factory = new JavaCourseFactory();
        factory.getCourse().getCourse();
        factory = new PythonCourseFactory();
        factory.getCourse().getCourse();
    }
}
