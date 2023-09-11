package com.Standalone_Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Standalone_Collection.xml");

		ProductList pl = (ProductList) context.getBean("productList");
		System.out.println(pl);
	}
}
