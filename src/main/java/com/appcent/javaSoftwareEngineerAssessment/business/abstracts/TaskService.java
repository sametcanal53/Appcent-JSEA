package com.appcent.javaSoftwareEngineerAssessment.business.abstracts;

import java.util.List;

import com.appcent.javaSoftwareEngineerAssessment.core.utilities.results.DataResult;
import com.appcent.javaSoftwareEngineerAssessment.core.utilities.results.Result;
import com.appcent.javaSoftwareEngineerAssessment.entities.concretes.Task;

public interface TaskService {

	DataResult<List<Task>> getAll();
	Result add(Task task);
	Result update(Task task);
	Result delete(int id);
	
	DataResult<Task> getByTaskName(String taskName);
	DataResult<List<Task>> getByUserId(int id);
	DataResult<List<Task>> getByTaskNameContains(String taskName);
}
