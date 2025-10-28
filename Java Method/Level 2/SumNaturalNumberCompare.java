import java.util.Scanner;

public class SumNaturalNumbersCompare {

    public static int findSumRecursive(int n) {
        if (n == 0) return 0;
        return n + findSumRecursive(n - 1);
    }

    public static int findSumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number.");
            return;
        }

        int recursiveSum = findSumRecursive(n);
        int formulaSum = findSumFormula(n);
        System.out.println("Recursive Sum = " + recursiveSum);
        System.out.println("Formula Sum = " + formulaSum);
        System.out.println(recursiveSum == formulaSum ? "Results Match" : "Results Do Not Match");
    }
}
