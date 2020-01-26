package com.spr.dto;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class DiagnosisRowMapper implements RowMapper<Diagnosis>{
	@Override
	 public Diagnosis mapRow(ResultSet rs, int rowNum) throws SQLException {
	  Diagnosis diagnosis = new Diagnosis();
	  diagnosis.setPatient_id(rs.getInt("patientId"));
	  diagnosis.setDoctor_Name(rs.getString("Doctor_Name"));
	  diagnosis.setDiagnosis_Type(rs.getString("Diagnosis_Type"));
	  diagnosis.setDiagnosis_Result(rs.getString("Diagnosis_Result"));
	  return diagnosis;
	 }
	

}
