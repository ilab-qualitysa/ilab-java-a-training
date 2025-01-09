package Chapter4;

public class GenericMethods {
    public static void main(String[] args) {

        System.out.println(calcSum(2, 2));

    }
    static <T extends Number> double calcSum(T num1, T num2){
        return num1.doubleValue() + num2.doubleValue();
    }


}
