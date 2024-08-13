import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 1 + (int) (100 * Math.random()); // Generate a random number between 1 and 100
        int maxTrials = 5; // Maximum number of trials

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I've chosen a number between 1 and 100.");
        System.out.println("Your task is to guess the number within " + maxTrials + " trials.");

        for (int i = 0; i < maxTrials; i++) {
            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();

            if (guess == number) {
                System.out.println("Congratulations! You guessed the number.");
                break;
            } else if (guess < number) {
                System.out.println("The number is greater than " + guess + ".");
            } else {
                System.out.println("The number is less than " + guess + ".");
            }
        }

        if (number != sc.nextInt()) {
            System.out.println("You have exhausted " + maxTrials + " trials.");
            System.out.println("The correct number was " + number + ".");
        }
    }
}
