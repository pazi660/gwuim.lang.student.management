package com.gwuim.controller;

import com.gwuim.model.Student;
import com.gwuim.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/students",method = RequestMethod.GET)
    //@GetMapping("/students")
    private List<Student> getAll(){
       return studentService.getAllStudents();
    }
}