import java.util.Scanner;

class AcceptNumbers_09 {
    public static void main(String args[]) {
        // Read numbers from user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number 1 : ");
        int num1 = scanner.nextInt();

        System.out.print("Enter number 2 : ");
        int num2 = scanner.nextInt();

        System.out.print("Enter number 3 : ");
        int num3 = scanner.nextInt();

        if ( (num1 == num2) && (num2 == num3) && (num1 == num3) ){
            System.out.println("The numbers are the same.");
        }else if ( (num1 != num2) && (num2 != num3) && (num1 != num3)  ){
            System.out.println("The numbers are not the same.");
        }else {
            System.out.println("The numbers are neither same nor different.");
        }

        scanner.close();

    }
}