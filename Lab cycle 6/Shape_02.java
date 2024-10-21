import java.util.Scanner;

class Shape {
    String color;

    void setColor(String color) {
        this.color = color;
    }

    String getColor() {
        return color;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }
}

public class Shape_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        double radius = scanner.nextDouble();

        Circle circle = new Circle(radius);

        System.out.print("Enter color of circle: ");
        circle.setColor(scanner.next());

        System.out.println("\nCircle area: " + circle.calculateArea());
        System.out.println("Circle color: " + circle.getColor() + "\n");

        System.out.print("Enter length of rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter width of rectangle: ");
        double width = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(length, width);

        System.out.print("Enter color of rectangle: ");
        rectangle.setColor(scanner.next());

        System.out.println("\nRectangle area: " + rectangle.calculateArea());
        System.out.println("Rectangle color: " + rectangle.getColor() + "\n");

        scanner.close();
    }
}
