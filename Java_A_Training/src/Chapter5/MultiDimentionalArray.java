package Chapter5;

import java.math.MathContext;
import java.text.DecimalFormat;
import java.util.Scanner;

public class MultiDimentionalArray {
    public static void main(String[] args) {
        final int ROWS = 2;
        final int COLS = 3;

        int[][] arTestMarks = new int[ROWS][COLS];
        String[] arStNames = new String[ROWS];
        Scanner sc = new Scanner(System.in);
        String stName;
        int testMark;
        //System.out.println(arTestMarks.length); ==> 2

        for(int i = 0; i < ROWS;i++){
            System.out.print("Enter name for student " + (i + 1) + ": ");
            stName = sc.next();
            arStNames[i] = stName;
            for(int j = 0; j < COLS; j++){
                System.out.print("Enter test " + (j + 1) + " for " + stName + ": ");
                testMark = sc.nextInt();
                arTestMarks[i][j] = testMark;
            }
        }

        System.out.println("\n========Details========\n");
        System.out.println("Name\tTest 1\tTest 2\tTest 3\tAverage\tRemarks");
        for(int i = 0; i < arTestMarks.length; i++){
            double sum = 0;
            int cols = 0;
            System.out.print(arStNames[i] + "\t");
            for(int j = 0; j < arTestMarks[i].length;j++){
                sum += arTestMarks[i][j];
                System.out.print(arTestMarks[i][j] + "\t\t");
                cols = arTestMarks[i].length;
            }
            double average = sum /cols;
            System.out.print(Math.round(average) +  "\t\t" + (average >= 60 ? "Pass" : "Fail"));

            System.out.println();
        }
    }
}
