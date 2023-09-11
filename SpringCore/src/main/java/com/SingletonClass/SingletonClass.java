package com.SingletonClass;

import java.io.Serializable;

public class SingletonClass implements Serializable{
private static SingletonClass obj=null;
private SingletonClass() {
	
}
public static SingletonClass getInstance() {
	if(obj==null) {
		obj=new SingletonClass();
		return obj;
	}else 
		return obj;
}
}
