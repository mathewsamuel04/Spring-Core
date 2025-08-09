package com.tnsif.springcoreexample;

public class College {
	private Student student;
	
	private College() {
		System.out.println("College object created...");
	}
	
	public Student getStudent() {
		return student;
	}
	
	public void setStudent(Student student) {
		this.student = student;
	}
	public void show() {
		System.out.println("Student Name");
		student.display();
	}

}
