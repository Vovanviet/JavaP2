package com.studentmanagement.services;

import com.studentmanagement.entity.Student;

import java.util.List;

public interface StudentServices {
     List<Student> getAllStudent() ;

    void addStudent(String rollNo,String name,int age,double mark);

    void searchStudent(String name);
    void deleteStudent(String name);
    void updateStudent(String name);

}
