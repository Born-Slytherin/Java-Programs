import java.util.Scanner;

class SumAvg_02 {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the limit : ");
        int limit = scanner.nextInt();

        double sum = 0;
        double avg = 1;

        for(int i=0 ; i<limit ; i++){

            System.out.print("Enter number "+(i+1)+" : ");
            double number = scanner.nextDouble();
            
            sum += number;

        }

        avg = sum / limit;

        System.out.println("Sum : " + sum);
        System.out.println("Average : " + avg);

        scanner.close();

    }

}