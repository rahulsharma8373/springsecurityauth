package com.jwt.example.service;

import java.util.List;

import com.jwt.example.payload.StudentDto;



public interface StudentService {

	//fatch ALL Employee in the Table
		List<StudentDto> getAllEmployee();
}
