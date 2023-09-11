package com.Stereotype_Annotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("suraj")
@Scope("prototype")
public class Instructor {
	// private int id;
	// private String name;

//	@Value("#{T(java.lang.Integer).MIN_VALUE}")
	@Value("10")
	private int id = 20;
//	@Value("#{new java.lang.String('suraj')}")
	@Value("suraj")
	private String name = "osman";
@Value("#{topics}")
	private List<String> topics;
//@Value("#{2+4>8?true:false}")private boolean active;
@Autowired
	private Profile profile;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getTopics() {
		return topics;
	}

	public void setTopics(List<String> topics) {
		this.topics = topics;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", topics=" + topics + ", profile=" + profile + "]";
	}

}
