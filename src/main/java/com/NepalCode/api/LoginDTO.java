package com.NepalCode.api;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class LoginDTO {

	@NotBlank(message = "* User name cannot be blank")
	@Size(min=3, max= 20, message="User name cannot be less than 2")
	private String userName;
	
	@NotBlank(message = "* Password cannot be blank")
	@Size(min=10, max= 20, message="Password cannot be less than 10")
	private String passWord;
	
	@AssertTrue(message="Agree with our app")
	private String termAndCondition;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getTermAndCondition() {
		return termAndCondition;
	}

	public void setTermAndCondition(String termAndCondition) {
		this.termAndCondition = termAndCondition;
	}

	@Override
	public String toString() {
		return "LoginDTO [userName=" + userName + ", passWord=" + passWord + ", termAndCondition=" + termAndCondition
				+ "]";
	}
	
	

}
