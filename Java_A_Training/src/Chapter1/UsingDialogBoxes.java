package Chapter1;

import javax.swing.*;
import java.util.Scanner;

public class UsingDialogBoxes {
    public static void main(String[] args) {
        int age, birthYear, hoursWorked;
        double salary;
        String name;
        char positionCode;
        final int CURRENT_YEAR = 2025;
        final String COMPANY = "ILAB Quality";
        final double HOURLY_RATE = 350;
        final double TAX = 0.25;

        name = JOptionPane.showInputDialog("Enter your name");

        birthYear = Integer.parseInt(JOptionPane.showInputDialog("Enter birth year"));

        hoursWorked = Integer.parseInt(JOptionPane.showInputDialog("Enter hours worked"));

        positionCode = JOptionPane.showInputDialog("Specify position code(S-Senior, J-Junior, I-Intern)").charAt(0);


        age = CURRENT_YEAR - birthYear;
        salary = (hoursWorked * HOURLY_RATE) - ((hoursWorked * HOURLY_RATE) * TAX);

        JOptionPane.showMessageDialog(null,
        "==================="+ COMPANY +"=====================" +
                "\nName: " + name +
                "\nAge: " + age +
                "\nHours worked: " + hoursWorked +
                "\nSalary: " + salary +
                "\nPosition code: " + positionCode);

    }
}
