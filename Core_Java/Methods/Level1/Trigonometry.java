package Methods.Level1;

import java.util.Scanner;

public class Trigonometry {
    public void calculate(double angle) {
        double rad = Math.toRadians(angle);
        double sin = Math.sin(rad);
        double cos = Math.cos(rad);
        double tan = Math.tan(rad);
        System.out.println("sin: " + sin + ", cos: " + cos + ", tan: " + tan);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double angle = sc.nextDouble();
        Trigonometry obj = new Trigonometry();
        obj.calculate(angle);
    }
}
