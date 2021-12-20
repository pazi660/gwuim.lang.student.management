package com.gwuim.service;

import com.gwuim.model.Student;
import com.gwuim.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        ArrayList<Student> students = new ArrayList<>();
        studentRepository.findAll().forEach(student -> students.add(student));

        return students;
    }

}
