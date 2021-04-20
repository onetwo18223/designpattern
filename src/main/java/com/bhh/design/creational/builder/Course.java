package com.bhh.design.creational.builder;

import lombok.extern.slf4j.Slf4j;

/**
 * @author bhh
 * @description 课程实体类
 * @date Created in 2021-04-20 15:50
 * @modified By
 */
@Slf4j
public class Course {
    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", courseNote='" + courseNote + '\'' +
                ", courseVideo='" + courseVideo + '\'' +
                ", coursePrice=" + coursePrice +
                ", courseQA='" + courseQA + '\'' +
                '}';
    }

    private String courseName;
    private String courseNote;
    private String courseVideo;
    private Double coursePrice;

    // question & answer
    private String courseQA;

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseNote(String courseNote) {
        this.courseNote = courseNote;
    }

    public void setCourseVideo(String courseVideo) {
        this.courseVideo = courseVideo;
    }

    public void setCoursePrice(Double coursePrice) {
        this.coursePrice = coursePrice;
    }

    public void setCourseQA(String courseQA) {
        this.courseQA = courseQA;
    }
}
