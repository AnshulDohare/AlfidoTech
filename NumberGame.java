import java.util.Scanner;

class NumberGame {
    public static void main(String args[]) {
        NumberGuessingGame();
    }

    public static void NumberGuessingGame() {
        int randomNumber = (int) (Math.random() * 20) + 1;
        int k = 5;
        int guess;
        try (Scanner sc = new Scanner(System.in)) {
            boolean guessed = false;
            System.out.println("---------->\nGuess a Number between 1 to 20 which is in my mind.\nYou have 5 tries to guess it.");
            while (k > 0) {
                System.out.print("Enter Your Guess -> ");
                guess = sc.nextInt();

                if (guess == randomNumber) {
                    System.out.println("Congratulation!!!\nYour guessed the number.\nYou Win.");
                    guessed = true;
                    break;
                } else if (guess < randomNumber && guess>0 && guess<21) {
                    System.out
                            .println(
                                    "Your guessed number is smaller than my number.\nYou have " + (k - 1)
                                            + " tries left.");
                    k--;
                } else if (guess > randomNumber && guess>0 && guess<21) {
                    System.out.println(
                            "Your guessed number is greater than my number.\nYou have " + (k - 1) + " tries left.");
                    k--;
                } else {
                    System.out.println(
                            "Invalid Input. Enter number between 1 to 20.\nYou have " + (k - 1) + " tries left.");
                    k--;
                }
            }
            if (!guessed) {
                System.out.println("You ran out of tries. Your Lose.\nI was thinking " + randomNumber);
            }
            System.out.print("\nEnter 1 to play again : ");
            int i = sc.nextInt();
            if (i == 1) {
                NumberGuessingGame();
            }
        }
        


    }
}