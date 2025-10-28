public class Television implements SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("Television has been turned ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Television has been turned OFF.");
    }
}
