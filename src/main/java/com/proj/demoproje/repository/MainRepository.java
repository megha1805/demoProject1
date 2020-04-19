package com.proj.demoproje.repository;

import com.proj.demoproje.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MainRepository extends JpaRepository<StudentEntity, Integer> {

    List<StudentEntity> findByGender(String gender);


}
