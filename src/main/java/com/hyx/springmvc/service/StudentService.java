package com.hyx.springmvc.service;

import com.hyx.springmvc.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> find();
    int insert(Student student);
}
