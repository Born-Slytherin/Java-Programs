// Employee , name , id , salary .
// setSalaryDetails()
// displayInfo()
import java.util.Scanner;

public class Employee_04 {

    int id;
    String name;
    long salary; 
    
    public void setSalaryDetails(int id , String name , long salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void displayInfo(){
        System.out.println("-------------------------");
        System.out.println("Employee ID : "+ id);
        System.out.println("Employee Name : "+ name);
        System.out.println("Salary : "+ salary);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee id : ");
        int id = scanner.nextInt();
        System.out.print("Enter employee name : ");
        String name = scanner.next();
        System.out.print("Enter employee salary : ");
        long salary = scanner.nextLong();

        Employee_04 employee = new Employee_04();

        employee.setSalaryDetails(id , name , salary);
        employee.displayInfo();

        scanner.close();

    }
}