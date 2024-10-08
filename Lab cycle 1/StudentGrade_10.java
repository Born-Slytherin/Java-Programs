import java.util.Scanner;

class StudentGrade_10 {
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Marks <= 100 :");
        double marks = sc.nextDouble();

        if ( marks >= 90 ){
            System.out.println("Outstanding");
        }else if ( marks >= 80 ){
            System.out.println("Excellent");
        }else if ( marks >= 70 ){
            System.out.println("Very Good");
        }else if ( marks >= 60 ){
            System.out.println("Good");
        }else if ( marks >= 50 ){
            System.out.println("Average");
        }else {
            System.out.println("Fail");
        }

        sc.close();
    }
}