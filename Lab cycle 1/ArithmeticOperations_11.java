import java.util.Scanner;

class ArithmeticOperations_11 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number 1 : ");
        double num1 = scanner.nextInt();

        System.out.print("Enter number 2 : ");
        double num2 = scanner.nextInt();

        System.out.print("Enter the operation to be performed : ");
        char operation = scanner.next().charAt(0);

        double result = 0;
        boolean isValid = true;

        switch(operation){

            case '+' : result = num1 + num2;
                        break;
            case '-' : result = num1 - num2;
                        break;
            case '*' : result = num1 * num2;
                        break;
            case '/' : if(num2 == 0){
                            System.out.println("Error: Division by 0 not allowed");
                        }
                        isValid = false;
                        break;
            case '%' : result = num1 % num2;
                        break;
            default : System.err.println("Error: Invalid Operation");
                        isValid = false;
        }

        if(isValid){
            System.out.println( num1 + " " + operation + " " + num2 + " = " + result);
        }

        scanner.close();

    }
    
}