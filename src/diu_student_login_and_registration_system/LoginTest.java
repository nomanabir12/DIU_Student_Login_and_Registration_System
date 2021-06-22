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
public class LoginTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        LoginDetails loginDetails = new LoginDetails();
        StudentDetails studentDetails = new StudentDetails();
        RegistrationDetails registrationDetails = new RegistrationDetails();
        CourseDetails courseDetails = new CourseDetails();

        boolean startloop = true;



        while(startloop) {

                menu_display();

                Scanner scanner = new Scanner(System.in);
                BufferedReader inputstring = new BufferedReader(new InputStreamReader(System.in));
                int ans  = scanner.nextInt();

                switch (ans) {
                case 1:
                        System.out.println("\t\t\t\t\tEnter Your Login ID:");
                        String loginid = inputstring.readLine();
                        System.out.println("\n\t\t\t\t\tEnter Your Password:");
                        String loginpass = inputstring.readLine();

                        if (loginid.equals(loginDetails.getLoginid()) && loginpass.equals(loginDetails.getPassword())) {

                                System.out.println("\t\t\t\t\t******************");
                                System.out.println("\t\t\t\t\tLogin SuccessFull");
                                System.out.println("\t\t\t\t\t******************");


                                System.out.println("\n\n\t\t\t\t\t*********************************");
                                System.out.println("\t\t\t\t\tLogin Student Name: " + studentDetails.getName() + "\n\t\t\t\t\tStudent ID: " 
                                + studentDetails.getId() + "\n\t\t\t\t\tStudent CGPA: " + studentDetails.getCgpa());
                                System.out.println("\t\t\t\t\t*********************************");


                                System.out.println("\n\n\t\t\t\t\t*****************************");
                                System.out.println("\t\t\t\t\tStudent Registration Info");
                                System.out.println("\t\t\t\t\t*****************************");
                                System.out.println("\t\t\t\t\tRegistration Semister: " + registrationDetails.getSemister() + 
                                                "\n\t\t\t\t\tRegister Year: " + registrationDetails.getYear());


                                System.out.println("\n\n\t\t\t\t\t******************");
                                System.out.println("\t\t\t\t\tStudent Course Info");
                                System.out.println("\t\t\t\t\t******************");
                                System.out.println("\t\t\t\tCourse Code  \t\t Section Name");
                                for (int i = 1; i <= courseDetails.getDigitCourseNumber(); i++) {
                                System.out.println("\t\t\t\t" + courseDetails.getCourse_code()[i].toUpperCase() + 
                                                "\t\t\t\t" + courseDetails.getSection()[i].toUpperCase());
                                }


                        } else {

                                System.out.println("\n\n\t\t\t\t\t***************************");
                                System.out.println("\t\t\t\t\tID & Password Are Incorrect !");
                                System.out.println("\t\t\t\t\tPlease Register First");
                                System.out.println("\t\t\t\t\t***************************");
                        }

                        break;

                case 2:

                        loginDetails.logingetter();
                        studentDetails.student_info();
                        registrationDetails.registration_info();
                        courseDetails.course_info();

                        System.out.println("\n\n\t\t\t\t\t***************************");
                        System.out.println("\t\t\t\t\tRegistration Successfully");
                        System.out.println("\t\t\t\t\t***************************");
                        break;

                case 3:
                        System.out.println("\n\n\t\t\t\t\t***********************************");
                        System.out.println("\t\t\t\t\tThank You For Using Our Porgramme\n\n");
                        System.out.println("\t\t\t\t\t***********************************");
                        startloop = false;
                        break;

                default:
                        System.out.println("\n\n\t\t\t\t\t******************************");
                        System.out.println("\t\t\t\t\tPlease Choose Correct Option\n\n");
                        System.out.println("\t\t\t\t\t******************************");
                        break;
                }
        }
    }
    
    	public static void menu_display() {
		System.out.println("\n\n\t\t\t\t***********************************");
		System.out.println("\t\t\t\tWELCOME TO DIU STUDENT LOGIN SYSTEM");
		System.out.println("\t\t\t\t***********************************");
		System.out.println("\n\t\t\t\t\tChoose Option");
		System.out.println("\t\t\t\t\t1. Student Login (Please Signup First)");
		System.out.println("\t\t\t\t\t2. Student Signup");
		System.out.println("\t\t\t\t\t3. Exit\n\n");
		
	}
    
}
