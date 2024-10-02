package se.yogesh.project.fina;
import java.util.Scanner;

public class Game {

        private Player player1;  //its a player attribute of Player class
        private Player player2;
        private Dice dice;

        public Game() {   // its a constructor

            dice = new Dice();  // Initialize dice or creates a dice object that will generate random number
        }

        public void start() {
            Scanner scanner = new Scanner(System.in);

            // Get player names
            System.out.print("Enter name of Player 1: ");

            player1 = new Player(scanner.nextLine());

            System.out.print("Enter name of Player 2: ");
            player2 = new Player(scanner.nextLine());

            // Both players roll the dice twice
            rollForPlayer(player1);
            rollForPlayer(player2);

            // Determine the winner
            determineWinner();

            scanner.close();
        }

        // Simulates two dice rolls for a player
        private void rollForPlayer(Player player) {
            System.out.println(player.getName() + "'s turn:");
            for (int i = 1; i <= 2; i++) {
                int roll = dice.roll();
                System.out.println("Roll " + i + ": " + roll);
                player.addToScore(roll);  // Add roll result to the player's total score
            }
            System.out.println(player.getName() + "'s total score: " + player.getScore() + "\n");
        }

        // Determines and announces the winner
        private void determineWinner() {
            System.out.println("Final Scores:");
            System.out.println(player1.getName() + ": " + player1.getScore());
            System.out.println(player2.getName() + ": " + player2.getScore());

            if (player1.getScore() > player2.getScore()) {
                System.out.println(player1.getName() + " wins!");
            } else if (player2.getScore() > player1.getScore()) {
                System.out.println(player2.getName() + " wins!");
            } else {
                System.out.println("It's a tie!");
            }
        }        // Main method to run the game

    }


