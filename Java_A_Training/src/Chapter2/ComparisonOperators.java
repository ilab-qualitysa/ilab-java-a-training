package Chapter2;

public class ComparisonOperators {
    public static void main(String[] args) {
        boolean results;

        results = (2 == 2.0);
        System.out.println(results); //T
        results = (3 > 7);
        System.out.println(results); //F
        results = (8.0 >= 8);
        System.out.println(results); //T
        results = (24 < 24);
        System.out.println(results); //F
        results = (13 <= 23);
        System.out.println(results); //T
        results = (15 != 15);
        System.out.println(results); //F
        results = (15 % 3 == 0);
        System.out.println(results); //T


    }
}
