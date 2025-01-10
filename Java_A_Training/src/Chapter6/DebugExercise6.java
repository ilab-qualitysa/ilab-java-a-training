//Setup package name
package Chapter6;
//import library
import java.util.Arrays;

public class DebugExercise6 {
public static void main(String[] args) {         
   int[] numbers = new int[5];
   //change <= to <
   for (int i = 0; i < numbers.length; i++)
   {             
      numbers[i] = i * 2;        
   }         
    System.out.println(Arrays.toString(numbers));
 } 
}