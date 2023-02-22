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

        switch (choice) {
            case 1 -> {
                System.out.print("Enter a message to encode: ");
                String message = getText();

                System.out.println("Morse code: " + morseReader.englishToMorse(message));
            }
            case 2 -> {
                System.out.print("Enter a message to decode: ");

                String message = getText();
                    System.out.println("English: " + morseReader.morseToEnglish(message));
            }
            case 3 -> {
                System.out.println("Good bye");
                System.exit(0);
            }
            default -> System.out.println("Invalid choice");
        }
        System.exit(0);
    }

    public static void printMenu() {
        System.out.println("Menu");
        System.out.println("1. Encode");
        System.out.println("2. Decode");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
    }

    public static String getText() {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNext()) {
            scanner.next();
        }
        String text = scanner.nextLine();
        scanner.close();
        return text;
    }
}