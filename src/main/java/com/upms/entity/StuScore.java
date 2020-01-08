package com.upms.entity;

/**
 * @description 学生成绩
 */
public class StuScore {

    private String stuNo;
    private String sclassNo;
    private String courseNo;
    private float attendanceScore;
    private float workScore;
    private float experimentScore;
    private float otherScore;
    private float sumScore;
    private String teachNo;

    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
    }

    public String getSclassNo() {
        return sclassNo;
    }

    public void setSclassNo(String sclassNo) {
        this.sclassNo = sclassNo;
    }

    public String getCourseNo() {
        return courseNo;
    }

    public void setCourseNo(String courseNo) {
        this.courseNo = courseNo;
    }

    public float getAttendanceScore() {
        return attendanceScore;
    }

    public void setAttendanceScore(float attendanceScore) {
        this.attendanceScore = attendanceScore;
    }

    public float getWorkScore() {
        return workScore;
    }

    public void setWorkScore(float workScore) {
        this.workScore = workScore;
    }

    public float getExperimentScore() {
        return experimentScore;
    }

    public void setExperimentScore(float experimentScore) {
        this.experimentScore = experimentScore;
    }

    public float getOtherScore() {
        return otherScore;
    }

    public void setOtherScore(float otherScore) {
        this.otherScore = otherScore;
    }

    public float getSumScore() {
        return sumScore;
    }

    public void setSumScore(float sumScore) {
        this.sumScore = sumScore;
    }

    public String getTeachNo() {
        return teachNo;
    }

    public void setTeachNo(String teachNo) {
        this.teachNo = teachNo;
    }
}
