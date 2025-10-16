package com.example.DockerDemo.controller;

import com.example.DockerDemo.model.Student;
import com.example.DockerDemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @RequestMapping("/add")
    public void addStudent(){
        Student student = new Student();
        student.setName("VP");
        student.setAge(22);
        studentService.addStudent(student);
    }
}
