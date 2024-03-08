package com.viabledev.rest;

import org.springframework.web.bind.annotation.*;

// Rest Controller is used for making REST API => POST, GET, PUT, DELETE
@RestController
@RequestMapping("/api")


//  GetMapping is used to give correct webpage for the method. @GetMapping(" / ")
//  The port will be mentioned in application.properties

public class StudentRestController {

// PostMapping is used to collect data from the client directly and not through the address
    @PostMapping("/Student")
    public Student registerStudent(@RequestBody Student student){
        System.out.println("Student Data " + student);
         return student;
    }



}
