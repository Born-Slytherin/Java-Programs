import java.util.Scanner;

class SumProductsDigits_09 {

    public static void main ( String args[] ){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number = scanner.nextInt();

        int last = number % 10;
        number = number / 10;
        int prev = number % 10;
 
        int product = 1;
        int sum = 0;

        while ( number > 0 ){

            product = last * prev;
            sum = sum + product;

            last = prev;
            number = number / 10;
            prev = number % 10;
        }

        System.out.println("Sum of products of consecutive digits of a number = " + sum );

        scanner.close();

    }

}