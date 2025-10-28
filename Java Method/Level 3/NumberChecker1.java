import java.util.Scanner;
public class NumberChecker1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] digits = storeDigits(number);
        System.out.println("Count of digits: " + digits.length);
        System.out.println("Duck Number: " + isDuckNumber(digits));
        System.out.println("Armstrong Number: " + isArmstrongNumber(digits, number));
        int[] largestSmallest = findLargestSmallest(digits);
        System.out.println("Largest Digit: " + largestSmallest[0]);
        System.out.println("Second Largest Digit: " + largestSmallest[1]);
        System.out.println("Smallest Digit: " + largestSmallest[2]);
        System.out.println("Second Smallest Digit: " + largestSmallest[3]);
    }
    public static int[] storeDigits(int number) {
        String s = String.valueOf(number);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) digits[i] = s.charAt(i) - '0';
        return digits;
    }
    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) if (d == 0) return true;
        return false;
    }
    public static boolean isArmstrongNumber(int[] digits, int number) {
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, digits.length);
        return sum == number;
    }
    public static int[] findLargestSmallest(int[] digits) {
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
            if (d < smallest) {
                secondSmallest = smallest;
                smallest = d;
            } else if (d < secondSmallest && d != smallest) {
                secondSmallest = d;
            }
        }
        return new int[]{largest, secondLargest, smallest, secondSmallest};
    }
}
