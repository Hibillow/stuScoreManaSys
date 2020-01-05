package com.zhengyuan.liunao.entity;

public class Teacher {
	private String teachno;
	private String name;
	private String psw;
	private String sex;
	public Teacher() {
		super();
	}
	public Teacher(String teachno, String name, String psw, String sex) {
		super();
		this.teachno = teachno;
		this.name = name;
		this.psw = psw;
		this.sex = sex;
	}
	public Teacher(String teachno, String name, String sex) {
		super();
		this.teachno = teachno;
		this.name = name;
		this.sex = sex;
	}
	public String getTeachno() {
		return teachno;
	}
	public void setTeachno(String teachno) {
		this.teachno = teachno;
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
	@Override
	public String toString() {
		return "Teacher [teachno=" + teachno + ", name=" + name + ", psw=" + psw + ", sex=" + sex + "]";
	}
	
}
