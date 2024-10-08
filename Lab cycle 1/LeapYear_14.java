import java.util.Scanner;

public class LeapYear_14 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year : ");
        int year = scanner.nextInt();

        boolean isLeapYear = false;

        // Leap Year Checking
        if(year % 4 == 0){
            
            if (year % 100 == 0) {
                
                if (year % 400 == 0) {
                    isLeapYear = true;
                }else{
                    isLeapYear = false;
                }

            }else{
                isLeapYear = true;
            }

        }else{
            isLeapYear = false;
        }

        if (isLeapYear) {
            System.out.println(year + " is a leap year");
        }else{
            System.out.println(year + " is not a leap year");
        }

        scanner.close();

    }
    
}