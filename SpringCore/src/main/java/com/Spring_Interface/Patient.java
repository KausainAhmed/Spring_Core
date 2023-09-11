package com.Spring_Interface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements DisposableBean,InitializingBean{
private int id;

public int getId() {
	return id;
}

public void setId(int id) {
	System.out.println("Inside setter method");
	this.id = id;
}

public void hi() {
	System.out.println("Inside hi method");
}
public void bye() {
	System.out.println("Inside by method");
}

@Override
public String toString() {
	return "Patient [id=" + id + "]";
}

public void afterPropertiesSet() throws Exception {
System.out.println("Inside afterProperties method");
}

public void destroy() throws Exception {
System.out.println("Inside destroy method");	
}
}
