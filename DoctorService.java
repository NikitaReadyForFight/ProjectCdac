package com.spr.service;

import java.util.List;

import com.spr.dto.Doctor;


public interface DoctorService {
	
	public void insertDoctor(Doctor doctor);
	public void updateDoctor(Doctor doctor);
	public void deleteDoctor(int id);
	public Doctor findDoctorById(int id);
	public List<Doctor> getAllDoctors();
}
