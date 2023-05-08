package com.educationalloan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educationalloan.model.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login,String>{
	Login findByEmail(String email);
}
