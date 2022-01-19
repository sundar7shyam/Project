package com.comprehensive.comprehensiveassesment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comprehensive.comprehensiveassesment.entity.PatientEntity;
import com.comprehensive.comprehensiveassesment.repository.PatientRepository;

@Service
public class PatientService {

	@Autowired
	public PatientRepository patientRepository;
	
	public List<PatientEntity> getAll(){
		return patientRepository.getAll();
	}
	
	public PatientEntity savePatient(PatientEntity patient) {
		return patientRepository.save(patient);
	}
	
	public List<PatientEntity> savePatients(List<PatientEntity> patients) {
		return patientRepository.saveAll(patients);
	}
	
	public List<PatientEntity> getPatients(){
		return patientRepository.findAll();
	}
	
	
	
	public PatientEntity getPatientById(int id) {
		return patientRepository.findById(id).orElse(null);
	}
	
	
	public PatientEntity getPatientByName(String name) {
		return patientRepository.findByName(name);
	}
	
	public String deletePatient(int id) {
		patientRepository.deleteById(id);
		return "doctor removed"+ id;
	}
	
	public PatientEntity updatePatient(PatientEntity patient) {
		PatientEntity existingPatient = patientRepository.findById(patient.getId()).orElse(null);
		existingPatient.setName(patient.getName());
		existingPatient.setVisitedDoctor(patient.getVisitedDoctor());
		existingPatient.setDateOfVisit(patient.getDateOfVisit());
		return patientRepository.save(existingPatient);
	}

	
	
	
}
