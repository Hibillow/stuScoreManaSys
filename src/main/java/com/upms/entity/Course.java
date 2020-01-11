package com.upms.entity;

import javax.persistence.Transient;
import java.util.Date;

/**
 * @description 课程信息
 */
public class Course {

    private String courseNo;
    private String name;
    private int courseHour;//学时
    private int courseCredit;//学分
    private String courseYear;//学年
    private int semester;//学期 1，2
    private String teachNo;//老师编号
    private int type; //0：必须 1选修
    private float attendancePercent;//出勤比例
    private float workPercent;//作业比例
    private float experimentPercent;//实验比例
    private float otherPercent;//其他比例

    @Transient
    private String teachName;

    public String getCourseNo() {
        return courseNo;
    }

    public void setCourseNo(String courseNo) {
        this.courseNo = courseNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourseHour() {
        return courseHour;
    }

    public void setCourseHour(int courseHour) {
        this.courseHour = courseHour;
    }

    public int getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(int courseCredit) {
        this.courseCredit = courseCredit;
    }

    public String getTeachNo() {
        return teachNo;
    }

    public void setTeachNo(String teachNo) {
        this.teachNo = teachNo;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getTeachName() {
        return teachName;
    }

    public void setTeachName(String teachName) {
        this.teachName = teachName;
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

    public float getAttendancePercent() {
        return attendancePercent;
    }

    public void setAttendancePercent(float attendancePercent) {
        this.attendancePercent = attendancePercent;
    }

    public float getWorkPercent() {
        return workPercent;
    }

    public void setWorkPercent(float workPercent) {
        this.workPercent = workPercent;
    }

    public float getExperimentPercent() {
        return experimentPercent;
    }

    public void setExperimentPercent(float experimentPercent) {
        this.experimentPercent = experimentPercent;
    }

    public float getOtherPercent() {
        return otherPercent;
    }

    public void setOtherPercent(float otherPercent) {
        this.otherPercent = otherPercent;
    }

}
