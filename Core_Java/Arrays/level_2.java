package Arrays;
import java.util.*;

public class level_2 {

    // 1. Bonus calculation
    public static void bonusCalculation() {
        Scanner sc = new Scanner(System.in);
        double[] salary = new double[10];
        int[] years = new int[10];
        double totalBonus = 0, totalOld = 0, totalNew = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter salary of employee " + (i + 1) + ": ");
            salary[i] = sc.nextDouble();
            System.out.print("Enter years of service of employee " + (i + 1) + ": ");
            years[i] = sc.nextInt();
            double bonus = (years[i] > 5) ? salary[i] * 0.05 : salary[i] * 0.02;
            double newSalary = salary[i] + bonus;
            totalBonus += bonus;
            totalOld += salary[i];
            totalNew += newSalary;
            System.out.println("Old Salary=" + salary[i] + " Bonus=" + bonus + " New Salary=" + newSalary);
        }
        System.out.println("Total Bonus=" + totalBonus + " Total Old=" + totalOld + " Total New=" + totalNew);
    }

    // 2. Youngest and tallest friend
    public static void youngestTallest() {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[3];
        int[] heights = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of friend " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of friend " + (i + 1) + ": ");
            heights[i] = sc.nextInt();
        }
        int minAge = ages[0], maxHeight = heights[0];
        for (int i = 1; i < 3; i++) {
            if (ages[i] < minAge) minAge = ages[i];
            if (heights[i] > maxHeight) maxHeight = heights[i];
        }
        System.out.println("Youngest age = " + minAge);
        System.out.println("Tallest height = " + maxHeight);
    }

    // 3. Largest and second largest digit
    public static void largestSecondLargestDigit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int[] digits = new int[10];
        int count = 0;
        while (num > 0 && count < 10) {
            digits[count++] = num % 10;
            num /= 10;
        }
        int largest = digits[0], second = -1;
        for (int i = 1; i < count; i++) {
            if (digits[i] > largest) {
                second = largest;
                largest = digits[i];
            } else if (digits[i] > second && digits[i] != largest) {
                second = digits[i];
            }
        }
        System.out.println("Largest = " + largest + " Second Largest = " + second);
    }

    // 4. Reworked to handle more digits
    public static void largestSecondLargestDigitDynamic() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        List<Integer> digits = new ArrayList<>();
        while (num > 0) {
            digits.add(num % 10);
            num /= 10;
        }
        int largest = digits.get(0), second = -1;
        for (int d : digits) {
            if (d > largest) {
                second = largest;
                largest = d;
            } else if (d > second && d != largest) {
                second = d;
            }
        }
        System.out.println("Largest = " + largest + " Second Largest = " + second);
    }

    // 5. Reverse digits
    public static void reverseDigits() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        List<Integer> digits = new ArrayList<>();
        while (num > 0) {
            digits.add(num % 10);
            num /= 10;
        }
        System.out.print("Reversed: ");
        for (int d : digits) System.out.print(d);
        System.out.println();
    }

    // 6. BMI of persons
    public static void bmiCalculation() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();
        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight of person " + (i + 1) + ": ");
            weight[i] = sc.nextDouble();
            System.out.print("Enter height of person " + (i + 1) + " (in meters): ");
            height[i] = sc.nextDouble();
            bmi[i] = weight[i] / (height[i] * height[i]);
            if (bmi[i] <= 18.4) status[i] = "Underweight";
            else if (bmi[i] <= 24.9) status[i] = "Normal";
            else if (bmi[i] <= 39.9) status[i] = "Overweight";
            else status[i] = "Obese";
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + " Height=" + height[i] + " Weight=" + weight[i] + " BMI=" + bmi[i] + " Status=" + status[i]);
        }
    }

    // 7. BMI with 2D array
    public static void bmi2DArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();
        double[][] data = new double[n][3];
        String[] status = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight of person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height of person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
            data[i][2] = data[i][0] / (data[i][1] * data[i][1]);
            if (data[i][2] <= 18.4) status[i] = "Underweight";
            else if (data[i][2] <= 24.9) status[i] = "Normal";
            else if (data[i][2] <= 39.9) status[i] = "Overweight";
            else status[i] = "Obese";
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + " Height=" + data[i][1] + " Weight=" + data[i][0] + " BMI=" + data[i][2] + " Status=" + status[i]);
        }
    }

    // 8. Student grades
    public static void studentGrades() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[] phy = new int[n];
        int[] chem = new int[n];
        int[] math = new int[n];
        double[] percent = new double[n];
        String[] grade = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Physics, Chemistry, Maths marks of student " + (i + 1) + ": ");
            phy[i] = sc.nextInt();
            chem[i] = sc.nextInt();
            math[i] = sc.nextInt();
            percent[i] = (phy[i] + chem[i] + math[i]) / 3.0;
            if (percent[i] >= 80) grade[i] = "A";
            else if (percent[i] >= 70) grade[i] = "B";
            else if (percent[i] >= 60) grade[i] = "C";
            else if (percent[i] >= 50) grade[i] = "D";
            else if (percent[i] >= 40) grade[i] = "E";
            else grade[i] = "R";
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + " Percentage=" + percent[i] + " Grade=" + grade[i]);
        }
    }

    // 9. Student grades with 2D array
    public static void studentGrades2D() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[][] marks = new int[n][3];
        double[] percent = new double[n];
        String[] grade = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Physics, Chemistry, Maths marks of student " + (i + 1) + ": ");
            marks[i][0] = sc.nextInt();
            marks[i][1] = sc.nextInt();
            marks[i][2] = sc.nextInt();
            percent[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
            if (percent[i] >= 80) grade[i] = "A";
            else if (percent[i] >= 70) grade[i] = "B";
            else if (percent[i] >= 60) grade[i] = "C";
            else if (percent[i] >= 50) grade[i] = "D";
            else if (percent[i] >= 40) grade[i] = "E";
            else grade[i] = "R";
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + " Percentage=" + percent[i] + " Grade=" + grade[i]);
        }
    }

    // 10. Digit frequency
    public static void digitFrequency() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int[] freq = new int[10];
        while (num > 0) {
            int d = num % 10;
            freq[d]++;
            num /= 10;
        }
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) System.out.println("Digit " + i + " occurs " + freq[i] + " times");
        }
    }

    public static void main(String[] args) {
        // Call any method here to test
        bonusCalculation();
        // youngestTallest();
        // largestSecondLargestDigit();
        // largestSecondLargestDigitDynamic();
        // reverseDigits();
        // bmiCalculation();
        // bmi2DArray();
        // studentGrades();
        // studentGrades2D();
        // digitFrequency();
    }
}
