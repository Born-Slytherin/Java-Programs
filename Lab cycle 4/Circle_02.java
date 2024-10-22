import java.util.Scanner;;

public class Circle_02 {

    float radius;
    double circumference;

    public void setRadius(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius :");
        int radius = scanner.nextInt();
        this.radius = radius;
        scanner.close();
    }

    public void calculateCircumference(){
        circumference = 2 * 3.14 * radius;
    }

    public void displayCircumference(){
        System.out.println("Circumference of a circle with radius "+ radius +" is :"+ circumference);
    }
    
    public static void main(String args[]){

        Circle_02 circle = new Circle_02();

        circle.setRadius();
        circle.calculateCircumference();
        circle.displayCircumference();

    }
}