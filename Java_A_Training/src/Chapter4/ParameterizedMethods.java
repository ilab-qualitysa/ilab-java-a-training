package Chapter4;

public class ParameterizedMethods {
    public static void main(String[] args) {


    }
    static void displayMessage(String msg){
        System.out.println(msg);
    }
    static int calcSum(int num1, int num2){
        return num1 + num2;
    }


    static  String getDay(int dayNumber){
        String dayOfWeek;
        switch (dayNumber){
            case 1:
                dayOfWeek = "Monday";
                break;
            case 2:
                dayOfWeek = "Tuesday";
                break;
            case 3:
                dayOfWeek = "Wednesday";
                break;
            case 4:
                dayOfWeek = "Thursday";
                break;
            case 5:
                dayOfWeek = "Friday";
                break;
            case 6:
                dayOfWeek = "Saturday";
                break;
            case 7:
                dayOfWeek = "Sunday";
                break;
            default: dayOfWeek = "Invalid";
        }
        return dayOfWeek;
    }
}
