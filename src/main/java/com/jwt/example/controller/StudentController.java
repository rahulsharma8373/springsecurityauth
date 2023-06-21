package com.jwt.example.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import com.jwt.example.payload.StudentDto;

import com.jwt.example.service.StudentServiceImpl;
@RestController
public class StudentController {
	
	
	@Autowired
	private StudentServiceImpl studentServiceImpl;
	//FindAllEmployee
		@GetMapping("/getStudent")
		
		public ResponseEntity<List<StudentDto>> getAllEmployee(){
			
			List<StudentDto> emplo=studentServiceImpl.getAllEmployee();
		 
			return new ResponseEntity(emplo,HttpStatus.OK);
			
		
		}
}
