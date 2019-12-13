package com.wildcodeschool.injections.controller;

import com.wildcodeschool.injections.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SchoolController {

    @GetMapping("/students")
    @ResponseBody
    public List<Student> showStudents() {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Bernard"));
        students.add(new Student("Hoagie"));
        students.add(new Student("Laverne"));

        return students;
    }
}
