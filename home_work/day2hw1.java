import java.util.ArrayList;
import java.util.List;interface Insurable {
    double getInsuranceCost();
}


abstract class Vehicle {
    protected String vehicleNumber;
    protected String brand;
    protected double baseRate;

    public Vehicle(String vehicleNumber, String brand, double baseRate) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.baseRate = baseRate;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getBrand() {
        return brand;
    }

    
    public abstract double calculateRentalCost(int days);
}


class Car extends Vehicle implements Insurable {
    public Car(String vehicleNumber, String brand, double baseRate) {
        super(vehicleNumber, brand, baseRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return baseRate * days;
    }

    @Override
    public double getInsuranceCost() {
        return 150.0; // Flat daily/fixed insurance fee for cars
    }
}


class Bike extends Vehicle {
    public Bike(String vehicleNumber, String brand, double baseRate) {
        super(vehicleNumber, brand, baseRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        // Bikes get a 10% discount for rentals longer than 3 days
        double total = baseRate * days;
        if (days > 3) {
            total *= 0.90;
        }
        return total;
    }
}


class Truck extends Vehicle implements Insurable {
    public Truck(String vehicleNumber, String brand, double baseRate) {
        super(vehicleNumber, brand, baseRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        // Trucks have a standard rate + heavy vehicle surcharge
        return (baseRate * days) + 500.0; 
    }

    @Override
    public double getInsuranceCost() {
        return 350.0; // Higher insurance fee for commercial trucks
    }
}

class RentalAgency {
    private List<Vehicle> fleet = new ArrayList<>();

    public void addVehicle(Vehicle v) {
        fleet.add(v);
    }

    public void generateBill(String vehicleNumber, int days) {
        Vehicle target = null;
        for (Vehicle v : fleet) {
            if (v.getVehicleNumber().equalsIgnoreCase(vehicleNumber)) {
                target = v;
                break;
            }
        }

        if (target == null) {
            System.out.println("Error: Vehicle " + vehicleNumber + " not found in system.");
            return;
        }

        double rentalCost = target.calculateRentalCost(days);
        double insuranceCost = 0.0;

       
        if (target instanceof Insurable) {
            insuranceCost = ((Insurable) target).getInsuranceCost() * days;
        }

        double grandTotal = rentalCost + insuranceCost;

        
        System.out.println("======== RENTAL BILL ========");
        System.out.println("Vehicle: " + target.getBrand() + " [" + target.getVehicleNumber() + "]");
        System.out.println("Type: " + target.getClass().getSimpleName());
        System.out.println("Days Rented: " + days);
        System.out.println("Rental Base Fee: ₹" + rentalCost);
        System.out.println("Insurance Fee:   ₹" + insuranceCost);
        System.out.println("-----------------------------");
        System.out.println("Grand Total:     ₹" + grandTotal);
        System.out.println("=============================\n");
    }
}

m
public class day2hw1 {
    public static void main(String[] args) {
        RentalAgency agency = new RentalAgency();

        // Register vehicles
        agency.addVehicle(new Car("CAR-101", "Honda City", 1200.0));
        agency.addVehicle(new Bike("BIK-202", "Yamaha FZ", 400.0));
        agency.addVehicle(new Truck("TRK-303", "Tata Prima", 3000.0));

        // Generate bills demonstrating polymorphic execution
        agency.generateBill("CAR-101", 3); // Rent Car (Includes Insurance)
        agency.generateBill("BIK-202", 5); // Rent Bike (No Insurance, 10% discount applied)
        agency.generateBill("TRK-303", 2); // Rent Truck (Includes Insurance + Truck Surcharge)
    }
}
