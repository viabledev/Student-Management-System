package com.viabledev.rest;

import com.viabledev.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

// Rest Controller is used for making REST API => POST, GET, PUT, DELETE
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "")


//  GetMapping is used to give correct webpage for the method. @GetMapping(" / ")
//  The port will be mentioned in application.properties

public class StudentRestController {

    @Autowired
    private IStudentService service;

// PostMapping is used to collect data from the client directly and not through the address
    @PostMapping("/Student")
    public Student registerStudent(@RequestBody Student student){
        System.out.println("Student Data " + student);
        Student st = service.saveStudent(student);
         return st;
    }

    @GetMapping("/Students")
    public List<Student> getAllStudents(){
    //Invoke Service method responsible to retrieve all records of Students.
            List<Student> list = service.getAllStudent();
            return list;
    }

    @GetMapping("/Student/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Integer id){

        Student stu = service.getStudentById(id);
        return ResponseEntity.ok(stu);
    }

    @DeleteMapping ("/Student/{id}")
    public ResponseEntity<Student> deleteStudentById(@PathVariable Integer id){

        service.deleteStudentById(id);

        return ResponseEntity.noContent().build();
    }
}
