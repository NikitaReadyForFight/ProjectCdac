package com.spr.service;

import java.util.List;

import com.spr.dto.Diagnosis;

public interface DiagnosisService {
	
	public void insertDiagnosis(Diagnosis diagnosis);
	public void updateDiagnosis(Diagnosis diagnosis);
	public void deleteDiagnosis(int id);
	
	public List<Diagnosis> getAllDiagnosis();

}
