package com.bhh.principle.dependenceinversion;

import lombok.extern.slf4j.Slf4j;

/**
 * @author bhh
 * @description 实体对象,低层模块,被调用方
 * @date Created in 2021-04-19 19:53
 * @modified By
 */
@Slf4j
public class Bhh {
    // v1
//    public void studyJava(){
//        System.out.println("正在学习Java课程");
//    }
//    public void studyPython(){
//        System.out.println("正在学习Python课程");
//    }

    // v2
//    public void study(ICourse iCourse){
//        iCourse.studyCourse();
//    }

    private ICourse iCourse;

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void study(){
        iCourse.studyCourse();
    }
}
