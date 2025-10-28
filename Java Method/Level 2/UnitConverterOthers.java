public class UnitConverterOthers {

    public static double convertFarhenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double convertCelsiusToFarhenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKilogramsToPounds(double kg) {
        return kg * 2.20462;
    }

    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {
        System.out.println("98F = " + convertFarhenheitToCelsius(98) + "C");
        System.out.println("37C = " + convertCelsiusToFarhenheit(37) + "F");
        System.out.println("50 pounds = " + convertPoundsToKilograms(50) + " kg");
        System.out.println("10 kg = " + convertKilogramsToPounds(10) + " pounds");
        System.out.println("5 gallons = " + convertGallonsToLiters(5) + " liters");
        System.out.println("20 liters = " + convertLitersToGallons(20) + " gallons");
    }
}
