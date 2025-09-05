import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks in Physics: ");
        double physics = sc.nextDouble();
        System.out.print("Enter marks in Chemistry: ");
        double chemistry = sc.nextDouble();
        System.out.print("Enter marks in Maths: ");
        double maths = sc.nextDouble();

        double average = (physics + chemistry + maths) / 3;
        System.out.println("Average Mark: " + average + "%");

        if (average >= 80) {
            System.out.println("Grade: A (Level 4, above agency-normalized standards)");
        } else if (average >= 70) {
            System.out.println("Grade: B (Level 3, at agency-normalized standards)");
        } else if (average >= 60) {
            System.out.println("Grade: C (Level 2, below, but approaching agency-normalized standards)");
        } else if (average >= 50) {
            System.out.println("Grade: D (Level 1, well below agency-normalized standards)");
        } else if (average >= 40) {
            System.out.println("Grade: E (Level 1-, too below agency-normalized standards)");
        } else {
            System.out.println("Grade: R (Remedial standards)");
        }
    }
}
