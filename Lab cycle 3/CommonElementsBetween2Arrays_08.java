import java.util.Scanner;

public class CommonElementsBetween2Arrays_08 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the first array: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];

        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }
        System.out.println();

        System.out.print("Enter the size of the second array: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];

        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }
        System.out.println();

        System.out.print("Common elements: ");
        boolean foundCommon = false;

        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                if (array1[i] == array2[j]) {
                    System.out.print(array1[i] + " ");
                    foundCommon = true;
                    break;
                }
            }
        }
        System.out.println();

        if (!foundCommon) {
            System.out.println("No common elements found.");
        }

        scanner.close();
    }
}