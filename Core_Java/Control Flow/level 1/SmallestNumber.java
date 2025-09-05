import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();

        if (number1 < number2 && number1 < number3) {
            System.out.println("The first number is the smallest.");
        } else {
            System.out.println("The first number is not the smallest.");
        }
    }
}
