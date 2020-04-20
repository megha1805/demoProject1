package com.proj.demoproje.repository;

import com.proj.demoproje.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MainRepository extends JpaRepository<StudentEntity, Integer> {

    List<StudentEntity> findByGender(String gender);


}
