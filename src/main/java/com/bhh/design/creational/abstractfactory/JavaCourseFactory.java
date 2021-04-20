package com.bhh.design.creational.abstractfactory;

import lombok.extern.slf4j.Slf4j;

/**
 * @author bhh
 * @description 接口实现类
 * @date Created in 2021-04-20 14:22
 * @modified By
 */
@Slf4j
public class JavaCourseFactory implements CourseFactory{

    @Override
    public IVideo getVideo() {
        return new JavaVideo();
    }

    @Override
    public INotes getNote() {
        return new JavaNote();
    }
}
