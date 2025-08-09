package com.tnsif.springcoreexample;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
public class App {
  public static void main(String[] args) {
	  //it is the IOC container
	  //It reads and manages the beans
    ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    
    College college = (College)context.getBean("collageBean");
    
    college.show();
  }
}
