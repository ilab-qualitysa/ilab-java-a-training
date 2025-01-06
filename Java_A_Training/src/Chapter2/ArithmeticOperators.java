package Chapter2;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int sum, product,difference;
        double quotient, remainder;

        int num1 = 5; int num2 = 7;
        sum = num1 + num2;
        product = num1 * num2;
        difference = num1 - num2;
        quotient = (double)num1 / num2;
        remainder = num1 % num2;

        System.out.println("Sum: " + sum + "\nProduct: " + product +
                "\nDifference: " + difference + "\nQuotient: " + quotient +
                "\nRemainder: " + remainder);
    }
}
