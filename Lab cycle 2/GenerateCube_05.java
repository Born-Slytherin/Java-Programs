import java.util.Scanner;

class GenerateCube_05 {

    public static void main ( String args[] ){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the limit : ");
        int limit = scanner.nextInt();

        double power = 0;

        for ( int i = 1 ; i <= limit ; i++ ){

            power = Math.pow(i , 3);
            System.out.println( i + " cube = " + power );

        }

        scanner.close();

    }

}