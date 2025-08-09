package com.tnsif.springcore2;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	  public static void main(String[] args) {
		   ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml"); 
		   College college = context.getBean("college",College.class);
		   
		   college.shoeCollegeDetails();
		  }
}
