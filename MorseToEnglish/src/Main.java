import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MorseReader morseReader = new MorseReader();

        printMenu();

        // Check that the next input is an integer
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter a number");
            printMenu();
            scanner.next();
        }

        int choice = scanner.nextInt();

        //infinte loop
        while (true) {
            switch (choice) {
                case 1 -> {
                    System.out.println("Encode");
                    System.out.print("Enter a message to encode: ");
                    // Check that the next input is a string
                    while (!scanner.hasNext()) {
                        System.out.println("Please enter a message");
                        System.out.print("Enter a message to encode: ");
                        scanner.next();
                    }
                    String message = scanner.next();
                    // Encode the message
                    System.out.println("Morse code: " + morseReader.englishToMorse(message));
                }
                case 2 -> System.out.println("Decode");
                case 3 -> {
                    System.out.println("Exit");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice");
            }
            printMenu();
            choice = scanner.nextInt();
        }
    }

    public static void printMenu() {
        System.out.println("Menu");
        System.out.println("1. Encode");
        System.out.println("2. Decode");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
    }
}