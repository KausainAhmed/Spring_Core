package com.SpringFramework.SpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ClassPathXmlApplicationContext obj=new ClassPathXmlApplicationContext("Config.xml");
System.out.println(obj.getClass().getName());
Employee bean=(Employee)obj.getBean("emp");
System.out.println(bean.getId());
System.out.println(bean.getName());
System.out.println(bean.getClass().getName());
}
}
