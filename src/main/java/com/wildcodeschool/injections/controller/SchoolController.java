package com.wildcodeschool.injections.controller;

import com.wildcodeschool.injections.model.Student;
import com.wildcodeschool.injections.repository.StudentDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
