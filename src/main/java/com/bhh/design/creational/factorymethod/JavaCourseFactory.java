package com.bhh.design.creational.factorymethod;

import lombok.extern.slf4j.Slf4j;

/**
 * @author bhh
 * @description TODO
 * @date Created in 2021-04-20 11:06
 * @modified By
 */
@Slf4j
public class JavaCourseFactory extends CourseFactory {
    @Override
    public ICourse getCourse() {
        return new JavaCourse();
    }
}
