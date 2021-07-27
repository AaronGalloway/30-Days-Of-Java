import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    int theNUMBER; // the number that the user is guessing
    int max; // the max number the computer could come up with
    Scanner scanner = new Scanner(System.in);

    // Constructor
    public GuessTheNumber() {
        Random rand = new Random();
        max = 100;
        theNUMBER = Math.abs(rand.nextInt()) % (max + 1);
    }

    // Method
    public void play() {
        while (true) {
            int move = scanner.nextInt();
            if (move > theNUMBER) {
                System.out.println("Your number is too big");
            }
            if (move < theNUMBER) {
                System.out.println("Your number is too small");
            } else {
                System.out.println("YOU WON!!!");
            }
        }
    }

    public static void howBigIsMyNumber(int x) {
        if (x >= 0 && x <= 10) {
            System.out.println("Our number is pretty small");
        } else if (x >= 11 && x <= 100) {
            System.out.println("Our number is pretty big");
        } else {
            System.out.println("Our number is out of range");
        }
    }

    // Method
    public static void main(String[] args) {
        GuessTheNumber guessGame = new GuessTheNumber();
        System.out.println(
            "Welcome to my game. Try and guess my impossible number."
            + " It is between 0 and " + guessGame.max + " inclusive."
            + " Just type a number to get started.");
        guessGame.play();
    }
}
