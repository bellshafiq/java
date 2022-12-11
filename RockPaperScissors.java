package orange;

import java.util.Scanner;

public class RockPaperScissors {
  public static void main(String[] args) {
    // Create a scanner object to read input from the user
    Scanner scanner = new Scanner(System.in);

    // Create an array of possible moves
    String[] moves = {"rock", "paper", "scissors"};

    // Prompt the user to enter their move
    System.out.println("Enter your move (rock, paper, or scissors):");
    String playerMove = scanner.nextLine();

    // Generate a random move for the computer
    int randomIndex = (int) (Math.random() * moves.length);
    String computerMove = moves[randomIndex];

    // Determine the winner of the game
    if (playerMove.equals(computerMove)) {
      System.out.println("It's a tie!");
    } else if (playerMove.equals("rock") && computerMove.equals("scissors") ||
               playerMove.equals("paper") && computerMove.equals("rock") ||
               playerMove.equals("scissors") && computerMove.equals("paper")) {
      System.out.println("You win!");
    } else {
      System.out.println("The computer wins.");
    }
  }
}
