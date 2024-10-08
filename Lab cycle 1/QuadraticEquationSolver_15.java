import java.util.Scanner;

public class QuadraticEquationSolver_15 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner( System.in );

        System.out.print("Enter value of a : ");
        double a = scanner.nextInt();

        System.out.print("Enter value of b : ");
        double b = scanner.nextInt();

        System.out.print("Enter value of c : ");
        double c = scanner.nextInt();

        double discriminant = (b * b) - (4 * a * c);

        // Checking the discriminant
        if ( discriminant > 0 ) {

            double root1 = 0;
            double root2 = 0;
            
            System.out.println("The equation has 2 real and distinct solutions.");

            root1 = ( -b + Math.sqrt(discriminant)) / ( 2 * a );
            root2 = ( -b - Math.sqrt(discriminant)) / ( 2 * a );

            System.out.println( "Root 1 : " + root1 );
            System.out.println( "Root 2 : " + root2 );

        }else if( discriminant == 0 ){

            double root = 0;

            System.out.println("The equation has one real solution.");

            root = -b / ( 2 * a );

            System.out.println( "Root : " + root );

        }else{

            System.out.println("The equation has no real solution.");

        }

        scanner.close();

    }
    
}