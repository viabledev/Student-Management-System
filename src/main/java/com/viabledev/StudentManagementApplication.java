package com.viabledev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
TO CREATE A SPRING BOOT APPLICATION FROM SCRATCH GO TO "https://start.spring.io/"

Layered Approach Development => Controller, Service/Business, DAO, DataBase
*/


@SpringBootApplication
public class StudentManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentManagementApplication.class, args);
    }

}

