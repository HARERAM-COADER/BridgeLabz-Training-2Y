import java.util.Scanner;

public class PowerWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base number: ");
        int number = sc.nextInt();
        System.out.print("Enter power: ");
        int power = sc.nextInt();

        int counter = 0;
        long result = 1;

        while (counter < power) {
            result *= number;
            counter++;
        }

        System.out.println(number + " raised to power " + power + " is: " + result);
    }
}
