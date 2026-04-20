public class UC5 {

    public static boolean validateMove(char[][] board, int row, int col) {
        // Boundary Checking
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            System.out.println("Result: Out of Bounds");
            return false;
        }
        
        // Empty Cell Check (Defensive Programming)
        if (board[row][col] != ' ') {
            System.out.println("Result: Cell Occupied");
            return false;
        }
        
        System.out.println("Result: Move Valid");
        return true;
    }

    public static void main(String[] args) {
        // This board matches the logic in your Step Class assignment
        char[][] board = {
            {' ', 'X', ' '},
            {' ', ' ', ' '},
            {'O', ' ', ' '}
        };

        System.out.print("Testing (0, 1): ");
        validateMove(board, 0, 1); 

        System.out.print("Testing (1, 1): ");
        validateMove(board, 1, 1); 

        System.out.print("Testing (3, 0): ");
        validateMove(board, 3, 0); 
    }
}
