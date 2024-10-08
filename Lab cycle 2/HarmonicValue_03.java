import java.util.Scanner;

class HarmonicValue_03 {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the denominator limit : ");
        int limit = scanner.nextInt();

        double sum = 0;

        for ( int i = 1 ; i <= limit ; i++ ){
            sum += (1.0 / i);
        }

        System.out.println("Harmonic value : " + sum);

        scanner.close();

    }

}