package com.cg.pojo;

public class SignUp 
{
	private String FirstName;
	private String LastName;
    private String email;
    private int MobileNumber;
    private String username;
    private String Password;
    private String RepeatPassword;
    
	public SignUp(String firstName, String lastName, String email, int mobileNumber, String username, String password,
			String repeatPassword) {
		super();
		FirstName = firstName;
		LastName = lastName;
		this.email = email;
		MobileNumber = mobileNumber;
		this.username = username;
		Password = password;
		RepeatPassword = repeatPassword;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(int mobileNumber) {
		MobileNumber = mobileNumber;
	}
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
	public String getRepeatPassword() {
		return RepeatPassword;
	}
	public void setRepeatPassword(String repeatPassword) {
		RepeatPassword = repeatPassword;
	}
	@Override
	public String toString() {
		return "SignUp [FirstName=" + FirstName + ", LastName=" + LastName + ", email=" + email + ", MobileNumber="
				+ MobileNumber + ", username=" + username + ", Password=" + Password + ", RepeatPassword="
				+ RepeatPassword + "]";
	}
   
    
}