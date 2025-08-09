package com.tnsif.springcore2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class College {
 private Student student;
 

 public College(Student student) {
	this.student = student;
	
 }
public void shoeCollegeDetails() {
	System.out.println("welcome to College...");
	student.showStudent();
}
}
