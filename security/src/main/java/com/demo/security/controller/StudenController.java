package com.demo.security.controller;

import com.demo.security.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudenController {

    List<Student> arr= new ArrayList<Student>(List.of(
            new Student(1,"aswath",445),
            new Student(2,"swathi",460),
            new Student(3,"harmaan",425),
            new Student(4,"mirshitha",495)
    ));


    @GetMapping("")
    public String welcome(HttpServletRequest request) {
        return "Welcome to StudenController!"+request.getRequestedSessionId();
    }

    @GetMapping("/student")
    public List<Student>  getStudents(){
        return arr;
    }

    @GetMapping("/csrf-token")
    public CsrfToken csrfToken(HttpServletRequest request){
          return (CsrfToken) request.getAttribute("_csrf");
    }

    @PostMapping("/student")
    public  Student addStudent(@RequestBody Student student){
        arr.add(student);
        return student;
    }
}
