package com.viabledev.service;

import com.viabledev.rest.Student;

import java.util.List;


public interface IStudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudent();
    public Student getStudentById(Integer id);
    public void deleteStudentById(Integer id);
}
