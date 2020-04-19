package com.proj.demoproje.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student")

@Builder
@Data
public class StudentEntity {
    @Id
    Integer rollNo;

    @Column
    String name;

    @Column
    Integer age;

    @Column
    String gender;

}
