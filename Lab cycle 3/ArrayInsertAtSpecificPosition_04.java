import java.util.Scanner;

public class ArrayInsertAtSpecificPosition_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the element to insert: ");
        int elementToInsert = scanner.nextInt();
        System.out.print("Enter the position (1 to " + (size + 1) + "): ");
        int position = scanner.nextInt();

        if (position < 1 || position > size + 1) {
            System.out.println("Invalid position.");
        } else {
            int[] newArray = new int[size + 1];
            for (int i = 0; i < position - 1; i++) {
                newArray[i] = array[i];
            }
            newArray[position - 1] = elementToInsert;
            for (int i = position - 1; i < size; i++) {
                newArray[i + 1] = array[i];
            }

            System.out.print("Array after insertion: ");
            for (int i = 0; i < newArray.length; i++) {
                System.out.print(newArray[i] + " ");
            }
        }
        scanner.close();
    }
}