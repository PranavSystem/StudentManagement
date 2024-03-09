package com.app.repsoitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojo.Student;

public interface studentrepo extends JpaRepository<Student, Long> {

}
