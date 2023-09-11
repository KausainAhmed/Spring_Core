package com.Stereotype_Annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Profile {

	@Value("Java Architect and Instructor")
	private String title;
	@Value("suraj Consulting")
	private String Company;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	@Override
	public String toString() {
		return "Profile [title=" + title + ", Company=" + Company + "]";
	}
	
}
