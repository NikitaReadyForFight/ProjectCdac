package com.spr.dto;

import java.util.Date;

public class Doctor {
	
	private int Doctor_id;
	private Date Hire_date;
	private String Qualification;
	private String Specialization;
	
	public String getSpecialization() {
		return Specialization;
	}
	public void setSpecialization(String specialization) {
		Specialization = specialization;
	}
	public int getDoctor_id() {
		return Doctor_id;
	}
	public void setDoctor_id(int doctor_id) {
		Doctor_id = doctor_id;
	}
	public Date getHire_date() {
		return Hire_date;
	}
	public void setHire_date(Date hire_date) {
		Hire_date = hire_date;
	}
	public String getQualification() {
		return Qualification;
	}
	public void setQualification(String qualification) {
		Qualification = qualification;
	}
	
	}


