import java.util.Scanner;

class Rectangle_01 {

    double length;
    double width;
    double area;

    void setDimensions(double length, double width) {
        this.length = length;
        this.width = width;
    }

    void calculateArea() {
        area = length * width;
    }

    void displayArea() {
        System.out.println("The area of the rectangle is: " + area);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        Rectangle_01 rectangle = new Rectangle_01(); 

        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        
        rectangle.setDimensions(length, width);
        rectangle.calculateArea();  
        rectangle.displayArea();    
        
        scanner.close(); 
    }
}
