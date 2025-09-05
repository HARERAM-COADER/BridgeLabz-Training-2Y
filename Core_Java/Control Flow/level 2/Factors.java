import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();

        if (n > 0) {
            System.out.println("Factors of " + n + ":");
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Invalid input. Enter a positive integer.");
        }
    }
}
