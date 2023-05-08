package com.educationalloan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.educationalloan.model.Admin;
import com.educationalloan.model.LoanApplication;
import com.educationalloan.model.Login;
import com.educationalloan.model.User;
import com.educationalloan.service.Services;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;


@RestController
public class Controller {
	@Autowired
	Services userService;
	@Operation(summary = "Get all the details")

	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "data fetched successfully"),

			@ApiResponse(responseCode = "401", description = "Invalid credentials"),

			@ApiResponse(responseCode = "404", description = "Path not found") })

	
	
	@GetMapping(value="/fetchLogin")
	public List<Login> getAllLogin()
	{
		return userService.getAllLogin();
	}
	
	 @PostMapping("/addUser")
	 public Login saveUser(@RequestBody Login l)
	 {
	    return userService.saveUser(l);
	 }
	 
	 @GetMapping(value="/fetchAdmin")
	 public List<Admin> getAllAdmin()
	 {
		 return userService.getAllAdmin();
	 }
	 
	 @GetMapping(value="/fetchLoan")
	 public List<LoanApplication> getAllLoans()
	 {
		 return userService.getAllLoans();
	 }
	 
	 @PostMapping("/checkLogin")
		public String validateUser(@RequestBody Login l)
		{
		System.out.println(l.getEmail());
			return userService.validateUser(l.getEmail(),l.getPassword());
		}
	 
	 @PostMapping("/saveLoan")
	 public LoanApplication saveLoan(LoanApplication s) {
			LoanApplication obj=userService.saveLoan(s);
			return obj;
		}
	 
	 @PutMapping("/updateLoan")
		public LoanApplication updateLoan(LoanApplication s) {
			 return userService.updateLoan(s);
		}

	 @DeleteMapping("/deleteLoan")
		public void deleteLoan(int id) {
			userService.deleteLoan(id);
		}
	 
	 @GetMapping(value="/fetchUser")
	 public List<User> getAllUser()
	 {
		 return userService.getAllUser();
	 }
	 
	 @PostMapping("/saveUser")
	 public User saveUser(User s) {
			return userService.saveUser(s);
		}
	 
	 @PutMapping("/updateUser")
		public User updateUser(User s) {
			 return userService.updateUser(s);
		}

	 @DeleteMapping("/deleteUser")
		public void deleteUser(int id) {
			userService.deleteUser(id);
		}
}
