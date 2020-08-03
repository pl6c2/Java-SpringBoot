package com.example.Model;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.lang.NonNull;

@Entity
@Table(name="employees")
@EntityListeners(AuditingEntityListener.class)
public class Employee {

	@Id
	private int id;
	@NotBlank
	private String name;
	@NonNull
	private int age;
	@NotBlank
	private String about;
	
	public Employee()
	{
		
	}
	public Employee(int id, String name, int age, String about) {
		super();
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
