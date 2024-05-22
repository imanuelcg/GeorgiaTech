import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Use nextInt() to read an integer
        System.out.println("Enter number of health packs:");
        int healthPacks = scanner.nextInt();
        System.out.println("Health packs: " + healthPacks);

        // Use nextDouble() to read a double
        System.out.println("Enter accuracy percentage:");
        double accuracy = scanner.nextDouble();
        System.out.println("Accuracy: " + accuracy);

        // Consume the remaining newline character
        scanner.nextLine();

        // Use next() to read a single word
        System.out.println("Enter your hero name:");
        String heroName = scanner.next();
        System.out.println("Hero: " + heroName);

        // Consume the remaining newline character
        scanner.nextLine();

        // Use nextLine() to read a full line
        System.out.println("Enter your strategy:");
        String strategy = scanner.nextLine();
        System.out.println("Strategy: " + strategy);

        // Close the scanner
        scanner.close();
    }
}
