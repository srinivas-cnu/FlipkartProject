package com.cg.dao;


import com.cg.pojo.Login;
import com.cg.pojo.SignUp;

public interface UserDao {

	void register(SignUp user);
	SignUp validateUser(Login login);
	
}
