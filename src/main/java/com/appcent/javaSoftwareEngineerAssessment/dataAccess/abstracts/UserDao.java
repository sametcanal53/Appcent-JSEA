package com.appcent.javaSoftwareEngineerAssessment.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.appcent.javaSoftwareEngineerAssessment.entities.concretes.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer>{

}
