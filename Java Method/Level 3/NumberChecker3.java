import java.util.Arrays;
import java.util.Scanner;
public class NumberChecker3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] digits = storeDigits(number);
        int[] reversed = reverseArray(digits);
        System.out.println("Palindrome: " + Arrays.equals(digits, reversed));
        System.out.println("Duck Number: " + isDuckNumber(digits));
    }
    public static int[] storeDigits(int number) {
        String s = String.valueOf(number);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) digits[i] = s.charAt(i) - '0';
        return digits;
    }
    public static int[] reverseArray(int[] arr) {
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++) rev[i] = arr[arr.length - 1 - i];
        return rev;
    }
    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) if (d == 0) return true;
        return false;
    }
}
