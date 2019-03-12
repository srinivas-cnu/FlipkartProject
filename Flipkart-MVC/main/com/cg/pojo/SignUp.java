package com.cg.pojo;

public class SignUp 
{
//	private String FirstName;
//	private String LastName;
//    private String email;
//    private int MobileNumber;
    private String username;
    private String Password;
//    private String RepeatPassword;
	
    public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "SignUp [username=" + username + ", Password=" + Password + "]";
	}
	public SignUp(String username, String password) {
		super();
		this.username = username;
		Password = password;
	}
    

    
}