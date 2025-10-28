public interface Vehicle {
    void displaySpeed();

    default void displayBatteryPercentage() {
        System.out.println("Battery display not available for this vehicle type.");
    }
}
