import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Coin myCoin = new Coin();  // Create a new Coin object
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object to read user input
        int key;  // Variable to hold the key entered by the user
        int choice;  // Variable to hold the user's menu choice

        // Menu-driven loop that runs until the user chooses to exit
        do {
            // Display the menu options
            System.out.println("\n--- Coin Menu ---");
            System.out.println("1. Set Key");
            System.out.println("2. Lock Coin");
            System.out.println("3. Unlock Coin");
            System.out.println("4. Flip Coin");
            System.out.println("5. Check Coin Status (Heads or Tails)");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();  // Get the user's choice

            // Switch statement to handle the user's choice
            switch (choice) {
                case 1:
                    // Set key for the coin
                    System.out.print("Enter a key to set: ");
                    key = scanner.nextInt();  // Get the key from the user
                    myCoin.setKey(key);  // Set the key for the coin
                    System.out.println("Key has been set.");
                    break;

                case 2:
                    // Lock the coin using the provided key
                    System.out.print("Enter the key to lock the coin: ");
                    key = scanner.nextInt();  // Get the key from the user
                    myCoin.lock(key);  // Attempt to lock the coin with the key
                    if (myCoin.locked()) {
                        System.out.println("Coin is now locked.");  // Notify if the coin is locked
                    }
                    break;

                case 3:
                    // Unlock the coin using the provided key
                    System.out.print("Enter the key to unlock the coin: ");
                    key = scanner.nextInt();  // Get the key from the user
                    myCoin.unlock(key);  // Attempt to unlock the coin with the key
                    if (!myCoin.locked()) {
                        System.out.println("Coin is now unlocked.");  // Notify if the coin is unlocked
                    }
                    break;

                case 4:
                    // Flip the coin if it is unlocked
                    System.out.println("Flipping the coin...");
                    myCoin.flip();  // Flip the coin (only works if the coin is unlocked)
                    break;

                case 5:
                    // Display the current face of the coin
                    System.out.println("Coin face: " + myCoin.toString());  // Show the current face of the coin
                    break;

                case 6:
                    // Exit the program
                    System.out.println("Exiting...");
                    break;

                default:
                    // Handle invalid input
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 6);  // Loop continues until the user chooses option 6 (Exit)

        scanner.close();  // Close the scanner to prevent resource leaks
    }
}
