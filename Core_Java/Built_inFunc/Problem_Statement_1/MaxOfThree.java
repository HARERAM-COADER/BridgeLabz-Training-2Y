package Built_inFunc.Problem_Statement_1;

import java.util.*;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println("Maximum: " + max);
    }
}
