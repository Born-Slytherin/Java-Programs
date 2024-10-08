import java.util.Scanner;

public class VowelOrConsonant_13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a single character : ");
        String input = scanner.nextLine();

        // Checking if single character
        if (input.length() == 1) {

            char character = input.charAt(0);
            character = Character.toLowerCase(character);

            if (Character.isLetter(character)) {

                // Checking vowel or consonant
                if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {

                    System.out.println("The character is a vowel.");

                } else {

                    System.out.println("The character is a consonant.");

                }

            }else {
                System.out.println("Not a character");
            }

        } else {
            System.err.println("Only single character allowed.");
        }

        scanner.close();
    }

}