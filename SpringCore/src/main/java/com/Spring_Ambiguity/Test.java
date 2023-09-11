package com.Spring_Ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("Ambiguity.xml");
Addition addition = (Addition) context.getBean("addition");
System.out.println(addition);
}
}
