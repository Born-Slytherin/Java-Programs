import java.util.Scanner;


public class WeekdayGenerator_12 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number from 1 to 7 : ");
        int dayNum = scanner.nextInt();

        String day;

        switch (dayNum) {

            case 1 : day = "Monday";
                     break;
            case 2 : day = "Tuesday";
                     break;
            case 3 : day = "Wednesday";
                     break;
            case 4 : day = "Thursday";
                     break;
            case 5 : day = "Friday";
                     break;
            case 6 : day = "Saturday";
                     break;
            case 7 : day = "Sunday";
                     break;  
            default: day = "Invalid Day";
                     break;
        }

        System.out.println("\n" + day);
        scanner.close();
    }

}