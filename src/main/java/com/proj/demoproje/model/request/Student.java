package com.proj.demoproje.model.request;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Data
@Builder
public class Student {
    @Pattern(regexp = "Male|Female", message = "can only be male or female")
    String gender;

    @NotEmpty(message = "cannot be empty")
    Integer rollNo;

    @NotBlank(message = "cannot be blank")
    String name;

    @NotEmpty(message = "cannot be empty")
    Integer age;
}
