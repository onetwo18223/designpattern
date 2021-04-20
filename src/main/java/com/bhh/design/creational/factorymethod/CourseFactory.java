package com.bhh.design.creational.factorymethod;

import lombok.extern.slf4j.Slf4j;

/**
 * @author bhh
 * @description 课程简单工厂
 * @date Created in 2021-04-20 9:25
 * @modified By
 */
@Slf4j
public abstract class CourseFactory {
    public abstract ICourse getCourse();
}
