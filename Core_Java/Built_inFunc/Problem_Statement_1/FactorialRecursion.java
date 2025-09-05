package Built_inFunc.Problem_Statement_1;

import java.util.*;

public class FactorialRecursion {
    static int fact(int n) {
        if (n <= 1)
            return 1;
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Factorial: " + fact(n));
    }
}
