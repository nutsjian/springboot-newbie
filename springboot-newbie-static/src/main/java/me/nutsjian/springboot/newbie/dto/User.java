package me.nutsjian.springboot.newbie.dto;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String name;
    private Integer age;
    private String career;
    private Double salary;

    public User(Integer id, String name, Integer age, String career, Double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.career = career;
        this.salary = salary;
    }
}
