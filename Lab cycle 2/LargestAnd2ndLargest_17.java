import java.util.Scanner;

public class LargestAnd2ndLargest_17 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the array limit : ");
        int limit = scanner.nextInt();

        System.out.println();

        int numbers[] = new int[limit];

        for(int i = 0 ; i < limit ; i++ ){
            System.out.print("Enter array element " + (i+1) + " : ");
            numbers[i] = scanner.nextInt();
        }

        int largest = numbers[0];
        int largest2nd = 0;

        for(int i = 1 ; i < limit ; i++ ){
            
            if(numbers[i] > largest){
                largest = numbers[i]; 
            }
            if(( numbers[i] < largest) && ( numbers[i] > largest2nd)){
                largest2nd = numbers[i];
            }

        }

        System.out.println("Largest : " + largest);
        System.out.println("2nd Largest : " + largest2nd);

        scanner.close();
    }
}