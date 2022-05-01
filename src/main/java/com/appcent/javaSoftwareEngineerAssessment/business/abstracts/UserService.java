package com.appcent.javaSoftwareEngineerAssessment.business.abstracts;

import java.util.List;

import com.appcent.javaSoftwareEngineerAssessment.core.utilities.results.DataResult;
import com.appcent.javaSoftwareEngineerAssessment.core.utilities.results.Result;
import com.appcent.javaSoftwareEngineerAssessment.entities.concretes.User;

public interface UserService {

	DataResult<List<User>> getAll();
	Result add(User user);
	Result update(User user);
	Result delete(int id);
	
}
