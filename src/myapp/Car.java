package myapp;

public class Car {
    private String color;
    private boolean started;
    private int counter = 0;
    private String Registration;
    private String description;

    public Car(String color, boolean started, String Registration) {
        this.color = color;
        this.started = started;
        this.Registration = Registration;
    }
    public Car(String description) {
        this.description = description;
    }

    public Car() {
    }

    public String getColor() {
        return color;
    }

    public boolean getStarted() {
        return started;
    }

    public void start() {
        started = true;
        System.out.print("Car is started");
        counter++;
    }

    public void stop() {
        started = false;
        System.out.print("Car has stopped");
    }

    public String getRegistration() {
        return Registration;
    }
    public void drive() {
        System.out.println("Car -> driving, type is " + getClass().getSimpleName());
        start();
    }
}

class ElectricCar extends Car {
    private int batteryLevel;
    private String brand;

    public ElectricCar(String color, boolean started, String Registration, int batteryLevel, String brand) {
        super(color, started, Registration);
        this.batteryLevel = batteryLevel;
        this.brand = brand;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public String getBrand() {
        return brand;
    }

    public void start() {

    }
}

class GasPoweredCar extends Car {

        private double avgKmPerLiter;
        private int cylinders = 6;
    
        public GasPoweredCar(String description) {
            super(description);
        }
    
        public GasPoweredCar(String description, double avgKmPerLiter, int cylinders) {
            super(description);
            this.avgKmPerLiter = avgKmPerLiter;
            this.cylinders = cylinders;
        }
    
    }


