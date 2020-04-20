package com.proj.demoproje.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class StudentEntity {
    @Id
    @Column(name = "roll_no")
    Integer rollNo;

    @Column
    String name;

    @Column
    Integer age;

    @Column
    String gender;

}
