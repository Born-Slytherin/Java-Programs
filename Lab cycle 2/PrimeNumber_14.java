import java.util.Scanner;

public class PrimeNumber_14 {

    public boolean checkPrime(int number){
        
        if( number < 2 ){
                
            return false;

        }else if ( number == 2 ){

            return true;

        }else {

            for ( int i = 2 ; i <= (number / 2) ; i++ ){

                if ( number % i == 0){
                    return false;
                }

            }
            return true;

        }
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the limit : ");
        int upto = scanner.nextInt();

        if ( upto < 2 ){

            System.err.println("No prime numbers less than 2");

        }else{

            PrimeNumber_14 primeNumber = new PrimeNumber_14();            

            for ( int i = 2 ; i <= upto ; i++ ){
                boolean isPrime = primeNumber.checkPrime(i);

                if (isPrime) {
                    System.out.println(i);
                }
            }
        }

        scanner.close();
    }
}