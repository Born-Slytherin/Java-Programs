import java.util.Scanner;

public class AvgValuesOfArray_02 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the array limit : ");
        int limit = scanner.nextInt();

        int[] numbers = new int[limit];

        for( int i = 0 ; i < limit ; i++ ){
            System.out.print("Enter the " + (i+1) + "th element : ");
            numbers[i] = scanner.nextInt();
        }
        int sum = 0;

        System.out.println("The array : ");
        for( int i = 0 ; i < limit ; i++ ){
            System.out.print(numbers[i] + "\t");
            sum += numbers[i];
        }

        float avg = (float) sum / limit ;
        System.out.println("\nAverage : " + avg);

        scanner.close();
    }
}