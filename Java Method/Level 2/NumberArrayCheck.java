import java.util.Scanner;

public class NumberArrayCheck {

    public static boolean isPositive(int n) {
        return n > 0;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static int compare(int a, int b) {
        if (a > b) return 1;
        else if (a == b) return 0;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();

            if (isPositive(arr[i])) {
                System.out.print(arr[i] + " is Positive and ");
                System.out.println(isEven(arr[i]) ? "Even" : "Odd");
            } else {
                System.out.println(arr[i] + " is Negative");
            }
        }

        int cmp = compare(arr[0], arr[arr.length - 1]);
        if (cmp == 0) System.out.println("First and last elements are Equal");
        else if (cmp == 1) System.out.println("First element is Greater");
        else System.out.println("First element is Smaller");
    }
}
