import java.util.Scanner;

 class NaturalNumbers_01 {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the limit: ");
        int limit = scanner.nextInt();

        for(int i=1 ; i<=limit ; i++){
            System.out.println(i);
        }

        scanner.close();

    }

 }