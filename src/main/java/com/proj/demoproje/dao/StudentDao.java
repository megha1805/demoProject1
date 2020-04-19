package com.proj.demoproje.dao;

import com.proj.demoproje.entity.StudentEntity;
import com.proj.demoproje.model.request.Student;
import com.proj.demoproje.repository.MainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class StudentDao {
    @Autowired
    private MainRepository mainRepository;

    public Integer saveData(Student obj1) {
        StudentEntity studentEntity = StudentEntity.builder().
                rollNo(obj1.getRollNo()).
                age(obj1.getAge()).
                name(obj1.getName()).
                gender(obj1.getGender()).build();

        return mainRepository.save(studentEntity).getRollNo();
    }

    public Student getData(Integer rollNum) {
        Optional<StudentEntity> mainEntity = mainRepository.findById(rollNum);
        if (mainEntity.isEmpty())
            return null;
        StudentEntity obj = mainEntity.get();

        return Student.builder().
                rollNo(obj.getRollNo()).
                age(obj.getAge()).
                gender(obj.getGender()).
                name(obj.getName()).build();
    }

    public List<Student> getAllData() {
        List<StudentEntity> studentEntity = mainRepository.findAll();
        if (studentEntity.isEmpty())
            return null;

        return studentEntity.stream().map(entity -> Student.builder().
                name(entity.getName()).
                age(entity.getAge()).
                gender(entity.getGender()).
                rollNo(entity.getRollNo()).build()).collect(Collectors.toList());

    }


    public List<Student> getByGender(String gender) {
        List<StudentEntity> studentEntity = mainRepository.findByGender(gender);
        if (studentEntity.isEmpty())
            return null;
        return studentEntity.stream().map(entity -> Student.builder().
                name(entity.getName()).
                age(entity.getAge()).
                gender(entity.getGender()).
                rollNo(entity.getRollNo()).build()).collect(Collectors.toList());
    }
}
