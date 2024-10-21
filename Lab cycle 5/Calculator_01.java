import java.util.Scanner;

public class Calculator_01 {

    void add(int a, int b){
        System.out.println("\nAddition of 2 integers");
        System.err.println("-----------------------");
        System.out.println(a + " + " + b + " = " + (a+b)+ "\n");
    }
    void add(float a,float b){
        System.out.println("\nAddition of 2 floats");
        System.err.println("-----------------------");
        System.out.println(a + " + " + b + " = " + (a+b) + "\n");
    }
    void add(int a, int b, int c){
        System.out.println("\nAddition of 3 integers");
        System.err.println("-----------------------");
        System.out.println(a + " + " + b + " + " + c + " = " + (a+b) + "\n");
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        Calculator_01 calculator = new Calculator_01();

        System.out.print("Enter first integer: ");
        int integer1 = scanner.nextInt();
        
        System.out.print("Enter second integer: ");
        int integer2 = scanner.nextInt();

        calculator.add(integer1, integer2);

        System.out.print("Enter first float: ");
        float float1 = scanner.nextFloat();
        
        System.out.print("Enter second float: ");
        float float2 = scanner.nextFloat();

        calculator.add(float1, float2);

        System.out.print("Enter third integer: ");
        int integer3 = scanner.nextInt();
        
        calculator.add(integer1, integer2, integer3);

        scanner.close();
    }
    
}