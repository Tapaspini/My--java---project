import java.util.Scanner;

public class AdventureGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Adventure Game!");
        System.out.println("You find yourself at a crossroad.");

        // Game loop
        while (true) {
            System.out.println("\nChoose your path: ");
            System.out.println("1. Go left");
            System.out.println("2. Go right");
            System.out.println("3. Quit");

            int choice = getUserChoice(scanner, 3);

            switch (choice) {
                case 1:
                    System.out.println("You chose to go left.");
                    leftPath();
                    break;
                case 2:
                    System.out.println("You chose to go right.");
                    rightPath();
                    break;
                case 3:
                    System.out.println("Thanks for playing! Goodbye!");
                    System.exit(0);
                    break;
            }
        }
    }

    private static int getUserChoice(Scanner scanner, int maxChoice) {
        int choice = -1;

        while (choice < 1 || choice > maxChoice) {
            System.out.print("Enter your choice: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice < 1 || choice > maxChoice) {
                    System.out.println("Invalid choice. Please enter a number between 1 and " + maxChoice + ".");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }

        return choice;
    }

    private static void leftPath() {
        System.out.println("You encounter a mystical forest.");
        System.out.println("What will you do?");
        System.out.println("1. Explore the forest");
        System.out.println("2. Turn back");

        int choice = getUserChoice(new Scanner(System.in), 2);

        if (choice == 1) {
            System.out.println("You discover a hidden treasure! Congratulations!");
        } else {
            System.out.println("You decide to turn back. The adventure continues...");
        }
    }

    private static void rightPath() {
        System.out.println("You come across a dark cave.");
        System.out.println("Do you dare to enter?");
        System.out.println("1. Enter the cave");
        System.out.println("2. Avoid the cave");

        int choice = getUserChoice(new Scanner(System.in), 2);

        if (choice == 1) {
            System.out.println("As you enter, you find a dragon! It breathes fire, and... GAME OVER!");
            System.exit(0);
        } else {
            System.out.println("You decide to avoid the cave. The adventure continues...");
        }
    }
}