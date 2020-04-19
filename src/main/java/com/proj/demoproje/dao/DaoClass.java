package com.proj.demoproje.dao;

import com.proj.demoproje.entity.MainEntity;
import com.proj.demoproje.model.request.ModelClass;
import com.proj.demoproje.repository.MainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class DaoClass {
    @Autowired
    private MainRepository mainRepository;

    public Integer saveData(ModelClass obj1) {
//        MainEntity mainEntity = MainEntity.builder().
//                rollNo(obj1.getRollNo()).
//                age(obj1.getAge()).
//                name(obj1.getName()).
//                gender(obj1.getGender()).build();
        MainEntity mainEntity = new MainEntity();
        mainEntity.setAge(obj1.getAge());
        mainEntity.setGender(obj1.getGender());
        mainEntity.setName(obj1.getName());
        mainEntity.setRollNo(obj1.getRollNo());

        return mainRepository.save(mainEntity).getRollNo();
    }

//    public ModelClass getData(Integer rollNum) {
//        Optional<MainEntity> mainEntity= mainRepository.findById(rollNum);
//        if(mainEntity.isEmpty())
//            return null;
//        MainEntity obj=mainEntity.get();
//
//
//        return ModelClass.builder().
//                rollNo(obj.getRollNo()).
//                age(obj.getAge()).
//                gender(obj.getGender()).
//                name(obj.getName()).build();
//    }

//    public List<ModelClass> getAllData() {
//        List<MainEntity> mainEntity= (List<MainEntity>) mainRepository.findAll();
//        if(mainEntity.isEmpty())
//            return null;
//        MainEntity obj=mainEntity.get();
//
//
//        return ModelClass.builder().
//                rollNo(obj.getRollNo()).
//                age(obj.getAge()).
//                gender(obj.getGender()).
//                name(obj.getName()).build();
//    }


//    public List<ModelClass> getByGender(String gender) {
//        List<MainEntity> mainEntity=  mainRepository.findByGender(gender);
//        if(mainEntity.isEmpty())
//            return null;
//        return mainEntity.stream().map(entity->ModelClass.builder().
//                name(entity.getName()).
//                age(entity.getAge()).
//                gender(entity.getGender()).
//                rollNo(entity.getRollNo()).build()).collect(Collectors.toList());
//    }
}
