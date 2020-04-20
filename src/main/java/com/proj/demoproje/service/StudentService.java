package com.proj.demoproje.service;

import com.proj.demoproje.dao.StudentDao;
import com.proj.demoproje.model.request.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentDao studentDao;

    @Transactional
    public Integer saveStudent(Student student) {
        return studentDao.saveData(student);
    }

    @Transactional
    public Student getData(Integer rollNo) {
        return studentDao.getData(rollNo);
    }

    @Transactional
    public List<Student> getAllData(){
        return studentDao.getAllData();
    }
}
