package com.viabledev.rest;

import com.viabledev.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "")



public class StudentRestController {

    @Autowired
    private IStudentService service;


    @PostMapping("/Student")
    public Student registerStudent(@RequestBody Student student){
        System.out.println("Student Data " + student);
        Student st = service.saveStudent(student);
         return st;
    }

    @GetMapping("/Students")
    public List<Student> getAllStudents(){
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
