/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diu_student_login_and_registration_system;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Hossain_T.I.R
 */
public class LoginDetails {
	
	private String loginid;
	private String password;
	
	public void logingetter() throws IOException {
		
		BufferedReader inputstring = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("\t\t\t\t\t**********************");
		System.out.println("\t\t\t\t\tEnter a New Login ID: ");
		System.out.println("\t\t\t\t\t**********************");
		
		String userid = inputstring.readLine();

		System.out.println("\t\t\t\t\t***********************");
		System.out.println("\t\t\t\t\tEnter a New Password: ");
		System.out.println("\t\t\t\t\t***********************");
		String userpass = inputstring.readLine();
		
		setLoginid(userid);
		setPassword(userpass);

	}
	
	/**
	 * @return the loginid
	 */
	public String getLoginid() {
		return loginid;
	}
	/**
	 * @param loginid the loginid to set
	 */
	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
