package Chapter4;

public class GenericMethods {
    public static void main(String[] args) {
        int l = 0;

        System.out.println(calcSum(2, 2));
        GenericMethods.<Integer>displayNumber(4,3);
        GenericMethods.<Long>displayNumber(4L,2L);
        checkNameLength("uvuvuy", 8);
    }
    static <T> void displayNumber(T x, T y){
        System.out.println("x = " + x + ", y = " + y);
    }
    static <T extends Number> double calcSum(T num1, T num2){
        return num1.doubleValue() + num2.doubleValue();
    }
    static <T1, T2> void checkNameLength(T1 strName, T2 intLen){
        System.out.println(strName + " has " + intLen + " characters. " +
                "(" + (intLen.equals(strName.toString().length())) + ")");
    }

}
