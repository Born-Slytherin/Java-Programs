import java.util.Scanner;

public class Circle_04 {

    void calculateArea(int radius) {
        double area = Math.PI * Math.pow(radius, 2);
        System.out.printf("%nArea of circle with radius %d is %.2f%n%n", radius, area);
    }
    void calculateArea(double radius) {
        double area = Math.PI * Math.pow(radius, 2);
        System.out.printf("%nArea of circle with radius %.2f is %.2f%n%n", radius, area);
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        Circle_04 circle = new Circle_04();

        System.out.print("Enter the radius of the circle in integer : ");
        int radiusInt = scanner.nextInt();

        circle.calculateArea(radiusInt);

        System.out.print("Enter the radius of the circle in double : ");
        double radiusDouble = scanner.nextDouble();

        circle.calculateArea(radiusDouble);

        scanner.close();
    }
}
