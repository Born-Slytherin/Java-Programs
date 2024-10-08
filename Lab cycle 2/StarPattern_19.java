import java.util.Scanner;

public class StarPattern_19 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number fo rows : ");
        int rows = scanner.nextInt();

        for ( int i = rows ; i > 0 ; i-- ){
            for ( int j = 0 ; j < i ; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}