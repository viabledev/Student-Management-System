package com.viabledev.service;

import com.viabledev.dao.StudentRepo;
import com.viabledev.rest.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class StudentService implements IStudentService{

    @Autowired
    private StudentRepo repo;

    @Override
    public Student saveStudent(Student student){
            //Logic to store the data in DB
            repo.save(student);
            return student;
    }

    @Override
    public List<Student> getAllStudent() {

        return repo.findAll();
    }

    @Override
    public Student getStudentById(Integer id) {

        Optional<Student> optional =  repo.findById(id);
        return optional.get();
    }

    @Override
    public void deleteStudentById(Integer id) {
        repo.deleteById(id);
    }

}
