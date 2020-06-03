package com.hyx.springmvc.controller;

import com.hyx.springmvc.entity.Student;
import com.hyx.springmvc.service.StudentService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ModelAndViewDefiningException;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class StudentController {
    @Resource
    private StudentService studentService;
    @GetMapping("/students")
    public ModelAndView find(){
        ModelAndView model = new ModelAndView("/students.jsp");
        List<Student> list = studentService.find();
        model.addObject("student",list);
        return model;
    }
    @PostMapping("/student")
    @ResponseBody
    public ModelAndView insert(Student student){
        ModelAndView model = new ModelAndView("/student.jsp");
        int data = studentService.insert(student);
        if(data == 200){
           model.addObject("message","插入成功");
           model.addObject("stu",student);
        }
        return model;
    }
}
