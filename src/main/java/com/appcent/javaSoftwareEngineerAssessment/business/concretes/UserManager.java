package com.appcent.javaSoftwareEngineerAssessment.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appcent.javaSoftwareEngineerAssessment.business.abstracts.UserService;
import com.appcent.javaSoftwareEngineerAssessment.core.utilities.results.DataResult;
import com.appcent.javaSoftwareEngineerAssessment.core.utilities.results.Result;
import com.appcent.javaSoftwareEngineerAssessment.core.utilities.results.SuccessDataResult;
import com.appcent.javaSoftwareEngineerAssessment.core.utilities.results.SuccessResult;
import com.appcent.javaSoftwareEngineerAssessment.dataAccess.abstracts.UserDao;
import com.appcent.javaSoftwareEngineerAssessment.entities.concretes.User;

@Service
public class UserManager implements UserService{

	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public DataResult<List<User>> getAll() {
		return new SuccessDataResult<List<User>>(this.userDao.findAll());
	}

	@Override
	public Result add(User user) {
		this.userDao.save(user);
		return new SuccessResult("User added");
	}

	@Override
	public Result update(User user) {
		this.userDao.save(user);
		return new SuccessResult("User updated");
	}

	@Override
	public Result delete(int id) {
		this.userDao.deleteById(id);
		return new SuccessResult("User deleted");
	}

}
