package com.jwt.example.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jwt.example.model.Student;
import com.jwt.example.payload.StudentDto;
import com.jwt.example.repository.StudentRepo;
@Service
public class StudentServiceImpl implements StudentService{

	@Autowired 
	private StudentRepo studentRepo;
	
	@Autowired 
	private ModelMapper modelMapper;
	
	@Override
	public List<StudentDto> getAllEmployee() {
		List<Student> emp =studentRepo.findAll(); 
		return emp.stream().map((user) -> modelMapper.map(user,StudentDto.class)).collect(Collectors.toList());
	}

}
