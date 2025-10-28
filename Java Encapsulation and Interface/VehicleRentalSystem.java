abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }

    public abstract double calculateRentalCost(int days);
}

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

class Car extends Vehicle implements Insurable {
    public Car(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Car", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) { return days * getRentalRate(); }

    @Override
    public double calculateInsurance() { return getRentalRate() * 0.1; }

    @Override
    public String getInsuranceDetails() { return "Car insurance at 10% of rental rate"; }
}

class Bike extends Vehicle implements Insurable {
    public Bike(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Bike", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) { return days * getRentalRate(); }

    @Override
    public double calculateInsurance() { return getRentalRate() * 0.05; }

    @Override
    public String getInsuranceDetails() { return "Bike insurance at 5% of rental rate"; }
}

class Truck extends Vehicle implements Insurable {
    public Truck(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Truck", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) { return days * getRentalRate(); }

    @Override
    public double calculateInsurance() { return getRentalRate() * 0.15; }

    @Override
    public String getInsuranceDetails() { return "Truck insurance at 15% of rental rate"; }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car("C101", 2000),
            new Bike("B202", 500),
            new Truck("T303", 5000)
        };

        for (Vehicle v : vehicles) {
            System.out.println("Vehicle: " + v.getType() + " (" + v.getVehicleNumber() + ")");
            System.out.println("Rental Cost for 5 days: " + v.calculateRentalCost(5));
            if (v instanceof Insurable) {
                Insurable ins = (Insurable) v;
                System.out.println("Insurance: " + ins.calculateInsurance());
                System.out.println(ins.getInsuranceDetails());
            }
            System.out.println();
        }
    }
}
