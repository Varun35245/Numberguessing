import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        int attempts = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100:");

        // DEBUG: see the number for testing
        System.out.println("DEBUG: Number to guess is " + numberToGuess);

        while (true) {
            System.out.print("Enter your guess: ");
            String input = scanner.nextLine().trim();
            int guess;

            try {
                guess = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number!");
                continue;
            }

            if (guess < 1 || guess > 100) {
                System.out.println("Number must be between 1 and 100!");
                continue;
            }

            attempts++;

            if (guess == numberToGuess) {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts!");
                break;
            } else if (guess < numberToGuess) {
                System.out.println("Your guess is too low. Try again:");
            } else {
                System.out.println("Your guess is too high. Try again:");
            }
        }

        scanner.close();
    }
}
