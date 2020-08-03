package com.producer.model;

public class Person {
	
	int id;
	String name;
	int age;
	String about;
	
	public Person(int id, String name, int age, String about) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.about = about;
	}

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}
	
	

}
