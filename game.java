import java.util.Scanner;
import java.util.Random;

public class game {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Number Guessing Game!");
        
        System.out.println("Try to guess it!");

        int rand_num = random.nextInt(100) + 1; // Generates random number between 1 and 100
        boolean hasGuessed = false;
        int attempts = 0;

        while (!hasGuessed) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == rand_num) {
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                hasGuessed = true;
            } else if (guess < rand_num) {
                System.out.println("Try a higher number.");
            } else {
                System.out.println("Try a lower number.");
            }
        }

        scanner.close();
    }
}
