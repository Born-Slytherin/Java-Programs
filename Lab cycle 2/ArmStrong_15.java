import java.util.Scanner;

public class ArmStrong_15 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number = scanner.nextInt();

        int og = number;
        int digit = 0;
        int sum = 0;

        while ( number != 0 ){

            digit = number % 10;
            sum += Math.pow(digit , 3);
            number /= 10;

        }
        
        if ( sum == og ){
            System.out.println( og + " is armstrong");
        }else {
            System.out.println( og + " is not armstrong");
        }

        scanner.close();
    }
    
}