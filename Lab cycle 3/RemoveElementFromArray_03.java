import java.util.Scanner;

public class RemoveElementFromArray_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the element to remove: ");
        int elementToRemove = scanner.nextInt();
        int newSize = 0;

        for (int i = 0; i < size; i++) {
            if (array[i] != elementToRemove) {
                array[newSize++] = array[i];
            }
        }

        int[] newArray = new int[newSize];
        for (int i = 0; i < newSize; i++) {
            newArray[i] = array[i];
        }

        System.out.print("Array after removal: ");
        for (int i = 0; i < newSize; i++) {
            System.out.print(newArray[i] + " ");
        }
        System.out.println();
        scanner.close();
    }
}
