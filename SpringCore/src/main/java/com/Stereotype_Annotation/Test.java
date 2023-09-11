package com.Stereotype_Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import com.Stereotype_Annotation.suraj.*;
@Component
public class Test {
public void m1() {
	System.out.println("hi");
}
public static void main(String[] args) {
	
	ApplicationContext context=new ClassPathXmlApplicationContext("Annotation_Stereotype.xml");
	Instructor instructor=(Instructor)context.getBean("suraj");
	System.out.println(instructor);
	
	//Test1 bean= (Test1)context.getBean("test1");
	Test bean= (Test)context.getBean("test");
	bean.m1();
	System.out.println(bean.getClass().getName());
	
	Instructor instructor2 = (Instructor) context.getBean("suraj");
	System.out.println(instructor2);
}
}
