import java.util.Scanner;

public class MathUtils_02 {

    int factorial(int number){
        if(number == 0){
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }

    long factorial(long number) {
        if (number == 0) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        MathUtils_02 math = new MathUtils_02();

        System.out.print("Enter an integer number : ");
        int integer = scanner.nextInt();

        int intFactorial = math.factorial(integer);

        System.out.println("\nFactorial of " + integer + " : " + intFactorial + "\n");

        System.out.print("Enter a long number : ");
        long longNumber = scanner.nextLong();
        
        long longFactorial = math.factorial(longNumber);

        System.out.println("\nFactorial of " + longNumber + " : " + longFactorial + "\n");

        scanner.close();
    }
}
