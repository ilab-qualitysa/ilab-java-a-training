package Chapter3;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        int count = 1;

        while (count <= 5){
            System.out.println(count + " - Tuesday");
            count++;
        }

        System.out.println("*************************************");
        Scanner sc = new Scanner(System.in);
        int number, sum = 0;

        System.out.print("Enter number: ");
        number = sc.nextInt();

        while(number != 0){
            sum += number;
            System.out.print("Enter number: ");
            number = sc.nextInt();
        }
        System.out.println("Sum: " + sum);

        System.out.println("============================");


        String name;

        System.out.print("Enter name: ");
        name = sc.next();
        while (name.length() < 3){
            System.out.print("Enter name(must have at least 3 letters): ");
            name = sc.next();
        }
        System.out.println("Name is: " + name);


    }
}
