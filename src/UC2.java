import java.util.Random;

public class UC2 {
    // Game State Variables
    static String player1Symbol;
    static String player2Symbol;
    static String currentPlayer;

    public static void main(String[] args) {
        performToss();
    }

    public static void performToss() {
        Random random = new Random();
        
        // 1. Randomly decide who starts (0 or 1)
        int toss = random.nextInt(2);

        // 2. Conditional Logic to assign symbols
        if (toss == 0) {
            player1Symbol = "X";
            player2Symbol = "O";
            currentPlayer = "Player 1";
        } else {
            player1Symbol = "O";
            player2Symbol = "X";
            currentPlayer = "Player 2";
        }

        // 3. Output results
        System.out.println("Toss Result: " + currentPlayer + " wins the toss and starts with X!");
        System.out.println("Player 1 Symbol: " + player1Symbol);
        System.out.println("Player 2 Symbol: " + player2Symbol);
    }
}