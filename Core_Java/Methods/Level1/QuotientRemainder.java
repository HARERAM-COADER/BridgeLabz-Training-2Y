package Methods.Level1;

import java.util.Scanner;

public class QuotientRemainder {
    public void calculate(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        System.out.println("Quotient: " + quotient + ", Remainder: " + remainder);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int divisor = sc.nextInt();
        QuotientRemainder obj = new QuotientRemainder();
        obj.calculate(number, divisor);
    }
}
