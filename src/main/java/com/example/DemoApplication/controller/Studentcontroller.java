package com.example.DemoApplication.controller;

import Domain.Gender;
import Domain.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class Studentcontroller {


@GetMapping("/findall")
    public List<Student> getAllStudents() {

       List<Student> students = Arrays.asList(
              new Student (1L,
                "Jamila",
                "jamila@gmail.com",
                Gender.FEMALE),

    new Student (2L,
            "Alex",
            "alex@gmail.com",
            Gender.MALE),


    new Student (3L,
            "basky",
            "basky@gmail.com",
            Gender.FEMALE)
);
        return students;
    }

}

