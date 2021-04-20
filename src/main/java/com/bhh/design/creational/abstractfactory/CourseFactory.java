package com.bhh.design.creational.abstractfactory;

/**
 * @author bhh
 * @description 课程 ( 视频 + 笔记 ) 工厂 , 该工厂对应的是产品族
 * @date Created in 2021-04-20 14:20
 * @modified By
 */
public interface CourseFactory {
    IVideo getVideo();
    INotes getNote();
}
