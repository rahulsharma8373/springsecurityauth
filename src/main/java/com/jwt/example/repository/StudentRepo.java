package com.jwt.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jwt.example.model.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student,Long>{

}
