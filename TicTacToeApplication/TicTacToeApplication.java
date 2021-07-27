package TicTacToeApplication;

import java.util.Scanner;

public class TicTacToeApplication {
    
    public static void main(String[] args) {
        // Getting input
        Scanner sc = new Scanner(System.in);

        //Allow for continuous games
        boolean doYouWantToPlay = true;

        // Setting up tokens and Artificial Intelligence (AI)
        while (doYouWantToPlay) {
            System.out.println("Welcome to Tic Tac Toe! You are about to go against the master of Tic Tac Toe. Are you ready? I hope so! \n" +
            "But first you must pick the character you want to be and which character I will be");

            System.out.println();
            System.out.println("Enter a single character that will represent you on the board");
            char playerToken = sc.next().charAt(0);
            System.out.println("Enter a single character that will represent your opponent on the board");
            char opponentToken = sc.next().charAt(0);
            TicTacToe game = new TicTacToe(playerToken, opponentToken);
            AI ai = new AI();
        
            // Setting Up The Game
            System.out.println();
            System.out.println("Now we can start the game. To play, enter a number and your token shall be put in its place.\n"+
            "The numbers go from 1-9, left to right.");
            // TicTacToe.printIndexBoard();
            System.out.println();
            
            // Let's Play
            while (game.gameOver().equals("notOver")) {
                if (game.currentMarker == game.userMarker) {
                    // USER TURN
                    System.out.println("It's your turn. Enter a spot for your token");
                    int spot = sc.nextInt();
                    while(!game.playTurn(spot)) {
                        System.out.println("Try again. " + spot + " is invalid. This spot is already taken or it is out of range");
                        spot = sc.nextInt();
                    }
                    System.out.println("You Picked " + spot);
                } else {
                    // AI TURN
                    System.out.println("It's my turn");
                    // Pick Spot
                    int aiSpot = ai.pickSpot(game);
                    game.playTurn(aiSpot);
                    System.out.println("I picked " + aiSpot + "!");
                }
                // Print a new board
                System.out.println();
                game.printBoard();
            }
            System.out.println(game.gameOver());
            System.out.println();

            // Set up a new game, or not, depending on the response
            System.out.println("do you want to play again? Enter Y if you do. Enter anything else if you do not.");
            char response = sc.next().charAt(0);
            doYouWantToPlay = (response == 'Y');
            System.out.println();
            System.out.println();
        }
    }
}
