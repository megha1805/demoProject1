package com.proj.demoproje.controller;

import com.proj.demoproje.model.request.Student;
import com.proj.demoproje.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class StudentController {
    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseEntity sayHi(@RequestBody @Valid Student student) {
        return new ResponseEntity(studentService.saveStudent(student), HttpStatus.OK);

    }

}
