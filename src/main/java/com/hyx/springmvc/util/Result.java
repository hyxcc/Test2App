package com.hyx.springmvc.util;

import com.hyx.springmvc.entity.Student;

import java.util.List;

public class Result<T> {
    private long code;
    private String message;
    private List<Student> data;

    public Result(){

    }
    public Result(long code, String message) {
        this.code = code;
        this.message = message;
    }
    public Result(long code, String message, List<Student> data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Student> getData() {
        return data;
    }

    public void setData(List<Student> data) {
        this.data = data;
    }

    public static<T> Result<T> successInsert(long code, String message, List<Student> data){
        return new Result(code,message,data);
    }
    public static<T> Result<T> successPut(long code, String message){
        return new Result(code,message);
    }
}
