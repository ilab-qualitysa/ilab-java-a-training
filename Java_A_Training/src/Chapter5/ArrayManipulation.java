package Chapter5;

import java.util.Random;

public class ArrayManipulation {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] random20 = new int[20];
        int[] odd,even;

        int number, evenSize = 0, oddSize = 0, countEven = 0, countOdd = 0;
        //Generate
        for (int i = 0; i < random20.length; i++) {
            number = rnd.nextInt(10, 75);
            random20[i] = number;
            if(number % 2 == 0)
                evenSize++;
            else
                oddSize++;
        }
        //Placing
        even = new int[evenSize];
        odd = new int[oddSize];

        for(int i = 0; i < random20.length; i++) {
            if(random20[i] % 2 == 0) {
                even[countEven] = random20[i];
                countEven++;
            }
            else {
                odd[countOdd] = random20[i];
                countOdd++;
            }
        }

        printArray("Random", random20);
        printArray("Even", even);
        printArray("Odd", odd);

    }
    static void printArray(String title, int[] arr){
        System.out.print(title + ": \t");
        for(int num : arr){
            System.out.print(num + "\t");
        }
        System.out.println();
    }

}
