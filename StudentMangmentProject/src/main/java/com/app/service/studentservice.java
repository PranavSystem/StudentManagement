package com.app.service;

import org.springframework.stereotype.Service;

import com.app.pojo.Student;


public interface studentservice 
{
 Student addstudent(Student stud);
 String deleteStudent(long id);
 Student updateStudent(Student stud,long id);
 Student getstudent(long id);
 
 
}
