/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diu_student_login_and_registration_system;

import java.util.Scanner;

/**
 *
 * @author Hossain_T.I.R
 */
public class RegistrationDetails{
	
	private String semister;
	private int year;
	
	Scanner sc = new Scanner(System.in);
	public void registration_info() {
		System.out.println("\n\n\t\t\t\t\t**************************");
		System.out.println("\t\t\t\t\tChoose Your Trimester");
		System.out.println("\t\t\t\t\t1. Summer\n" + "\t\t\t\t\t2. Spring\n" + "\t\t\t\t\t3. Fall");
		System.out.println("\t\t\t\t\t**************************");
		int trimester_choice = sc.nextInt();
		switch (trimester_choice) {
		case 1:
			semister = "Summer";
			setSemister(semister);
			break;
		case 2:
			semister = "Spring";
			setSemister(semister);
			break;
		case 3:
			semister = "Fall";
			setSemister(semister);
			break;
			
		default:
			break;
		}

		System.out.println("\n\t\t\t\t\t**************************");
		System.out.println("\t\t\t\t\tEnter Your Admission Year");
		System.out.println("\t\t\t\t\t**************************");
		int admission_year = sc.nextInt();
		setYear(admission_year);
	}
	
	
	
	/**
	 * @return the semister
	 */
	public String getSemister() {
		return semister;
	}
	/**
	 * @param semister the semister to set
	 */
	public void setSemister(String semister) {
		this.semister = semister;
	}
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * @param admission_year the year to set
	 */
	public void setYear(int admission_year) {
		this.year = admission_year;
	}
	
}
