package com.bhh.design.creational.abstractfactory;

import lombok.extern.slf4j.Slf4j;

/**
 * @author bhh
 * @description 应用层
 * @date Created in 2021-04-20 14:26
 * @modified By
 */
@Slf4j
public class Test {
    public static void main(String[] args) {
        CourseFactory factory = new JavaCourseFactory();
        factory.getNote().getNotes();
        factory.getVideo().getVideo();
        factory = new PythonCourseFactory();
        factory.getNote().getNotes();
        factory.getVideo().getVideo();
    }
}
