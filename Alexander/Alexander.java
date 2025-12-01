
import java.util.Scanner;

public class Alexander {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        // Keep asking until a valid number between 1 and 100 is entered
        while (number < 1 || number > 100) {
            System.out.print("Enter a number between 1 and 100: ");
            if (scanner.hasNextInt()) { // Check if the input is an integer
                number = scanner.nextInt();
                if (number < 1 || number > 100) {
                    System.out.println("Number out of range. Try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // Clear the invalid input
            }
        }

        System.out.println("You entered a valid number: " + number);
        
    }
}


























