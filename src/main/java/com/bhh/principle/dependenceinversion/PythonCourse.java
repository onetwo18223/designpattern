package com.bhh.principle.dependenceinversion;

import lombok.extern.slf4j.Slf4j;

/**
 * @author bhh
 * @description 接口实现类
 * @date Created in 2021-04-19 20:05
 * @modified By
 */
@Slf4j
public class PythonCourse implements ICourse{

    @Override
    public void studyCourse() {
        System.out.println("学习了Python课程");
    }
}
