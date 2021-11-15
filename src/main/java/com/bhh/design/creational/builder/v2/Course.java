package com.bhh.design.creational.builder.v2;

/**
 * @author bhh
 * @description v2版本, 建造者模式
 * @date Created in 2021-04-20 19:13
 * @modified By
 */
public class Course {
    private String courseName;
    private String courseNote;
    private String courseVideo;
    private Double coursePrice;

    // question & answer
    private String courseQA;

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

    public Course(CourseBuilder builder) {
        this.courseName = builder.courseName;
        this.courseNote = builder.courseNote;
        this.courseVideo = builder.courseVideo;
        this.coursePrice = builder.coursePrice;
        this.courseQA = builder.courseQA;
    }

    // 定义静态内部类
    public static class CourseBuilder{
        private String courseName;
        private String courseNote;
        private String courseVideo;
        private Double coursePrice;

        // question & answer
        private String courseQA;

        public CourseBuilder buildCourseName(String courseName) {
            this.courseName = courseName;
            return this;
        }

        public CourseBuilder buildCourseNote(String courseNote) {
            this.courseNote = courseNote;
            return this;
        }

        public CourseBuilder buildCourseVideo(String courseVideo) {
            this.courseVideo = courseVideo;
            return this;
        }

        public CourseBuilder buildCoursePrice(Double coursePrice) {
            this.coursePrice = coursePrice;
            return this;
        }

        public CourseBuilder buildCourseQA(String courseQA) {
            this.courseQA = courseQA;
            return this;
        }

        public Course make(){
            return new Course(this);
        }
    }
}
