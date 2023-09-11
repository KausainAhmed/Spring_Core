package com.Spring.Interfaces;

import org.springframework.stereotype.Component;

@Component("dao")
public class OrderDaoImpl {
public void createOrder() {
	System.out.println("Inside order DAO createOrder()");
}
}
