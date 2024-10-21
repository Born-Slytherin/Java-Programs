import java.util.Scanner;

interface Sports {
    void getSportsMark();
    double getSportMark();
}

class Student {
    String rollNo;
    String name;

    void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Roll No: ");
        rollNo = scanner.nextLine();
        System.out.print("Enter Name: ");
        name = scanner.nextLine();
    }

    void putData() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
}

class Test extends Student {
    double mark1;
    double mark2;

    void getMarks() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Mark 1: ");
        mark1 = scanner.nextDouble();
        System.out.print("Enter Mark 2: ");
        mark2 = scanner.nextDouble();
    }

    void putMarks() {
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
    }
}

class Result extends Test implements Sports {
    double sportMark;
    double total;

    @Override
    public void getSportsMark() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Sports Mark: ");
        sportMark = scanner.nextDouble();
    }

    @Override
    public double getSportMark() {
        return sportMark;
    }

    void calculateTotal() {
        total = mark1 + mark2 + sportMark;
    }

    void displayResult() {
        System.out.println("\nStudent Details");
        System.out.println("-----------------------");
        putData();
        putMarks();
        System.out.println("Sports Mark: " + getSportMark());
        System.out.println("Total Marks: " + total);
        System.out.println("-----------------------");
    }
}

public class StudentTest_03 {
    public static void main(String[] args) {
        Result result = new Result();
        result.getData();
        result.getMarks();
        result.getSportsMark();
        result.calculateTotal();
        result.displayResult();
    }
}
