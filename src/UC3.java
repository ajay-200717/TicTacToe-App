import java.util.Scanner;

public class UC3 {

    public static void main(String[] args) {
        // Example usage
        int selectedSlot = getPlayerInput();
        System.out.println("Player selected slot: " + selectedSlot);
    }

    /**
     * UC3: Accept User Slot Input (1-9)
     * Reads an integer from the user and returns it.
     */
    public static int getPlayerInput() {
        Scanner sc = new Scanner(System.in);
        int slot;

        while (true) {
            System.out.print("Enter a slot number (1-9): ");
            if (sc.hasNextInt()) {
                slot = sc.nextInt();
                if (slot >= 1 && slot <= 9) {
                    break;
                } else {
                    System.out.println("Invalid range. Please enter a number between 1 and 9.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                sc.next(); // Clear the invalid input
            }
        }
        return slot;
    }
}