import java.util.Scanner;

abstract class Figure {
    double length;
    double breadth;
    double height;

    void readDimensions() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = scanner.nextDouble();
        System.out.print("Enter breadth (base for triangle): ");
        breadth = scanner.nextDouble();
        System.out.print("Enter height: ");
        height = scanner.nextDouble();
    }

    void displayDimensions() {
        System.out.println("Length: " + length);
        System.out.println("Breadth (Base for Triangle): " + breadth);
        System.out.println("Height: " + height);
    }

    abstract double area();
}

class Rectangle extends Figure {
    @Override
    double area() {
        return length * breadth;
    }
}

class Triangle extends Figure {
    @Override
    double area() {
        return 0.5 * breadth * height;
    }
}

public class Figure_05 {
    public static void main(String[] args) {
        Figure rectangle = new Rectangle();
        rectangle.readDimensions();
        rectangle.displayDimensions();
        System.out.println("Area of Rectangle: " + rectangle.area());

        Figure triangle = new Triangle();
        triangle.readDimensions();
        triangle.displayDimensions();
        System.out.println("Area of Triangle: " + triangle.area());
    }
}
