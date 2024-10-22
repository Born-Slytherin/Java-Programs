import java.util.Scanner;

public class Car_03 {

    String make;
    String model;
    int year;

    public void setCarInfo(String make , String model , int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayCarInfo(){
        System.out.println("-------------------------");
        System.out.println("Car manufacturer : "+ make);
        System.out.println("Car model : "+ model);
        System.out.println("Built In : "+ year);
        System.out.println("-------------------------");
    }
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        Car_03 car = new Car_03();

        System.out.print("Enter car manufacturer : ");
        String make = scanner.nextLine();
        System.out.print("Enter car model : ");
        String model = scanner.nextLine();
        System.out.print("Enter built year : ");
        int year = scanner.nextInt();

        car.setCarInfo(make , model , year);
        car.displayCarInfo();

        scanner.close();
    }
}