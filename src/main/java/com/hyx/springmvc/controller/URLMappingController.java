package com.hyx.springmvc.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
public class URLMappingController {

    @PostMapping("/post")
    @ResponseBody
    public String postMapping(@DateTimeFormat(pattern = "yyyy-MM-dd") Date createTime,String username){
        System.out.println(createTime+":"+username);
        return "这是 DateTimeFormat 方法!";
    }
    @GetMapping("/get")
    @ResponseBody
    public String getMapping(Date createTime,String username){
        System.out.println(createTime +" :" + username);
        return "这是 get 方法!";
    }
    @PostMapping("/post2")
    @ResponseBody
    public void postMappingsArry(String name,Integer[] number){
    }
    @PostMapping("/post3")
    @ResponseBody
    public void postMappingList(String name, @RequestParam List<Integer> number){
    }
    @PostMapping("/post5")
    @ResponseBody
    public void postMappingMap(@RequestParam Map map){
    }
    @PostMapping("/post4")
    @ResponseBody
    public void postMappingsRequest(@RequestParam(value = "n",defaultValue = "Anun") String name,Integer number){
    }

    @GetMapping("/view")
    public ModelAndView view(String username,Long password){
        ModelAndView model = new ModelAndView("/view.jsp");//默认请求转发
        //mav.addObject()方法设置的属性默认存放在当前请求中
        return model;
    }
    @GetMapping("/view1")
    public ModelAndView view1(String username,Long password){
        //重定向使用 new ModelAndView（"redirect:/index.jsp"）
        ModelAndView model = new ModelAndView("redirect:/view.jsp");

        return model;
    }

}
