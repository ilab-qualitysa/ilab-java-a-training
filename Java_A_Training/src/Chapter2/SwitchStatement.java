package Chapter2;

public class SwitchStatement {
    public static void main(String[] args) {

        int dayNum = 7;
        String dayOfWeek = "None";

        switch (dayNum){
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
        System.out.println(dayOfWeek);

        int departmentId = 1;
        String supervisor = "";

        switch (departmentId){
            case 1, 2, 5:
                supervisor = "Smith";
                break;
            case 3:
                supervisor = "Jones";
                break;
            case 4:
                supervisor = "Mokoena";
                break;
        }
        System.out.println(supervisor);
    }
}
