package com.comprehensive.comprehensiveassesment.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DOCTOR_TBL")
public class DoctorEntity {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int age;
	private String gender;
	private String specialist;
	
	
	
	public DoctorEntity() {
		super();
	}



	public DoctorEntity(int id, String name, int age, String gender, String specialist) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.specialist = specialist;
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



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getSpecialist() {
		return specialist;
	}



	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}



	@Override
	public String toString() {
		return "DoctorEntity [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", specialist="
				+ specialist + "]";
	}
	
	
	
	
}
