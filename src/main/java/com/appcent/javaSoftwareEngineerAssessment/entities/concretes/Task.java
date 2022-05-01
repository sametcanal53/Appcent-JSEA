package com.appcent.javaSoftwareEngineerAssessment.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tasks")
public class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="task_id")
	private int taskId;
	
	@Column(name="task_name")
	private String taskName;
	
	@ManyToOne()
	@JoinColumn(name="user_id")
	private User user;
	
	public Task(){}

	public Task(int taskId, String taskName, User user) {
		super();
		this.taskId = taskId;
		this.taskName = taskName;
		this.user = user;
	}

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
