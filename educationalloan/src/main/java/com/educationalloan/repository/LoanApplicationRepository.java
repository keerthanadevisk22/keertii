package com.educationalloan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educationalloan.model.LoanApplication;

@Repository
public interface LoanApplicationRepository extends JpaRepository<LoanApplication,Integer>{

}
