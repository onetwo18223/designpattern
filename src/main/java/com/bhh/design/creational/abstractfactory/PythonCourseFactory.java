package com.bhh.design.creational.abstractfactory;

import lombok.extern.slf4j.Slf4j;

/**
 * @author bhh
 * @description CourseFactory 接口实现类
 * @date Created in 2021-04-20 14:25
 * @modified By
 */
@Slf4j
public class PythonCourseFactory implements CourseFactory {
    @Override
    public IVideo getVideo() {
        return new PythonVideo();
    }

    @Override
    public INotes getNote() {
        return new PythonNote();
    }
}
