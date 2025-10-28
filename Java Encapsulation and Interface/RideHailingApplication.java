abstract class RideVehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public RideVehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public String getVehicleId() { return vehicleId; }
    public String getDriverName() { return driverName; }
    public double getRatePerKm() { return ratePerKm; }

    public abstract double calculateFare(double distanceKm);
}

interface Rating {
    void addRating(double rating);
    double getAverageRating();
}

class CarRide extends RideVehicle implements Rating {
    private double totalRating = 0;
    private int ratingCount = 0;

    public CarRide(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distanceKm) {
        double base = 20; // base fare
        return base + distanceKm * getRatePerKm();
    }

    @Override
    public void addRating(double rating) {
        totalRating += rating;
        ratingCount++;
    }

    @Override
    public double getAverageRating() {
        return ratingCount == 0 ? 0.0 : totalRating / ratingCount;
    }
}

class BikeRide extends RideVehicle implements Rating {
    private double totalRating = 0;
    private int ratingCount = 0;

    public BikeRide(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distanceKm) {
        double base = 10; // base fare for bike
        return base + distanceKm * getRatePerKm();
    }

    @Override
    public void addRating(double rating) {
        totalRating += rating;
        ratingCount++;
    }

    @Override
    public double getAverageRating() {
        return ratingCount == 0 ? 0.0 : totalRating / ratingCount;
    }
}

public class RideHailingApplication {
    public static void main(String[] args) {
        RideVehicle[] rides = {
            new CarRide("CAR123", "Ravi", 12),
            new BikeRide("BIKE456", "Asha", 6)
        };

        double distance = 8.5; // km example
        for (RideVehicle r : rides) {
            System.out.println("Vehicle: " + r.getVehicleId() + " | Driver: " + r.getDriverName());
            System.out.println("Fare for " + distance + " km: " + r.calculateFare(distance));
            if (r instanceof Rating) {
                Rating rt = (Rating) r;
                rt.addRating(4.5);
                rt.addRating(5.0);
                System.out.println("Average Rating: " + rt.getAverageRating());
            }
            System.out.println();
        }
    }
}
