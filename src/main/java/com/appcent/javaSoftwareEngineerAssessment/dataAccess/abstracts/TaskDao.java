package com.appcent.javaSoftwareEngineerAssessment.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.appcent.javaSoftwareEngineerAssessment.entities.concretes.Task;

@Repository
public interface TaskDao extends JpaRepository<Task, Integer>{

	Task getByTaskName(String taskName);
	List<Task> getByUserId(int id);
	@Query("select t from Task t where lower(t.taskName) like lower(concat('%', :taskName,'%'))")
	List<Task> getByTaskNameContains(String taskName);
}
