package com.appcent.javaSoftwareEngineerAssessment.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appcent.javaSoftwareEngineerAssessment.business.abstracts.UserService;
import com.appcent.javaSoftwareEngineerAssessment.core.utilities.results.DataResult;
import com.appcent.javaSoftwareEngineerAssessment.core.utilities.results.Result;
import com.appcent.javaSoftwareEngineerAssessment.entities.concretes.User;

@RestController
@RequestMapping("/api/users")
public class UserController {

	private UserService userService;

	@Autowired
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<User>> getAll(){
		return this.userService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody User user){
		return this.userService.add(user);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody User user){
		return this.userService.update(user);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestBody int id){
		return this.userService.delete(id);
	}
}
