package com.jwt.example.payload;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class StudentDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
private String name;
private int age;

public StudentDto() {
	
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

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
}

public StudentDto(long id, String name, int age) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
}
}
