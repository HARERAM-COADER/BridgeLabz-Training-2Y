package Methods.Level2;

public class UnitConverter {
    public double kmToMiles(double km) {
        return km * 0.621371;
    }

    public double milesToKm(double m) {
        return m * 1.60934;
    }

    public double mToFeet(double m) {
        return m * 3.28084;
    }

    public double feetToM(double f) {
        return f * 0.3048;
    }

    public double yardsToFeet(double y) {
        return y * 3;
    }

    public double feetToYards(double f) {
        return f * 0.333333;
    }

    public double mToInches(double m) {
        return m * 39.3701;
    }

    public double inchesToM(double i) {
        return i * 0.0254;
    }

    public double inchesToCm(double i) {
        return i * 2.54;
    }

    public double fToC(double f) {
        return (f - 32) * 5 / 9;
    }

    public double cToF(double c) {
        return c * 9 / 5 + 32;
    }

    public double poundsToKg(double p) {
        return p * 0.453592;
    }

    public double kgToPounds(double k) {
        return k * 2.20462;
    }

    public double gallonsToLiters(double g) {
        return g * 3.78541;
    }

    public double litersToGallons(double l) {
        return l * 0.264172;
    }

    public static void main(String[] args) {
        UnitConverter u = new UnitConverter();
        System.out.println("10 km = " + u.kmToMiles(10) + " miles");
    }
}
