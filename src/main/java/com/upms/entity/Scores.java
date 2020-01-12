package com.upms.entity;

import javax.persistence.Transient;

public class Scores {

	private String courseNo;
	private String stuno;
	private String classNo;
	@Transient
	private String stuName;
	private float attendance;
	private float work;
	private float experiment;
	private float other;
	private float score;

	@Transient
	private String courseName;
	@Transient
	private  String className;

	public String getCourseNo() {
		return courseNo;
	}

	public void setCourseNo(String courseNo) {
		this.courseNo = courseNo;
	}

	public String getStuno() {
		return stuno;
	}

	public void setStuno(String stuno) {
		this.stuno = stuno;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getClassNo() {
		return classNo;
	}

	public void setClassNo(String classNo) {
		this.classNo = classNo;
	}

	public float getAttendance() {
		return attendance;
	}

	public void setAttendance(float attendance) {
		this.attendance = attendance;
	}

	public float getWork() {
		return work;
	}

	public void setWork(float work) {
		this.work = work;
	}

	public float getExperiment() {
		return experiment;
	}

	public void setExperiment(float experiment) {
		this.experiment = experiment;
	}

	public float getOther() {
		return other;
	}

	public void setOther(float other) {
		this.other = other;
	}
}
