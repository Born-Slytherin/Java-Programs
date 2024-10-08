import java.util.Scanner;

class ReverseInteger_08 {

    public static void main( String args[] ){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number = scanner.nextInt();

        int digit = 0 ;
        int reverse = 0;
        int og = number;

        while ( number > 0 ){

            digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;

        } 

        System.out.println("Reverse of " + og + " = " + reverse);
        scanner.close();

    }

}