package com.upms.controller.viewcontroller;

import javax.mail.Session;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/Sys")
public class ViewRoute {
	@RequestMapping("/loginView")
	public String loginView(HttpSession httpSession) {
		
		return "login";
	}
	
	
	@RequestMapping("/loginOut")
	public String loginOut(HttpSession httpSession) {
		httpSession.removeAttribute("name");
		httpSession.removeAttribute("account");
		httpSession.removeAttribute("photo");
		return "redirect:/Sys/loginView";
	}

	@RequestMapping("/adminIndex")
	public String adminIndex(HttpSession s) {
		String perssion = s.getAttribute("role").toString();
		if(perssion.equals("admin")) {
			return "adminIndex";
		}else {
			return "redirect:/Sys/loginView";
		}
	}

	@RequestMapping("/classInfo")
	public String clssInfo(){
		return "classInfo";
	}
	@RequestMapping("/stuIndex")
	public String stuIndex() {
		return "stuIndex";
	}
	
	@RequestMapping("/teacherIndex")
	public String teacherIndex() {
		return "teacherIndex";
	}

	@RequestMapping("/teacherInfo")
	public String teacherInfo() {
		return "teacherInfo";
	}

	@RequestMapping("/stuInfo")
	public String stuInfo() {
		return "stuInfo";
	}
	
	@RequestMapping("/stuInfo_mf")
	public String stuInfo_mf() {
		return "stuInfo_mf";
	}
	

	@RequestMapping("/parseStu")
	public String parseStu() {
		return "parseStu";
	}

	@RequestMapping("/stuAdd")
	public String StuRegister() {
		return "stuAdd";
	}

	@RequestMapping("/stuModi")
	public String stuModi() {
		return "stuModi";
	}
	
	
	@RequestMapping("/stuScore")
	public String stuScore() {
		return "stuScore";
	}
	
	
	@RequestMapping("/teaAdd")
	public String teaAdd() {
		return "teaAdd";
	}
	
	@RequestMapping("/teacherInfo_mf")
	public String teacherInfo_mf() {
		return "teacherInfo_mf";
	}
	
	
	
	@RequestMapping("/teaModi")
	public ModelAndView teaModi(ModelAndView mav, @RequestParam("num") String num) {
		mav.addObject("num", num);
		mav.setViewName("teaModi");
		return mav;
	}
	
	
	
	
	@RequestMapping("/claCouModi")
	public ModelAndView claCouModi(ModelAndView mav,  @RequestParam("coursename") String coursename,@RequestParam("num") String num) {
		mav.addObject("num", num);
		System.out.println(coursename);
		mav.addObject("coursename", coursename);
		mav.setViewName("claCouModi");
		return mav;
	}
	
	


	@RequestMapping("/claCouScore")
	public String claCouScore() {
		return "claCouScore";
	}

	@RequestMapping("/ClaCouSco")
	public String ClaCouSco() {
		return "ClaCouSco";
	}

	@RequestMapping("/ClaCouTea")
	public String ClaCouTea() {
		return "ClaCouTea";
	}
	
	@RequestMapping("/parseClaCouSco")
	public String parseClaCouSco() {
		return "parseClaCouSco";
	}
	

	@RequestMapping("/parseClaComp")
	public String parseClaComp() {
		return "parseClaComp";
	}
	
	@RequestMapping("/welcome")
	public String welcome() {
		return "welcome";
	}
	
	@RequestMapping("/announce")
	public String announce() {
		return "announce";
	}

	@RequestMapping("/specialityInfo")
	public String specialityInfo(){
		return "specialityInfo";
	}
	@RequestMapping("/specialityAdd")
	public String specialityAdd(){
		return "specialityAdd";
	}
	@RequestMapping("/specialityModi")
	public String specialityModi(){
		return "specialityModi";
	}

	@RequestMapping("/classAdd")
	public String classAdd(){
		return "classAdd";
	}
	@RequestMapping("/classModi")
	public String classModi(){
		return "classModi";
	}
	//-------------------管理员页面-课程信息
	@RequestMapping("/courseInfo")
	public String courseInfo(){
		return "courseInfo";
	}
	@RequestMapping("/courseAdd")
	public String courseAdd(){
		return "courseAdd";
	}
	@RequestMapping("/courseModi")
	public String courseModi(){
		return  "courseModi";
	}
	@RequestMapping("/coursePercent")
	public String coursePercent(){
		return  "coursePercent";
	}
	@RequestMapping("/courseQuanZhong")
	public String courseQuanZhong(){
		return "courseQuanZhong";
	}
	@RequestMapping("/courseQuanZhongBatch")
	public String courseQuanZhongBatch(){
		return "courseQuanZhongBatch";
	}
	//-------------成绩管理
	@RequestMapping("/stuScoreInfo")
	public String stuScoreInfo(){
		return "stuScoreInfo";
	}
	//---------------教师管理页面
	@RequestMapping("/personInfo_tea")
	public String personInfo_tea(){
		return "personInfo_tea";
	}
	@RequestMapping("/classInfo_tea")
	public String classInfo_tea(){
		return "classInfo_tea";
	}
	@RequestMapping("/class_stu_tea")
	public String class_stu_tea(){
		return "class_stu_tea";
	}
	@RequestMapping("/class_course_tea")
	public String class_course_tea(){
		return "class_course_tea";
	}
	@RequestMapping("/course_tea")
	public String course_tea(){
		return "course_tea";
	}

	@RequestMapping("/stu_score_tea")
	public String stu_score_tea(){
		return "stu_score_tea";
	}

	@RequestMapping("/stu_score_teaAdd")
	public String stu_score_teaAdd(){
		return "stu_score_teaAdd";
	}

	@RequestMapping("/stu_score_teaModi")
	public String stu_score_teaModi(){
		return "stu_score_teaModi";
	}

	//-----------学生信息
	@RequestMapping("/stuInfo_mf_stu")
	public String stuInfo_mf_stu(){
		return "stuInfo_mf_stu";
	}
	@RequestMapping("/stu_score_stu")
	public String stu_score_stu(){
		return "stu_score_stu";
	}
	@RequestMapping("/course_slect_stu")
	public String course_slect_stu(){
		return "course_slect_stu";
	}
	@RequestMapping("/course_slected_stu")
	public String course_slected_stu(){
		return "course_slected_stu";
	}
	@RequestMapping("/course_time_table")
	public String course_time_table(){
		return "course_time_table";
	}
	@RequestMapping("/course_time_table_add")
	public String course_time_table_add(){
		return "course_time_table_add";
	}
	@RequestMapping("/course_time_table_tea")
	public String course_time_table_tea(){
		return "course_time_table_tea";
	}
}
