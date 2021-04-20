package com.bhh.design.creational.simplefactory;

import lombok.extern.slf4j.Slf4j;

/**
 * @author bhh
 * @description TODO
 * @date Created in 2021-04-20 9:21
 * @modified By
 */
@Slf4j
public class JavaCourse implements ICourse {

    @Override
    public void getCourse() {
        System.out.println("正在获取JAVA课程");
    }
}
