import java.util.Scanner;

public class Book_05 {

    String title;
    String author;
    long price;

    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setPrice(long price){
        this.price = price;
    }

    public void displayInfo(){
        System.out.println("-------------------------");
        System.out.println("Book Title : "+ title);
        System.out.println("Book Author : "+ author);
        System.out.println("Price : "+ price +"/-");
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the title : ");
        String title = scanner.nextLine();

        System.out.print("Enter the author : ");
        String author = scanner.nextLine();

        System.out.print("Enter the price : ");
        long price = scanner.nextLong();

        Book_05 book = new Book_05();

        book.setTitle(title);
        book.setAuthor(author);
        book.setPrice(price);

        book.displayInfo();

        scanner.close();
    }
}