public class LogisticsSoftware {
    public static void main(String[] args) {
        double distanceKm = 100.0;
        double weightKg = 50.0;

        double distanceMiles = UnitConverter.kilometersToMiles(distanceKm);
        double weightLbs = UnitConverter.kilogramsToPounds(weightKg);

        System.out.println("--- Logistics Conversion ---");
        System.out.println(distanceKm + " km is equal to " + String.format("%.2f", distanceMiles) + " miles.");
        System.out.println(weightKg + " kg is equal to " + String.format("%.2f", weightLbs) + " pounds.");
    }
}
