package com.upms.entity;

import javax.persistence.Transient;

/**
 * @description 课程表
 */
public class CourseTimeTable {

    private String classNo;
    private String courseYear;//学年
    private int semester;//学期 1，2
    private String courseNo;//课程
    private int weekDay;//星期几
    private int jieci;//节次
    private String address;//上课地址
    private String teachNo;//教师

    @Transient
    private String className;
    @Transient
    private String courseName;
    @Transient
    private String teachName;

    public String getClassNo() {
        return classNo;
    }

    public void setClassNo(String classNo) {
        this.classNo = classNo;
    }

    public String getCourseYear() {
        return courseYear;
    }

    public void setCourseYear(String courseYear) {
        this.courseYear = courseYear;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getCourseNo() {
        return courseNo;
    }

    public void setCourseNo(String courseNo) {
        this.courseNo = courseNo;
    }

    public int getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(int weekDay) {
        this.weekDay = weekDay;
    }

    public int getJieci() {
        return jieci;
    }

    public void setJieci(int jieci) {
        this.jieci = jieci;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTeachNo() {
        return teachNo;
    }

    public void setTeachNo(String teachNo) {
        this.teachNo = teachNo;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTeachName() {
        return teachName;
    }

    public void setTeachName(String teachName) {
        this.teachName = teachName;
    }
}
