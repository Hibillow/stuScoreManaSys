package com.upms.entity;

import javax.persistence.Transient;

public class Stu {
	private String stuno;
	private String name;
	private String psw;
	private String sex;
	private String grade;
	private String sclass;
	private String speciality;

	@Transient
	private String sclassName;
	@Transient
	private String specialityName;

	public Stu() {
		super();
	}
	public Stu(String stuno, String name, String psw, String sex) {
		super();
		this.stuno = stuno;
		this.name = name;
		this.psw = psw;
		this.sex = sex;
	}
	public Stu(String stuno, String name, String sex) {
		super();
		this.stuno = stuno;
		this.name = name;
		this.sex = sex;
		
	}
	public String getStuno() {
		return stuno;
	}
	public void setStuno(String stuno) {
		this.stuno = stuno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPsw() {
		return psw;
	}
	public void setPsw(String psw) {
		this.psw = psw;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getSclass() {
		return sclass;
	}

	public void setSclass(String sclass) {
		this.sclass = sclass;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	@Override
	public String toString() {
		return "Stu [stuno=" + stuno + ", name=" + name + ", psw=" + psw + ", sex=" + sex + "]";
	}

	public String getSclassName() {
		return sclassName;
	}

	public void setSclassName(String sclassName) {
		this.sclassName = sclassName;
	}

	public String getSpecialityName() {
		return specialityName;
	}

	public void setSpecialityName(String specialityName) {
		this.specialityName = specialityName;
	}
}
