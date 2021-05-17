package com.example.form;

import javax.validation.constraints.Size;

public class PassForm {
	@Size(min=8, max=20, message="パスワードは8文字以上で記載してください")
	private static String password;
	private static String secondPassword;
	
	@Override
	public String toString() {
		return "PassForm [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	
	public static String getSecondPassword() {
		return secondPassword;
	}

	public static void setSecondPassword(String secondPassword) {
		PassForm.secondPassword = secondPassword;
	}

	public static String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
