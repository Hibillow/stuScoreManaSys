package com.upms.controller.dealcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @description 课程表
 */
@RestController
@RequestMapping("/CourseTimeTableInfoDeal")
public class CourseTimeTableInfoDeal {

    @RequestMapping("/addCourseTimeTable")
    public Map<String, Object> addCourseTimeTable(HttpServletRequest request, @RequestParam("file") MultipartFile file){
        return null;
    }
}
