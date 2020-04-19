package com.proj.demoproje.repository;

import com.proj.demoproje.entity.MainEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MainRepository extends JpaRepository<MainEntity,Integer> {

    public List<MainEntity> findByGender(String gender);





}
