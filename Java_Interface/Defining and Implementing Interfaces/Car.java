public class Car implements Rentable {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    @Override
    public void rent() {
        System.out.println("Car '" + model + "' has been rented.");
    }

    @Override
    public void returnVehicle() {
        System.out.println("Car '" + model + "' has been returned.");
    }
}
