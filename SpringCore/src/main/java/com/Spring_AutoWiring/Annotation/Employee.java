package com.Spring_AutoWiring.Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	@Autowired
	@Qualifier("add3")
private Address address;

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}

@Override
public String toString() {
	return "Employee [address=" + address + "]";
}

public Employee(Address address) {
	super();
	this.address = address;
}

public Employee() {
	super();
}
}
