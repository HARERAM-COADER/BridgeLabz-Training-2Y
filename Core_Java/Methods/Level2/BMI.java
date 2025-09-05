package Methods.Level2;

import java.util.*;

public class BMI {
    public double calcBMI(double w, double h) {
        double m = h / 100.0;
        return w / (m * m);
    }

    public String status(double b) {
        if (b < 18.5)
            return "Underweight";
        else if (b < 25)
            return "Normal";
        else if (b < 30)
            return "Overweight";
        else
            return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BMI obj = new BMI();
        for (int i = 0; i < 10; i++) {
            double w = sc.nextDouble(), h = sc.nextDouble();
            double b = obj.calcBMI(w, h);
            System.out.println("W:" + w + " H:" + h + " BMI:" + b + " Status:" + obj.status(b));
        }
    }
}
