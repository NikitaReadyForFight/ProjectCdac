package com.spr.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.spr.dao.DoctorDao;
import com.spr.dao.DoctorDaoImple;
import com.spr.dto.Doctor;


public class DoctorServiceImple implements DoctorService {
	
	@Autowired
	private DoctorDaoImple DoctorDaoimple;
	
	@Override
	public void insertDoctor(Doctor doctor) {
		System.out.println("Doctor provide services..........");
		DoctorDaoimple.insertDoctor(doctor);
		
	}

	@Override
	public void updateDoctor(Doctor doctor) {
		System.out.println("Doctor provide services..........");
		DoctorDaoimple.updateDoctor(doctor);
		
	}

	@Override
	public void deleteDoctor(int id) {
		System.out.println("Doctor provide services..........");
		DoctorDaoimple.deleteDoctor(id);
		
	}

	@Override
	public Doctor findDoctorById(int id) {
		return DoctorDaoimple.findDoctorById(id) ;
	}

	@Override
	public List<Doctor> getAllDoctors() {
		
		return DoctorDaoimple.getAllDoctors();
	}

	
	
}

	

