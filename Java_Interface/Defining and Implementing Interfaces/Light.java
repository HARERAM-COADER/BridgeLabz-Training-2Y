public class Light implements SmartDevice {
    private String location;

    public Light(String location) {
        this.location = location;
    }

    @Override
    public void turnOn() {
        System.out.println(location + " light has been turned ON.");
    }

    @Override
    public void turnOff() {
        System.out.println(location + " light has been turned OFF.");
    }
}