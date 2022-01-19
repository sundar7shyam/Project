package com.comprehensive.comprehensiveassesment.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.comprehensive.comprehensiveassesment.entity.PatientEntity;

public interface PatientRepository extends JpaRepository<PatientEntity, Integer> {

	
	PatientEntity findByName(String name);
	
	public List<PatientEntity> patient = new ArrayList<PatientEntity>();
	
	public default List<PatientEntity> getAll(){
		return patient;
	}
}
