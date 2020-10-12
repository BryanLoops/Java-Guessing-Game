import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        // Receive user input
        Scanner scanner = new Scanner(System.in);
        String playAgain;

        do {
            // Generate a random number
            int newNumber = (int)(Math.random() * 1000 + 1);

            // Stores guessed number
            int guess = 0;

            // Try counter
            int lastGuess = 0;
            int tries = 1;

            while (guess != newNumber) {
                System.out.print("Guess a number between 1 and 1000: ");
                guess = scanner.nextInt();
                System.out.print("Your number is " + guess + ". ");

                // Guessing possibilities
                if (guess > newNumber) {
                    System.out.println("Your number is too high!");
                }
                else if (guess < newNumber) {
                    System.out.println("Your number is too low!");
                }
                else {
                    System.out.println("Congratulations! Your guessing matches!");
                    System.out.println("It took only " + tries + " tries!");
                }

                // Tries counter
                if (lastGuess != guess){
                    tries += 1;
                    lastGuess = guess;
                }
            }
            System.out.println("Would you like to play again? (y/n)");
            playAgain = scanner.next();
        } while (playAgain.equalsIgnoreCase("y"));
        System.out.println("Thanks for playing! See you soon!");
        scanner.close();
    }
}
