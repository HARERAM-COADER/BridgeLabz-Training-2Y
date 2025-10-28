public class ElectricCar implements Vehicle {
    @Override
    public void displaySpeed() {
        System.out.println("Electric Car: Speed is 75 mph.");
    }

    @Override
    public void displayBatteryPercentage() {
        System.out.println("Electric Car: Battery is at 85%.");
    }
}
