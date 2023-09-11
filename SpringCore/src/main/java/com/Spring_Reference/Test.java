package com.Spring_Reference;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	
	ClassPathXmlApplicationContext c=new ClassPathXmlApplicationContext("Reference.xml");
	Student st = (Student) c.getBean("student");
	System.out.println(st);
	
}
}
