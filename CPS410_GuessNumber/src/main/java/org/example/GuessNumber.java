package org.example;

public class GuessNumber {
    public static void main(String[] args) {
        String theNumber = "";
        String theGuess = "";

        System.out.println("Player 1, pick a number 1-100: ");
        theNumber = System.console().readLine();

        System.out.println("Player 2, guess the number: ");
        theGuess = System.console().readLine();

        // Guess the number
        guessNumber(theNumber, theGuess);
    }

    /**
     * Check if the guessed number is correct.
     * @param theNumber - the number to guess picked by player 1
     * @param theGuess - the guess made by player 2
     * @return - true if number was guessed, false otherwise
     */
    public static boolean guessNumber(String theNumber, String theGuess) {
        if (isInteger(theNumber) && isInteger(theGuess)) {
            int number = Integer.parseInt(theNumber);
            int guess = Integer.parseInt(theGuess);
            if (guess == number) {
                System.out.println("Congratulations! You guessed the number " + number + ".");
                return true;
            } else {
                System.out.println("Sorry, the number was " + number + ".");
                return false;
            }
        }
        return false;
    }

    /**
     * Checks if the input String is an integer.
     * @param str - String to be checked
     * @return - true if string is an integer, false otherwise
     */
    public static boolean isInteger(String str) {
        if (str == null || str.isEmpty()) {
            return false; // Handle null or empty strings
        }
        try {
            Integer.parseInt(str); // Attempt to parse the string into an int
            return true; // If successful, it's a valid integer
        } catch (NumberFormatException e) {
            return false; // If parsing fails, it's not a valid integer
        }
    }
}