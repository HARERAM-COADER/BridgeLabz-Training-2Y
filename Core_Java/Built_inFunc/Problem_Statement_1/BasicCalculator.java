package Built_inFunc.Problem_Statement_1;

import java.util.*;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble();
        System.out.print("Enter op (+,-,*,/): ");
        char op = sc.next().charAt(0);
        double res = 0;
        if (op == '+')
            res = a + b;
        else if (op == '-')
            res = a - b;
        else if (op == '*')
            res = a * b;
        else if (op == '/')
            res = a / b;
        System.out.println("Result: " + res);
    }
}
