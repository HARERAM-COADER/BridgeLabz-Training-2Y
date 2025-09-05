package Built_inFunc.Problem_Statement_1;

import java.util.*;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean prime = (n > 1);
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) {
                prime = false;
                break;
            }
        System.out.println(n + (prime ? " is Prime" : " is Not Prime"));
    }
}
