package Arrays;

import java.util.*;

public class level_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1
        int[] ages = new int[10];
        for (int i = 0; i < ages.length; i++) {
            ages[i] = sc.nextInt();
            if (ages[i] < 0) {
                System.out.println("Invalid age");
            } else if (ages[i] >= 18) {
                System.out.println("The student with the age " + ages[i] + " can vote.");
            } else {
                System.out.println("The student with the age " + ages[i] + " cannot vote.");
            }
        }

        // 2
        int[] nums = new int[5];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
            if (nums[i] > 0) {
                if (nums[i] % 2 == 0) System.out.println(nums[i] + " is positive even");
                else System.out.println(nums[i] + " is positive odd");
            } else if (nums[i] < 0) {
                System.out.println(nums[i] + " is negative");
            } else {
                System.out.println("Zero");
            }
        }
        if (nums[0] == nums[nums.length - 1]) System.out.println("Equal");
        else if (nums[0] > nums[nums.length - 1]) System.out.println("Greater");
        else System.out.println("Less");

        // 3
        int n = sc.nextInt();
        int[] table = new int[10];
        for (int i = 0; i < 10; i++) {
            table[i] = n * (i + 1);
            System.out.println(n + " * " + (i + 1) + " = " + table[i]);
        }

        // 4
        double[] arr = new double[10];
        int idx = 0;
        while (true) {
            double val = sc.nextDouble();
            if (val <= 0 || idx == 10) break;
            arr[idx++] = val;
        }
        double total = 0;
        for (int i = 0; i < idx; i++) total += arr[i];
        System.out.println("Sum = " + total);

        // 5
        int num = sc.nextInt();
        int[] res = new int[4];
        for (int i = 6; i <= 9; i++) {
            res[i - 6] = num * i;
            System.out.println(num + " * " + i + " = " + res[i - 6]);
        }

        // 6
        double[] heights = new double[11];
        double sum = 0;
        for (int i = 0; i < 11; i++) {
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }
        System.out.println("Mean height = " + (sum / 11));

        // 7
        int number = sc.nextInt();
        if (number <= 0) return;
        int[] odd = new int[number / 2 + 1];
        int[] even = new int[number / 2 + 1];
        int oi = 0, ei = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) even[ei++] = i;
            else odd[oi++] = i;
        }
        System.out.println("Odd numbers:");
        for (int i = 0; i < oi; i++) System.out.print(odd[i] + " ");
        System.out.println("\nEven numbers:");
        for (int i = 0; i < ei; i++) System.out.print(even[i] + " ");
        System.out.println();

        // 8
        int val = sc.nextInt();
        int[] factors = new int[50];
        int fi = 0;
        for (int i = 1; i <= val; i++) {
            if (val % i == 0) factors[fi++] = i;
        }
        System.out.println("Factors:");
        for (int i = 0; i < fi; i++) System.out.print(factors[i] + " ");
        System.out.println();

        // 9
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] mat = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int[] oned = new int[rows * cols];
        int k = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                oned[k++] = mat[i][j];
            }
        }
        System.out.println("1D Array:");
        for (int x : oned) System.out.print(x + " ");
        System.out.println();

        // 10
        int limit = sc.nextInt();
        String[] fb = new String[limit + 1];
        for (int i = 1; i <= limit; i++) {
            if (i % 3 == 0 && i % 5 == 0) fb[i] = "FizzBuzz";
            else if (i % 3 == 0) fb[i] = "Fizz";
            else if (i % 5 == 0) fb[i] = "Buzz";
            else fb[i] = String.valueOf(i);
        }
        for (int i = 1; i <= limit; i++) {
            System.out.println("Position " + i + " = " + fb[i]);
        }
    }
}
