import java.util.Scanner;

public class SmallestAndLargest {
    public static int[] findSmallestAndLargest(int a, int b, int c) {
        int smallest = Math.min(a, Math.min(b, c));
        int largest = Math.max(a, Math.max(b, c));
        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int a = sc.nextInt();
        System.out.print("Enter number2: ");
        int b = sc.nextInt();
        System.out.print("Enter number3: ");
        int c = sc.nextInt();

        int[] result = findSmallestAndLargest(a, b, c);
        System.out.println("Smallest: " + result[0]);
        System.out.println("Largest: " + result[1]);
    }
}
