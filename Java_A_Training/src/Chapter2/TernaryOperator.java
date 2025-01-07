package Chapter2;

public class TernaryOperator {

    public static void main(String[] args) {
        int age = 25;
//        if(age >= 18){
//            System.out.println("Can vote");
//        }else{
//            System.out.println("Cannot vote");
//        }
        //condition ? trueValue : falseValue;
        System.out.println((age >= 18) ? "Can vote" : "Cannot vote");

        int number = 9;
        String results = "unknown";

//        if(number % 2 == 0){
//            results = "Even";
//        }else{
//            results = "Odd";
//        }

        //condition ? trueValue : falseValue;
        results = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(results);

        int num = 5;

        results = num % 2 == 0 ? "Even" :
                    num % 3 == 0 ? "Multiple of 3" :
                    num % 5 == 0 ? "Multiple of 5" : "Odd";

        System.out.println(num + " is: " +  results);
    }

}
