package com.Spring.Interfaces;

import org.springframework.stereotype.Component;

@Component("dao2")
public class OrderDaoImpl2 implements OrderDao {

	public void createOrder() {
		System.out.println("Inside orderDAOImpl2 createOrder");
	}

}
