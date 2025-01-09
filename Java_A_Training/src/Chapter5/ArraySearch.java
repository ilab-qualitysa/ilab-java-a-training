package Chapter5;

public class ArraySearch {
    public static void main(String[] args) {
        int[] arNumbers = {6,4,12,63,81,97,34,74,63,33};
        String[] arNames = {"Alice", "Bob", "Charlie", "Diana", "Ethan", "Fiona"};

        //searchForNumber(63,arNumbers);
        //System.out.println("Highest: " + getHighest(arNumbers));
        //System.out.println("Lowest: " + getLowest(arNumbers));
        System.out.println("Most number of characters: " + mostNumberOfCharacters(arNames));
    }
    static  void searchForNumber(int num, int[] ar){

        for (int i = 0; i < ar.length; i++) {
            if(num ==ar[i]){
                System.out.println("Number: " + num + " found at position " + i);
                break;
            }

        }
    }
    static  int getHighest(int[] ar){
        int max = ar[0];
        for (int i = 1; i < ar.length; i++) {
            if(ar[i] > max){
                max = ar[i];
            }
        }
        return max;
    }
    static  int getLowest(int[] ar){
        int min = ar[0];
        for (int i = 1; i < ar.length; i++) {
            if(ar[i] < min){
                min = ar[i];
            }
        }
        return min;
    }
    static String mostNumberOfCharacters(String[] arNames){
        String most = arNames[0];
        for (int i = 1; i < arNames.length; i++) {
            if(arNames[i].length() > most.length())
            {
                most = arNames[i];
            }
        }
        return most;
    }
}
