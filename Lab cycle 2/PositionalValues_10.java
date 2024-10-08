import java.util.Scanner;

class PositionalValues_10 {

    public static void main ( String args[] ){

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number : ");
        int number = scanner.nextInt();

        int position = 1;
        int digit;

        while ( number > 0 ){

            digit = number % 10;

            for(int i = 1 ; i < position ; i++){
                digit = digit * 10;
            }

            System.out.println(digit);

            position++ ;
            number = number / 10;
        }

        scanner.close();
    }

}