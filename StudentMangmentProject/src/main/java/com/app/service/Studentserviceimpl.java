package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.Exception.CustomException;
import com.app.pojo.Student;
import com.app.repsoitory.studentrepo;

@Service
@Transactional
public class Studentserviceimpl implements studentservice
{
@Autowired
private studentrepo srepo;
	@Override
	public Student addstudent(Student stud) {
		Student stud1=srepo.save(stud);
		return stud1;
	}

	@Override
	public String deleteStudent(long id) 
	{
		Student stud1=srepo.findById(id).orElseThrow(()-> new CustomException(" id is wrong please neter a correct id"));
		srepo.delete(stud1);
		return "Student is deleted ";
	}

	@Override
	public Student updateStudent(Student stud, long id) {
		Student stud1=srepo.findById(id).orElseThrow(()-> new CustomException(" id is wrong please neter a correct id"));
		Student stud2=srepo.save(stud1);
		
		return stud2;
	}

	@Override
	public Student getstudent(long id) {
		Student stud=srepo.findById(id).orElseThrow(()-> new CustomException(" id is wrong please enter a correct id"));
		
		return stud;
	}

}
