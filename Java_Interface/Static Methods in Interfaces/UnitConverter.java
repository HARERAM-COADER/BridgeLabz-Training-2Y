public interface UnitConverter {
    static double kilometersToMiles(double km) {
        return km * 0.621371;
    }

    static double kilogramsToPounds(double kg) {
        return kg * 2.20462;
    }
}
