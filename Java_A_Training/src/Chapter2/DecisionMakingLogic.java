package Chapter2;

public class DecisionMakingLogic {
    public static void main(String[] args) {
        if(3>2)
            System.out.println("3 is greater than 2");
        System.out.println("Outside...");

        if(5 != 7){
            System.out.println("Yes, 5 is not equal to 7");
            System.out.println("Please enter another condition");
        }

        if(3 == 3){
            System.out.println("Yes, 3 is equal to 3");
        }else{
            System.out.println("No, 3 can only be equal to 3");
        }

        int age = 25;
        if(age >25)
            System.out.println("Old enough");
        else if (age == 21) {
            System.out.println("Almost there...");
        } else if (age == 16) {
            System.out.println("5 more years tp go");
        }
    }
}
