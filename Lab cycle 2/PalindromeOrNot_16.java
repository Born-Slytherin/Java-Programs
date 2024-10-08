import java.util.Scanner;

public class PalindromeOrNot_16 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number = scanner.nextInt();

        int og = number;
        int digit = 0;
        int reverse = 0;

        while ( number != 0 ){

            digit = number % 10;
            reverse = (reverse *10) + digit;
            number = number / 10;

        }

        if( og == reverse ){
            System.out.println(og + " is a palindrome number.");
        }else{
            System.out.println(og + " is not a palindrome number.");
        }

        scanner.close();
    }
}