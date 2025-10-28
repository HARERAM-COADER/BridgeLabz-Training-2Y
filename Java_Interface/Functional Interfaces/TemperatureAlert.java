import java.util.function.Predicate;
public class TemperatureAlert {
    public static void main(String[] args) {
        Predicate<Double> isTooHot = temperature -> temperature > 35.0;

        double currentTemp1 = 38.5;
        double currentTemp2 = 25.0;

        if (isTooHot.test(currentTemp1)) {
            System.out.println("ALERT! Temperature is " + currentTemp1 + "°C, which is above the threshold.");
        } else {
            System.out.println("Temperature is " + currentTemp1 + "°C. All normal.");
        }

        if (isTooHot.test(currentTemp2)) {
            System.out.println("ALERT! Temperature is " + currentTemp2 + "°C, which is above the threshold.");
        } else {
            System.out.println("Temperature is " + currentTemp2 + "°C. All normal.");
        }
    }
}