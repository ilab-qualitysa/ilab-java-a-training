package Chapter4;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println("Sum: " + calcSum(3,8,11));
        System.out.println(sum(1,2,3,4,5));
    }
    static int calcSum(int num1, int num2){
        return num1 + num2;
    }
    static int calcSum(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
    static double calcSum(double num1, double num2){
        return num1 + num2;
    }
    static float calcSum(float num1, float num2){
        return num1 + num2;
    }
    static  int sum(int... numbers){
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return  total;
    }
    //can still pass in an array...
    static  void formatNames(String... names){
        for(String name : names){
            System.out.println("[" + name + "]");
        }
    }

}
