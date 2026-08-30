public class VehicleRental {

    static class Vehicle {
        protected String vehicleNumber;
        protected String brand;
        protected int rentPerDay;

        public Vehicle(String vehicleNumber, String brand, int rentPerDay) {
            this.vehicleNumber = vehicleNumber;
            this.brand = brand;
            this.rentPerDay = rentPerDay;
        }

        public double calculateRent(int days) {
            return 0.0;
        }

        public void displayDetails() {
            System.out.println("vehicleNumber: " + vehicleNumber);
            System.out.println("brand: " + brand);
            System.out.println("rentPerDay: " + rentPerDay);
        }
    }

    static class Car extends Vehicle {
        private static final double LUXURY_CHARGE = 0.2;

        public Car(String vehicleNumber, String brand, int rentPerDay) {
            super(vehicleNumber, brand, rentPerDay);
        }

        @Override
        public double calculateRent(int days) {
            return (rentPerDay + rentPerDay * LUXURY_CHARGE) * days;
        }

        @Override
        public void displayDetails() {
            super.displayDetails();
            System.out.println("rentPaid: " + calculateRent(5));
        }
    }

    static class Bike extends Vehicle {
        private static final double DISCOUNT = 0.1;

        public Bike(String vehicleNumber, String brand, int rentPerDay) {
            super(vehicleNumber, brand, rentPerDay);
        }

        @Override
        public double calculateRent(int days) {
            return (rentPerDay - rentPerDay * DISCOUNT) * days;
        }

        @Override
        public void displayDetails() {
            super.displayDetails();
            System.out.println("rentPaid: " + calculateRent(5));
        }
    }

    static class Truck extends Vehicle {
        private static final int FLAT_CHARGE = 500;

        public Truck(String vehicleNumber, String brand, int rentPerDay) {
            super(vehicleNumber, brand, rentPerDay);
        }

        @Override
        public double calculateRent(int days) {
            return rentPerDay * days + FLAT_CHARGE;
        }

        @Override
        public void displayDetails() {
            super.displayDetails();
            System.out.println("rentPaid: " + calculateRent(5));
        }
    }

    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car("1234", "abc", 1000);
        vehicles[1] = new Bike("5678", "pqr", 1000);
        vehicles[2] = new Truck("1267", "xyz", 1000);

        for (Vehicle v : vehicles) {
            v.displayDetails();
            System.out.println("-----");
        }
    }
}