package com.bhh.design.creational.factorymethod;

import lombok.extern.slf4j.Slf4j;

/**
 * @author bhh
 * @description 接口实现
 * @date Created in 2021-04-20 9:22
 * @modified By
 */
@Slf4j
public class PythonCourse implements ICourse {

    @Override
    public void getCourse() {
        System.out.println("正在获取Python课程");
    }
}
