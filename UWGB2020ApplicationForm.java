// Project 1
// KYU SEUNG SIM
// Dr. Elliot
// COMP SCI 256-0800
// JUN 19, 2020

// the import keyword is used to load in additional Java PACKAGE code for our programs
// in this case, we are loading in the standard "util" package for the Scanner class
import java.util.*; // anything after the // is a comment


// we use the class keyword to denote an OBJECT
// an object is simply a collection of PROPERTIES (variables)
// and METHODS (functions) that relate to each other
public class UWGB2020ApplicationForm {

  // all of our Java programs will have a "main method"
  // this is the ENTRY POINT of our program
  // the keywords prior to main:
  // - public: denotes the access permissions for other objects
  // - static: denotes procedural style code (i.e., not Object Oriented)
  // - void: the return type of the method (in this case NOTHING)
  public static void main(String[] args) {

    // initialize a variable of type OBJECT Scanner and call its CONSTRUCTOR with the System.in parameter)
    Scanner user_input_last_name = new Scanner(System.in);
    Scanner user_input_first_name = new Scanner(System.in);
    Scanner user_input_major = new Scanner(System.in);   
    Scanner user_input_phone_number = new Scanner(System.in);
    Scanner user_input_email = new Scanner(System.in);   

    // a standard Java method for output of a STRING LITERAL
    // the \n denotes a "carriage return" - or blank line
    System.out.println("This is UW-Green Bay 2020 Fall Semester Application ");
    System.out.println("Please Eneter Your information");
    System.out.println();    

    System.out.println("EX) Sim");
    System.out.print("Enter Your Last Name: ");
    String user_last_name = user_input_last_name.nextLine();
    System.out.println();  

    System.out.println("EX) Sammy");
    System.out.print("Enter Your First Name: ");    
    String user_first_name = user_input_first_name.nextLine();
    System.out.println();  

    System.out.println("EX) Computer Science");
    System.out.print("Enter Your Major: ");
    String user_major = user_input_major.nextLine();
    System.out.println();  

    System.out.println("EX) 000-000-0000");
    System.out.print("Enter Your Phone Number: ");    
    String user_phone_number = user_input_phone_number.nextLine();
    System.out.println();  

    System.out.println("EX) sammy1234@gmail.com");
    System.out.print("Enter Your Email: ");
    String user_email = user_input_email.nextLine();
    System.out.println();          


    // initialize a STRING VARIABLE and call the Scanner.nextLine() of user_input
    System.out.println("\n\n\n\n");



    // perform String concatenation using the + operator and output the result to the console
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
