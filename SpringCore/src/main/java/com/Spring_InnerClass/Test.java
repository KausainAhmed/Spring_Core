package com.Spring_InnerClass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("InnerClass.xml");
	Employee employee= (Employee) context.getBean("employee");
	System.out.println(employee.hashCode());
	
	Employee employee2=(Employee) context.getBean("employee");
	System.out.println(employee2.hashCode());
	
	SingletonClass s1=SingletonClass.getInstance();
	SingletonClass s2=SingletonClass.getInstance();
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
}
}
