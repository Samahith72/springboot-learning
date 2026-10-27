package com.example.StudentInfo;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

@Component
public class Student {

    @Value("${student.name}")
    private String name;

    @Value("${student.age}")
    private int age;

    public void displayDetails(){
        System.out.println("student Name: "+ name);
        System.out.println("Student age: "+ age);
    }
}
