package com.hyx.springmvc.service.impl;

import com.hyx.springmvc.entity.Student;
import com.hyx.springmvc.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Override
    public List<Student> find() {
        Student stu = new Student();
        List<Student> list = new ArrayList<Student>();
        for(int i=1;i<4;i++){
            stu.setId(i);
            stu.setNumber(i);
            stu.setName("孙晓曼");
            stu.setJob("PM工程师");
            stu.setQq("12389451");
            stu.setUniversity("四川大学");
            stu.setLink("www.jnshu.sichuan.cn");
            stu.setBrother("帝君师兄");
            stu.setTarget("有敢掀桌子的勇气，才能稳定桌子");
            stu.setCreateTime(20200602L+i);
            stu.setUpdateTime(20200602L+i);
            list.add(stu);
        }
        return list;
    }

    @Override
    public int insert(Student student) {
        if(student.getName() != null){
            System.out.println(200);
            return 200;
        }
        return -1;
    }
}
