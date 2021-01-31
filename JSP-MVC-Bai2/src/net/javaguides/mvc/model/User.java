package net.javaguides.mvc.model;

import java.io.Serializable;

public class User implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String fistName;
	private String lastName;
	private String email;
	private String passWord;
	private String birthday;
	private String gender;

	public User() {
		super();
	}
	public User( String fistName, String lastName, String email, String passWord, String birthday,
			String gender) {
		super();
	
		this.fistName = fistName;
		this.lastName = lastName;
		this.email = email;
		this.passWord = passWord;
		this.birthday = birthday;
		this.gender = gender;
	}
	
	public String getFistName() {
		return fistName;
	}
	public void setFistName(String fistName) {
		this.fistName = fistName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "User [ fistName=" + fistName + ", lastName=" + lastName + ", email=" + email
				+ ", passWord=" + passWord + ", birthday=" + birthday + ", gender=" + gender + "]";
	}
	
	
}
