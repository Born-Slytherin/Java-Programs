import java.util.Scanner;

public class NoOfDigits_12 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number = scanner.nextInt();
        int og = number;

        int count = 0;

        while ( number != 0 ){

            count ++;
            number /= 10;

        }

        System.out.println("Number of digits in " + og + " = " + count);
        scanner.close();
    }
}