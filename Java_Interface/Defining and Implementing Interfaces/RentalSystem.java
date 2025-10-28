public class RentalSystem {
    public static void main(String[] args) {
        Rentable myCar = new Car("Honda Civic");
        Rentable myBike = new Bike();
        Rentable tourBus = new Bus();

        System.out.println("--- Renting Vehicles ---");
        myCar.rent();
        myBike.rent();
        tourBus.rent();

        System.out.println("\n--- Returning Vehicles ---");
        myCar.returnVehicle();
        myBike.returnVehicle();
        tourBus.returnVehicle();
    }
}
