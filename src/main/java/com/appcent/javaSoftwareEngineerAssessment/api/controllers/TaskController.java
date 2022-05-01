package com.appcent.javaSoftwareEngineerAssessment.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.appcent.javaSoftwareEngineerAssessment.business.abstracts.TaskService;
import com.appcent.javaSoftwareEngineerAssessment.core.utilities.results.DataResult;
import com.appcent.javaSoftwareEngineerAssessment.core.utilities.results.Result;
import com.appcent.javaSoftwareEngineerAssessment.entities.concretes.Task;

@RestController
@RequestMapping("/api/tasks")
@CrossOrigin
public class TaskController {

	private TaskService taskService;
	
	@Autowired
	public TaskController(TaskService taskService) {
		super();
		this.taskService = taskService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<Task>> getAll(){
		return this.taskService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Task task){
		return this.taskService.add(task);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody Task task){
		return this.taskService.update(task);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestBody int id){
		return this.taskService.delete(id);
	}
	
	@GetMapping("/getByTaskName")
	public DataResult<Task> getByTaskName(@RequestParam String taskName){
		return this.taskService.getByTaskName(taskName);
	}
	
	@GetMapping("/getByUser")
	public DataResult<List<Task>> getByUserId(int id){
		return this.taskService.getByUserId(id);
	}
	
	@GetMapping("/getByTaskNameContains")
	public DataResult<List<Task>> getByTaskNameContains(String taskName){
		return this.taskService.getByTaskNameContains(taskName);
	}
	
}
