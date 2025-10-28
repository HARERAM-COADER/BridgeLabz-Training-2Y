import java.util.Scanner;
public class NumberChecker2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] digits = storeDigits(number);
        System.out.println("Sum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of squares of digits: " + sumOfSquares(digits));
        System.out.println("Harshad Number: " + isHarshad(number, digits));
        int[][] freq = digitFrequency(digits);
        for (int[] f : freq) if (f[1] > 0) System.out.println("Digit " + f[0] + ": " + f[1]);
    }
    public static int[] storeDigits(int number) {
        String s = String.valueOf(number);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) digits[i] = s.charAt(i) - '0';
        return digits;
    }
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }
    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, 2);
        return sum;
    }
    public static boolean isHarshad(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }
    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) freq[i][0] = i;
        for (int d : digits) freq[d][1]++;
        return freq;
    }
}
