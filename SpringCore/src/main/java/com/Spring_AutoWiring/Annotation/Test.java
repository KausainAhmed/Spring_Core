package com.Spring_AutoWiring.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Kausain Ahmed
 *
 */
public class Test {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("Annotation_AutoWiring.xml");
	Employee e=context.getBean("employee",Employee.class);
	System.out.println(e);
}
}
