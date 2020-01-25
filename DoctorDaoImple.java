package com.spr.dao;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spr.dto.Doctor;
import com.spr.dto.DoctorRowMapper;

@Transactional
@Repository
public class DoctorDaoImple implements DoctorDao {
	
private JdbcTemplate jdbcTemplate;	

	@Override
	public void insertDoctor(Doctor doctor) {
		String query = "insert into doctor (doctorId,hire_date,qualification,specialized) values(?,?,?,?)";
		jdbcTemplate.update(query,doctor.getDoctor_id(),doctor.getHire_date(),doctor.getQualification(),doctor.getSpecialization());
	}

	@Override
	public void updateDoctor(Doctor doctor) {
		String query = "update doctor set doctorId=?,hire_date=?,qualification=?,specialized=?) ";
		jdbcTemplate.update(query,doctor.getDoctor_id(),doctor.getHire_date(),doctor.getQualification(),doctor.getSpecialization());
	}

	
	@Override
	public Doctor findDoctorById(int id) {
		String query = "select *from doctor where doctorId=?";
		RowMapper<Doctor> rowMapper = new BeanPropertyRowMapper<Doctor>(Doctor.class);
		Doctor doctor = jdbcTemplate.queryForObject(query,rowMapper,id);
		return doctor;
	}

	@Override
	public List<Doctor> getAllDoctors() {
		String query = "select * from doctor";
		RowMapper<Doctor> rowMapper = new DoctorRowMapper();
		  List<Doctor> list = jdbcTemplate.query(query, rowMapper);
		  
		  return list;
	}

	@Override
	public void deleteDoctor(int id) {
		String query = "delete from doctor where doctorId=?";
		  jdbcTemplate.update(query, id);
	}

}
