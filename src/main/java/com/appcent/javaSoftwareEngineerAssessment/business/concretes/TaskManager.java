package com.appcent.javaSoftwareEngineerAssessment.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appcent.javaSoftwareEngineerAssessment.business.abstracts.TaskService;
import com.appcent.javaSoftwareEngineerAssessment.core.utilities.results.DataResult;
import com.appcent.javaSoftwareEngineerAssessment.core.utilities.results.Result;
import com.appcent.javaSoftwareEngineerAssessment.core.utilities.results.SuccessDataResult;
import com.appcent.javaSoftwareEngineerAssessment.core.utilities.results.SuccessResult;
import com.appcent.javaSoftwareEngineerAssessment.dataAccess.abstracts.TaskDao;
import com.appcent.javaSoftwareEngineerAssessment.entities.concretes.Task;

@Service
public class TaskManager implements TaskService{

	private TaskDao taskDao;
	
	@Autowired
	public TaskManager(TaskDao taskDao) {
		super();
		this.taskDao = taskDao;
	}

	@Override
	public DataResult<List<Task>> getAll() {
		return new SuccessDataResult<List<Task>>(this.taskDao.findAll());
	}

	@Override
	public Result add(Task task) {
		this.taskDao.save(task);
		return new SuccessResult("Task added");
	}

	@Override
	public Result update(Task task) {
		this.taskDao.save(task);
		return new SuccessResult("Task updated");
	}

	@Override
	public Result delete(int id) {
		this.taskDao.deleteById(id);
		return new SuccessResult("Task deleted");
	}

	@Override
	public DataResult<Task> getByTaskName(String taskName) {
		return new SuccessDataResult<Task>(this.taskDao.getByTaskName(taskName),"Get by Task Name ");
	}

	@Override
	public DataResult<List<Task>> getByUserId(int id) {
		return new SuccessDataResult<List<Task>>(this.taskDao.getByUserId(id),"Get by User ID");
	}

	@Override
	public DataResult<List<Task>> getByTaskNameContains(String taskName) {
		return new SuccessDataResult<List<Task>>(this.taskDao.getByTaskNameContains(taskName),"Get By Task Name Contains");
	}

}
