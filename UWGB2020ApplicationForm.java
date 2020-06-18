// Project 1
// KYU SEUNG SIM
// Dr. Elliot
// COMP SCI 256-0800
// JUN 19, 2020

import java.util.*; 

public class UWGB2020ApplicationForm {

  public static void main(String[] args) {

    Scanner user_input = new Scanner(System.in);

    System.out.println("This is UW-Green Bay 2020 Fall Semester Application ");
    System.out.println("Please Eneter Your information");
    System.out.println();    

    System.out.println("EX) Sim");
    System.out.print("Enter Your Last Name: ");
    String user_last_name = user_input.nextLine();
    System.out.println();  

    System.out.println("EX) Sammy");
    System.out.print("Enter Your First Name: ");    
    String user_first_name = user_input.nextLine();
    System.out.println();  

    System.out.println("EX) Computer Science");
    System.out.print("Enter Your Major: ");
    String user_major = user_input.nextLine();
    System.out.println();  

    System.out.println("EX) 000-000-0000");
    System.out.print("Enter Your Phone Number: ");    
    String user_phone_number = user_input.nextLine();
    System.out.println();  

    System.out.println("EX) sammy1234@gmail.com");
    System.out.print("Enter Your Email: ");
    String user_email = user_input.nextLine();
    System.out.println();          


    System.out.println("\n\n\n\n");


    System.out.println("Please Double Check Before Submit");
    System.out.println("");
    System.out.println("UW-Green Bay 2020 Fall Semester Application");
    System.out.println("Last Name: " + user_last_name);
    System.out.println("First Name: " + user_first_name);
    System.out.println("Major: " + user_major);
    System.out.println("Phone Number: " + user_phone_number);
    System.out.println("Email: " + user_email);            

  }
}
