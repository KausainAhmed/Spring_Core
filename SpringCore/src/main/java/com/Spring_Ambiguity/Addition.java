package com.Spring_Ambiguity;

public class Addition {

	/*
	 * public Addition(double a ,double b) {
	 * System.out.println("inside const double"); }
	 */

	/*
	 * public Addition(int a ,int b) { System.out.println("inside const int"); }
	 */

	/*
	 * public Addition(String a ,String b) {
	 * System.out.println("inside const String"); }
	 */
	
	  Addition(int a, double b) { System.out.println("Inside the constructor");
	  System.out.println(a); System.out.println(b); }
	 

}

//when we taking different type values ( double,double) , it gives ambiguity error
