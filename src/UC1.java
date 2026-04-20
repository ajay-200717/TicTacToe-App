public class UC1 {
    public static void main(String[] args) {
        // Create a 3x3 character array
        char[][] board = new char[3][3];

        // UC1: Initialize the board with '-'
        initializeBoard(board);

        // UC1: Display the empty board
        displayBoard(board);
    }

    public static void initializeBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    public static void displayBoard(char[][] board) {
        System.out.println("Current Board:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            // New line after each row
            System.out.println();
        }
    }
}
