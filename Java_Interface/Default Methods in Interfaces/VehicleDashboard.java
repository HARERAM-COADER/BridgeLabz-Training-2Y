public class VehicleDashboard {
    public static void main(String[] args) {
        Vehicle gasCar = new GasolineCar();
        Vehicle electricCar = new ElectricCar();

        System.out.println("--- Gasoline Car Dashboard ---");
        gasCar.displaySpeed();
        gasCar.displayBatteryPercentage(); // Uses default method

        System.out.println("\n--- Electric Car Dashboard ---");
        electricCar.displaySpeed();
        electricCar.displayBatteryPercentage(); // Uses overridden method
    }
}
