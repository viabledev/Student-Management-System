package com.viabledev.service;

import com.viabledev.rest.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class StudentService implements IStudentService{

        @Override
    public Student saveStudent(Student student){
            //Logic to store the data in DB
            return student;
        }

    @Override
    public List<Student> getAllStudent() {

        return new ArrayList<Student>();
    }

}
