package com.Spring_Annotation;
import javax.annotation.*;

public class Patient {
private int id;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

@Override
public String toString() {
	return "Patient [id=" + id + "]";
}
@PostConstruct
public void hi() {
	System.out.println("Inside hi method");
}

@PreDestroy
public void by() {
	System.out.println("Inside by method");
}

}
