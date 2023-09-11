package com.Spring.Interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
ApplicationContext context=new ClassPathXmlApplicationContext("Spring_Interfaces.xml");

OrderBO bo=(OrderBO) context.getBean("bo");
bo.placeOrder();
}}
