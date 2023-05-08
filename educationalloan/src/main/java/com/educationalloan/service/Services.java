package com.educationalloan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educationalloan.model.Admin;
import com.educationalloan.model.LoanApplication;
import com.educationalloan.model.Login;
import com.educationalloan.model.User;
import com.educationalloan.repository.AdminRepository;
import com.educationalloan.repository.LoanApplicationRepository;
import com.educationalloan.repository.LoginRepository;
import com.educationalloan.repository.UserRepository;


@Service
public class Services {
	
	@Autowired
	LoginRepository loginRepository;
	
	@Autowired
	AdminRepository adminRepo;
	
	@Autowired
	LoanApplicationRepository loanRepo;
	
	@Autowired
	UserRepository userRepo;
	
	public Login saveUser(Login l)
	{
		return loginRepository.save(l);
	}
	
	public String validateUser(String email,String password)
	{
		String result="";
		Login l=loginRepository.findByEmail(email);
		if(l==null)
		{
			result="Invalid email";
		}
		else
		{
			if(l.getPassword().equals(password))
			{
				result="Login success";
			}
			else
			{
				result="Login failed";
			}
		}
		return result;
	}

	public List<Login> getAllLogin() {
		return loginRepository.findAll();
	}
	
	public List<Admin> getAllAdmin() {
		return adminRepo.findAll();
	}
	
	//loanApplication
	public List<LoanApplication> getAllLoans() {
		return loanRepo.findAll();
	}
	
	public LoanApplication saveLoan(LoanApplication s) {
		LoanApplication obj=loanRepo.save(s);
		return obj;
	}

	public LoanApplication updateLoan(LoanApplication s) {
		 return loanRepo.saveAndFlush(s);
	}

	public void deleteLoan(int loanId) {
		loanRepo.deleteById(loanId);
	}
	
	//User
	public List<User> getAllUser() {
		return userRepo.findAll();
	}
	
	public User saveUser(User s) {
		User obj=userRepo.save(s);
		return obj;
	}

	public User updateUser(User s) {
		 return userRepo.saveAndFlush(s);
	}

	public void deleteUser(int id) {
		userRepo.deleteById(id);
	}
}
