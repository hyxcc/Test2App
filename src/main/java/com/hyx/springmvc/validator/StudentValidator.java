package com.hyx.springmvc.validator;

import com.hyx.springmvc.entity.Student;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class StudentValidator implements Validator {
    @Override
    public boolean supports(Class<?> type) {

        return Student.class.isAssignableFrom(type);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Student student = (Student) o;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"number","number不能是汉字");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"name","name不能为空");
        if(student.getTarget().length()<5){
            errors.rejectValue("target","立志内容太短了");
        }
    }

}
