package com.bhh.design.creational.simplefactory;

import lombok.extern.slf4j.Slf4j;
import sun.security.jca.GetInstance;

/**
 * @author bhh
 * @description TODO
 * @date Created in 2021-04-20 9:39
 * @modified By
 */
@Slf4j
public class CourseFactoryMore extends CourseFactory{
    @Override
    public ICourse getCourse(String str) {
        if ("java".equalsIgnoreCase(str)) {
            return new JavaCourse();
        } else if ("python".equalsIgnoreCase(str)) {
            return new PythonCourse();
        } else if ("c".equalsIgnoreCase(str)){
            return new PythonCourse();
        } else {
            return null;
        }
    }
}
