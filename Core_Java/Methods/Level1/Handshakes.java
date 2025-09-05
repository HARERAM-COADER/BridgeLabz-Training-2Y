package Methods.Level1;

import java.util.Scanner;

public class Handshakes {
    public void calculate(int n) {
        int handshakes = (n * (n - 1)) / 2;
        System.out.println("Maximum handshakes: " + handshakes);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Handshakes obj = new Handshakes();
        obj.calculate(n);
    }
}
