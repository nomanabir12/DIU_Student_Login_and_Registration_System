/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diu_student_login_and_registration_system;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Hossain_T.I.R
 */
public class StudentDetails {
	
	private String name;
	private String id;
	private double cgpa;
	
	Scanner sc = new Scanner(System.in);
	BufferedReader inputstring = new BufferedReader(new InputStreamReader(System.in));
	public void student_info() throws IOException {

		System.out.println("\n\n\t\t\t\t\t*******************");
		System.out.println("\t\t\t\t\tEnter Your Name: ");
		System.out.println("\t\t\t\t\t*******************");
		String name = inputstring.readLine();
		setName(name);

		System.out.println("\n\n\t\t\t\t\t*********************");
		System.out.println("\t\t\t\t\tEnter Your Student ID: ");
		System.out.println("\t\t\t\t\t*********************");
		String student_id = inputstring.readLine();
		setId(student_id);

		System.out.println("\n\n\t\t\t\t\t****************");
		System.out.println("\t\t\t\t\tEnter Your CGPA: ");
		System.out.println("\t\t\t\t\t****************");
		double cgpa = sc.nextDouble();
		setCgpa(cgpa);
	}
	
	
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the cgpa
	 */
	public double getCgpa() {
		return cgpa;
	}
	/**
	 * @param cgpa the cgpa to set
	 */
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

}
