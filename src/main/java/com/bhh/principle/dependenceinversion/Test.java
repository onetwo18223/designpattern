package com.bhh.principle.dependenceinversion;

import lombok.extern.slf4j.Slf4j;

/**
 * @author bhh
 * @description 高层模块, 调用者
 * @date Created in 2021-04-19 19:55
 * @modified By
 */
@Slf4j
public class Test {
    public static void main(String[] args) {
        // v1
//        Bhh bhh = new Bhh();
//        bhh.studyJava();
//        bhh.studyPython();

        // v2
//        Bhh bhh = new Bhh();
//        bhh.study(new JavaCourse());
//        bhh.study(new PythonCourse());

        Bhh bhh = new Bhh();
        bhh.setiCourse(new JavaCourse());
        bhh.study();

        bhh.setiCourse(new PythonCourse());
        bhh.study();
    }
}
