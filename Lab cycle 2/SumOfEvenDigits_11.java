import java.util.Scanner;

class SumOfEvenDigits_11 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = scanner.nextInt();

        int digit = 0;
        int sum = 0;

        while( number != 0){

            digit = number % 10;
            if( digit % 2 == 0 ){
                sum += digit;
            }
            number /= 10;

        }
        System.out.println("Sum of even digits : " + sum);
        scanner.close();
    }
    
}