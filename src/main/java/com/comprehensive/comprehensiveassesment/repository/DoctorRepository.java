package com.comprehensive.comprehensiveassesment.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.comprehensive.comprehensiveassesment.entity.DoctorEntity;

@Repository
public interface DoctorRepository extends JpaRepository<DoctorEntity, Integer> {

	DoctorEntity findByName(String name);
	
	public List<DoctorEntity> doctor = new ArrayList<DoctorEntity>();
	
	public default List<DoctorEntity> getAll(){
		return doctor;
	}
	
}
