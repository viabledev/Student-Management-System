package com.viabledev.studentmanagement;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


// Rest Controller will manage the POST, GET, DELETE, PUT
@RestController
public class StudentController {

    // Request Mapping is given to each method according to which webpage of website it should respond to.
    @RequestMapping("/")
    public String greet(){

        return "Hello World";

    }

    @RequestMapping("/logout")
    public String logOut(){

        return "Bye";
    }
}


