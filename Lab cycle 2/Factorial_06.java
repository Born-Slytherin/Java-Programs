import java.util.Scanner;

class Factorial_06 {

    public static void main( String args[] ){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number = scanner.nextInt();

        int product = 1;

        for ( int i = 1 ; i <= number ; i++ ){

            product *= i;

        }

        System.out.println( number + "! = " + product );

        scanner.close();

    }

}