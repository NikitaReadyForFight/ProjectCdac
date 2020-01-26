package com.spr.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spr.dto.Diagnosis;
import com.spr.dto.DiagnosisRowMapper;


@Transactional
@Repository
public class DiagnosisDaoImple implements DiagnosisDao{

	private JdbcTemplate jdbcTemplate;	
	@Override
	public  void insertDiagnosis(Diagnosis diagnosis) {
		String query = "insert into diagnosis (patientId,doctor_name,doctor_type,diagnosis_result) values(?,?,?,?)";
		jdbcTemplate.update(query,diagnosis.getPatient_id(),diagnosis.getDoctor_Name(),diagnosis.getDiagnosis_Result(),diagnosis.getDiagnosis_Result());
		
	}

	@Override
	public void updateDiagnosis(Diagnosis diagnosis) {
		// TODO Auto-generated method stub
		String query = "update doctor set patientId=?,doctor_name=?,doctor_type=?,diagnosis_result=? ) ";
		jdbcTemplate.update(query,diagnosis.getPatient_id(),diagnosis.getDoctor_Name(),diagnosis.getDiagnosis_Type(),diagnosis.getDiagnosis_Result());
	}

	@Override
	public void deleteDiagnosis(int id) {
		// TODO Auto-generated method stub
		String query = "delete from diagnosis where patientId=?";
		  jdbcTemplate.update(query, id);
	}

	@Override
	public List<Diagnosis> getAllDiagnosis() {
		String query = "select * from diagnosis";
		RowMapper<Diagnosis> rowMapper = new DiagnosisRowMapper();
		  List<Diagnosis> list = jdbcTemplate.query(query, rowMapper);
		  
		  return list;
		
	}

}
