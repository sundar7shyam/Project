package com.comprehensive.comprehensiveassesment.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="PATIENT_TBL")
public class PatientEntity {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String visitedDoctor;
	private Date dateOfVisit;
	
	
	public PatientEntity() {
		super();
	}


	public PatientEntity(int id, String name, String visitedDoctor, Date dateOfVisit) {
		super();
		this.id = id;
		this.name = name;
		this.visitedDoctor = visitedDoctor;
		this.dateOfVisit = dateOfVisit;
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


	public String getVisitedDoctor() {
		return visitedDoctor;
	}


	public void setVisitedDoctor(String visitedDoctor) {
		this.visitedDoctor = visitedDoctor;
	}


	public Date getDateOfVisit() {
		return dateOfVisit;
	}


	public void setDateOfVisit(Date dateOfVisit) {
		this.dateOfVisit = dateOfVisit;
	}


	@Override
	public String toString() {
		return "PatientEntity [id=" + id + ", name=" + name + ", visitedDoctor=" + visitedDoctor + ", dateOfVisit="
				+ dateOfVisit + "]";
	}
	
	
	

}
