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
public class CourseDetails {
	
	private String [] course_code = new String [10];
	private String [] section = new String [10];
	private int digitCourseNumber;
	
	
	public void course_info() throws IOException {

		System.out.println("\t\t\t\t\t***************************************");
		System.out.println("\t\t\t\t\tHow many Course You Taken This Trimester?");
		System.out.println("\t\t\t\t\t***************************************");
		Scanner scanner = new Scanner(System.in);
		BufferedReader inputstring = new BufferedReader(new InputStreamReader(System.in));
		digitCourseNumber = scanner.nextInt();

		System.out.println("\t\t\t\t\t***********************************");
		System.out.println("\t\t\t\t\tYou Have " + digitCourseNumber + " Course in This Trimester");
		System.out.println("\t\t\t\t\t***********************************");
		
		for (int i = 1; i <= digitCourseNumber; i++) {
			System.out.println("\t\t\t\t\tEnter Your  " + i + "th Course Code");
			course_code[i] = inputstring.readLine();
			System.out.println("\t\t\t\t\tEnter Section Name: ");
			section[i] = inputstring.readLine();
		}
		
		setDigitCourseNumber(digitCourseNumber);
		setCourse_code(course_code);
		setSection(section);
	}
	
	/**
	 * @return the digitCourseNumber
	 */
	public int getDigitCourseNumber() {
		return digitCourseNumber;
	}

	/**
	 * @param digitCourseNumber the digitCourseNumber to set
	 */
	public void setDigitCourseNumber(int digitCourseNumber) {
		this.digitCourseNumber = digitCourseNumber;
	}

	/**
	 * @return the course_code
	 */
	public String[] getCourse_code() {
		return course_code;
	}
	/**
	 * @param course_code the course_code to set
	 */
	public void setCourse_code(String[] course_code) {
		this.course_code = course_code;
	}
	/**
	 * @return the section
	 */
	public String[] getSection() {
		return section;
	}
	/**
	 * @param section the section to set
	 */
	public void setSection(String[] section) {
		this.section = section;
	}
}
