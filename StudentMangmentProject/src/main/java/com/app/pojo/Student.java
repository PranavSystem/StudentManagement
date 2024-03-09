package com.app.pojo;

import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity
@Table(name="Student")
public class Student extends Baseentity{
	private long id;
	private String name;
	private int rollno;
	private String division;
	private String classname;
	public Student(long id, String name, int rollno, String division, String classname) {
		super();
		this.id = id;
		this.name = name;
		this.rollno = rollno;
		this.division = division;
		this.classname = classname;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rollno=" + rollno + ", division=" + division + ", classname="
				+ classname + "]";
	}
	
	
	

}
