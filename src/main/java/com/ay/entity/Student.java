package com.ay.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Student {
    private Integer id;
    private String name;
    private String email;
    private Integer gender;
    private Integer age;
    private Date birthday;
    private Double salary;
}
