import java.util.Scanner;

class MultiplicationTable_04 {

    public static void main( String args[] ){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number = scanner.nextInt();

        System.out.println("\nMultiplication Table \n");

        for ( int i = 1 ; i <= 10 ; i++ ){

            System.out.println( number + " * " + i + " = " + ( number * i ) );

        }

        scanner.close();

    }

}