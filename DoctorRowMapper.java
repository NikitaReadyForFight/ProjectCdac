package com.spr.dto;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class DoctorRowMapper implements RowMapper<Doctor> {
	
	@Override
	 public Doctor mapRow(ResultSet rs, int rowNum) throws SQLException {
	  Doctor doctor = new Doctor();
	  doctor.setDoctor_id(rs.getInt("doctorId"));
	  doctor.setHire_date(rs.getDate("hire_date"));
	  doctor.setQualification(rs.getString("qualification"));
	  doctor.setSpecialization(rs.getString("specialization"));
	  return doctor;
	 }

	}

