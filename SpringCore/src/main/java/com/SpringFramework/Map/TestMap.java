package com.SpringFramework.Map;

import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMap {
	public static void main(String[] args) {
	
ClassPathXmlApplicationContext c=new ClassPathXmlApplicationContext("Config.xml");
Customer bean=(Customer) c.getBean("cust");
System.out.println(bean.getId());
System.out.println(bean.getProduct());

Map<Integer, String> pro = bean.getProduct();
bean.getId();
for (Map.Entry<Integer, String> m :pro.entrySet()) {
	System.out.println(m.getKey()+" "+m.getValue());
}
}
}