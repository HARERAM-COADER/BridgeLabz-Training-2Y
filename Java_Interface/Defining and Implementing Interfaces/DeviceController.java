public class DeviceController {
    public static void main(String[] args) {
        SmartDevice livingRoomLight = new Light("Living Room");
        SmartDevice ac = new AirConditioner();
        SmartDevice tv = new Television();

        System.out.println("--- Controlling Devices ---");
        livingRoomLight.turnOn();
        ac.turnOn();
        tv.turnOn();

        System.out.println("\n--- Turning Off Devices ---");
        livingRoomLight.turnOff();
        ac.turnOff();
        tv.turnOff();
    }
}