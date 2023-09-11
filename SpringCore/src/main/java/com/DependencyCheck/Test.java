package com.DependencyCheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("DependencyCheck.xml");
	Prescription prescription = (Prescription) context.getBean("prescription");
	
	System.out.println(prescription);
}
}
