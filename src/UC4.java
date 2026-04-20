import java.util.Scanner;

public class UC4 {

    // Main method: The entry point for the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter slot number (1-9): ");
        int slot = scanner.nextInt();

        // Validate input
        if (slot < 1 || slot > 9) {
            System.out.println("Invalid input! Please enter a number between 1 and 9.");
        } else {
            // Call the conversion logic
            int[] indices = convertSlotToIndex(slot);
            System.out.println("Board Index -> Row: " + indices[0] + ", Column: " + indices[1]);
        }
        
        scanner.close();
    }

    /**
     * UC4 Logic: Converts slot (1-9) to 0-based indices (row, col)
     */
    public static int[] convertSlotToIndex(int slot) {
        int adjustedSlot = slot - 1; // Zero-based indexing
        int row = adjustedSlot / 3;  // Mathematical mapping (Division)
        int col = adjustedSlot % 3;  // Mathematical mapping (Modulo)
        
        return new int[] { row, col };
    }
}
