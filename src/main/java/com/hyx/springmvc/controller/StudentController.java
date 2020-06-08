package com.hyx.springmvc.controller;

import com.alibaba.fastjson.JSON;
import com.hyx.springmvc.util.I18nService;
import com.hyx.springmvc.util.Result;
import com.hyx.springmvc.entity.Student;
import com.hyx.springmvc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@RequestMapping("/student")
@Controller
public class StudentController {
    private Logger log = Logger.getLogger(StudentController.class.getName());
    @Autowired
    private I18nService i18nService;
    @Resource
    private StudentService studentService;
    Logger logger = Logger.getLogger(StudentController.class.getName());

    @GetMapping("/students")
    public String find(Model model){

        List<Student> list = studentService.find();
        String message="";
        int code ;
        if(!list.isEmpty()){
            code = 200;
            message="学生数据查询成功!";
        }else {
            code=500;
            message="学生数据查询失败！";
        }
        Result result = Result.successInsert(code,message,list);
        model.addAttribute("result",result);
        log.info("返回数据为"+result.getData());
        return "/student.jsp";
    }
    @PostMapping("/from")
    public String insert(Student student,Model model){
        int code = studentService.insert(student);
        String message="";
        if(code == 200){
            message="插入成功!";
        }else {
            message="插入失败！";
        }
        String msg = i18nService.getMessage("user.number.empty");
        System.out.println(msg);
        List<Student> data = new ArrayList<>();
        data.add(student);
        Result result = Result.successInsert(code,message,data);
        model.addAttribute("result",result);
        return "/student.jsp";
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    @ResponseBody
    public String Put(@RequestBody Student student){
        int code = studentService.put(student);
        String message="";
        if(code == 200){
            message="学生数据修改成功!";
        }else {
            message="学生数据修改失败！";
        }
        String result = JSON.toJSONString(Result.successPut(code,message));
        return result;
    }
}
