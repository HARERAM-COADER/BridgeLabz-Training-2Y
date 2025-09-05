package Built_inFunc.Problem_Statement_1;

import java.util.*;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = 1, high = 100;
        String feedback = "";
        while (!feedback.equals("correct")) {
            int guess = low + (int) (Math.random() * (high - low + 1));
            System.out.println("Computer guesses: " + guess);
            System.out.print("Enter feedback (high/low/correct): ");
            feedback = sc.next();
            if (feedback.equals("high"))
                high = guess - 1;
            else if (feedback.equals("low"))
                low = guess + 1;
        }
        System.out.println("Computer guessed it!");
    }
}
