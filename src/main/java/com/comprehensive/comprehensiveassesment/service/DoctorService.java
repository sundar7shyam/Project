package com.comprehensive.comprehensiveassesment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comprehensive.comprehensiveassesment.entity.DoctorEntity;
import com.comprehensive.comprehensiveassesment.repository.DoctorRepository;

@Service
public class DoctorService {

	
	@Autowired
	public DoctorRepository doctorRepository;
	
	public List<DoctorEntity> getAll(){
		return doctorRepository.getAll();
	}
	
	
	public DoctorEntity saveDoctor(DoctorEntity doctor) {
		return doctorRepository.save(doctor);
	}
	
	public List<DoctorEntity> saveDoctors(List<DoctorEntity> doctors) {
		return doctorRepository.saveAll(doctors);
	}
	
	public List<DoctorEntity> getDoctors(){
		return doctorRepository.findAll();
	}
	
	
	
	public DoctorEntity getDoctorById(int id) {
		return doctorRepository.findById(id).orElse(null);
	}
	
	
	public DoctorEntity getDoctorByName(String name) {
		return doctorRepository.findByName(name);
	}
	
	public String deleteDoctor(int id) {
		doctorRepository.deleteById(id);
		return "doctor removed"+ id;
	}
	
	public DoctorEntity updateDoctor(DoctorEntity doctor) {
		DoctorEntity existingDoctor = doctorRepository.findById(doctor.getId()).orElse(null);
		existingDoctor.setName(doctor.getName());
		existingDoctor.setAge(doctor.getAge());
		existingDoctor.setGender(doctor.getGender());
		existingDoctor.setSpecialist(doctor.getSpecialist());
		return doctorRepository.save(existingDoctor);
	}
	
	
	
}
