package Built_inFunc.Problem_Statement_1;

import java.util.*;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value: ");
        double val = sc.nextDouble();
        System.out.print("Enter type (C/F): ");
        char t = sc.next().charAt(0);
        if (t == 'C')
            System.out.println("Fahrenheit: " + (val * 9 / 5 + 32));
        else
            System.out.println("Celsius: " + ((val - 32) * 5 / 9));
    }
}
