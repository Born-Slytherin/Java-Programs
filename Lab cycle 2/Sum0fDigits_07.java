import java.util.Scanner;

class Sum0fDigits_07 {

    public static void main( String args[] ){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number = scanner.nextInt();

        int sum = 0;
        int digit;

        while ( number > 0 ){

            digit = number % 10;
            sum += digit;
            number = number / 10;

        }

        System.out.println("Sum of digits : " + sum);

        scanner.close();

    }

}