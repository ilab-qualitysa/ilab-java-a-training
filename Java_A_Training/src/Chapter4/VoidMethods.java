package Chapter4;

import java.util.Scanner;

public class VoidMethods {
    static String firstname, lastname, empNumber;
    static int age;
    static double height;

    public static void main(String[] args) {
        displayMessage();
        getUserDetails();
        displayDetails();
    }
    static void displayMessage(){
        System.out.println("Hi, welcome to Java Fundamentals Course");
    }
    static void  getUserDetails(){
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter firstname: ");
        firstname = sc.nextLine();
        System.out.print("Enter lastname: ");
        lastname = sc.nextLine();
        System.out.print("Enter employee no: ");
        empNumber = sc.nextLine();
        System.out.print("Enter age: ");
        age = sc.nextInt();
        System.out.print("Enter height: ");
        height = sc.nextDouble();
    }

    static void displayDetails(){
        System.out.println("=====Details for employee (" + empNumber + ")=====");
        System.out.println("Name:  " + firstname + " " + lastname
                + "\nEmployee number: " + empNumber +
                "\nAge: " + age + "\nHeight "
                + height + "m");
    }
}
