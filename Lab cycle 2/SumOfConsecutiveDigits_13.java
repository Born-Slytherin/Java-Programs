import java.util.Scanner;

public class SumOfConsecutiveDigits_13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number = scanner.nextInt();

        int previous = -1;
        int current = number % 10;

        int sum = 0;

        while (number > 0) {
            
            if( previous != -1){

                sum = sum + ((current * 10) + previous);

            }
            previous = current;
            number /= 10;
            current = number % 10;

        }

        System.out.println("Sum of numbers formed by consecutive numbers : " + sum);
        scanner.close();
    }

}