import java.util.Scanner;

public class BMICalculator {

    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightMeters = data[i][1] / 100.0; 
            data[i][2] = weight / (heightMeters * heightMeters);
        }
    }

    public static String[] findBMIStatus(double[][] data) {
        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi <= 18.4) status[i] = "Underweight";
            else if (bmi <= 24.9) status[i] = "Normal";
            else if (bmi <= 39.9) status[i] = "Overweight";
            else status[i] = "Obese";
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3]; 

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
        }

        calculateBMI(data);
        String[] status = findBMIStatus(data);

        System.out.printf("%-10s %-10s %-10s %-12s\n", "Weight", "Height", "BMI", "Status");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-12s\n",
                    data[i][0], data[i][1], data[i][2], status[i]);
        }
    }
}
