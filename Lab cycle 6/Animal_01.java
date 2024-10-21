import java.util.Scanner;

class Animal {
    String name;
    int age;

    String makeSound() {
        return "Animal sound";
    }
}

class Dog extends Animal {
    String breed;

    @Override
    String makeSound() {
        return "Bark";
    }
}

public class Animal_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Dog dog = new Dog();

        System.out.print("Enter dog's name: ");
        dog.name = scanner.nextLine();

        System.out.print("Enter dog's age: ");
        dog.age = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter dog's breed: ");
        dog.breed = scanner.nextLine();

        System.out.printf("Dog Name: %s%nAge: %d%nBreed: %s%nSound: %s%n", 
                          dog.name, dog.age, dog.breed, dog.makeSound());

        scanner.close();
    }
}
