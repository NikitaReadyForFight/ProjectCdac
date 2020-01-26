package com.spr.dto;

public class Diagnosis {
	private int Patient_id;
	private String Doctor_Name;
	private String Diagnosis_Type;
	private String Diagnosis_Result;
	@Override
	public String toString() {
		return "Diagnosis [Patient_id=" + Patient_id + ", Doctor_Name=" + Doctor_Name + ", Diagnosis_Type="
				+ Diagnosis_Type + ", Diagnosis_Result=" + Diagnosis_Result + "]";
	}
	public Diagnosis() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Diagnosis(int patient_id, String doctor_Name, String diagnosis_Type, String diagnosis_Result) {
		super();
		Patient_id = patient_id;
		Doctor_Name = doctor_Name;
		Diagnosis_Type = diagnosis_Type;
		Diagnosis_Result = diagnosis_Result;
	}
	public int getPatient_id() {
		return Patient_id;
	}
	public void setPatient_id(int patient_id) {
		Patient_id = patient_id;
	}
	public String getDoctor_Name() {
		return Doctor_Name;
	}
	public void setDoctor_Name(String doctor_Name) {
		Doctor_Name = doctor_Name;
	}
	public String getDiagnosis_Type() {
		return Diagnosis_Type;
	}
	public void setDiagnosis_Type(String diagnosis_Type) {
		Diagnosis_Type = diagnosis_Type;
	}
	public String getDiagnosis_Result() {
		return Diagnosis_Result;
	}
	public void setDiagnosis_Result(String diagnosis_Result) {
		Diagnosis_Result = diagnosis_Result;
	}
	
}
