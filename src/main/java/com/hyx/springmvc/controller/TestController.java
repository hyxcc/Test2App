package com.hyx.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/school")
public class TestController {
    @GetMapping("/student")
    @ResponseBody //直接响应输出字符串，不进行跳转
    public String test(){
        return "I am to Java programmer";
    }
}
