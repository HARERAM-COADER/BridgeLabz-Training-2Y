package Methods.Level1;

import java.util.Scanner;

public class NumberCheck {
    public void check(int n) {
        if (n > 0) {
            System.out.println("Positive");
        } else if (n < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        NumberCheck obj = new NumberCheck();
        obj.check(n);
    }
}
