package com.cg.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.cg.pojo.Login;
import com.cg.pojo.SignUp;

public class UserDaoImpl implements UserDao {
	
	@Autowired
	DataSource datasource;
	
	@Autowired
	JdbcTemplate jdbctemplate;

	public void register(SignUp user) {
		
		String sql="insert into cloud values(?,?)";
		
		jdbctemplate.update(sql,new Object[] { user.getUsername(),user.getPassword() });
		
	}

	public SignUp validateUser(Login login) {
		String sql="select * from cloud where username="+ login.getUsername() + "and password=" + login.getPassword()+"";
		
		List<User> users=jdbctemplate.query(sql,new UserMapper());
		return null;
	}

}
