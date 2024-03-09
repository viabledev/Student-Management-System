package com.viabledev.service;

import com.viabledev.rest.Student;
import org.springframework.stereotype.Service;


@Service
public class StudentService implements IStudentService{

        @Override
    public Student saveStudent(Student student){
            //Logic to store the data in DB
            return student;
        }

}
