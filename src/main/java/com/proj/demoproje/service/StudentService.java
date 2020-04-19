package com.proj.demoproje.service;

import com.proj.demoproje.dao.StudentDao;
import com.proj.demoproje.model.request.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentDao studentDao;

    public Integer saveStudent(Student student) {
        return studentDao.saveData(student);
    }
}
