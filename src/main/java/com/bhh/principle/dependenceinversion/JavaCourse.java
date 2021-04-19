package com.bhh.principle.dependenceinversion;

import lombok.extern.slf4j.Slf4j;

/**
 * @author bhh
 * @description ICourse接口实现类
 * @date Created in 2021-04-19 20:04
 * @modified By
 */
@Slf4j
public class JavaCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("学习了java课程");
    }
}
