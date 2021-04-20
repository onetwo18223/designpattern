package com.bhh.design.creational.simplefactory;

import lombok.extern.slf4j.Slf4j;

/**
 * @author bhh
 * @description 课程简单工厂
 * @date Created in 2021-04-20 9:25
 * @modified By
 */
@Slf4j
public class CourseFactory {
    public ICourse getCourse(String str) {
        if ("java".equalsIgnoreCase(str)) {
            return new JavaCourse();
        } else if ("python".equalsIgnoreCase(str)) {
            return new PythonCourse();
        } else {
            return null;
        }
    }
}
