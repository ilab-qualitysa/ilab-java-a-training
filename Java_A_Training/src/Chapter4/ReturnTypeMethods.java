package Chapter4;

public class ReturnTypeMethods {
    static  double RATE = 250;
    public static void main(String[] args) {

        String msg = getMessage();
        System.out.println(msg);
    }
    static String getMessage(){
        return "Hi, welcome to Java Fundamentals Course";
    }
    static int getSum(){
        int  num1, num2;
        num1 = 6;
        num2=11;
        return num1 + num2;
    }
    static double calcSalary(){
        int hoursWorked = 50;
        return  hoursWorked * RATE;
    }
    static  boolean isEven(){
        int num = 6;
        return (num % 2 == 0);
    }
}
