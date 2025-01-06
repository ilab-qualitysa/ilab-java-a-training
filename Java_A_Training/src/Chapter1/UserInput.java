package Chapter1;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        int age, birthYear, hoursWorked;
        double salary;
        String name;
        char positionCode;
        final int CURRENT_YEAR = 2025;
        final String COMPANY = "ILAB Quality";
        final double HOURLY_RATE = 350;
        final double TAX = 0.25;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = input.nextLine();

        System.out.print("Enter birth year: ");
        birthYear = input.nextInt();

        System.out.print("Enter hours worked: ");
        hoursWorked = input.nextInt();

        System.out.print("Specify position code(S-senior, J-Junior, I-Intern): ");
        positionCode = input.next().charAt(0);


        age = CURRENT_YEAR - birthYear;
        salary = (hoursWorked * HOURLY_RATE) - ((hoursWorked * HOURLY_RATE) * TAX);


        System.out.println("==================="+ COMPANY +"=====================");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Position code: " + positionCode);
    }
}
