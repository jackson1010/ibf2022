package myapp;

public class Main {
    public static void main(String[] args) {
        Car mycar = new Car("White", true, "Tesla model X");
        mycar.start();
        mycar.drive(); 


        Car car = new Car("2022 Blue Ferrari 296 GTS");
        Car ferrari = new GasPoweredCar("2022 Blue Ferrari 296 GTS",15.4, 6);
        ferrari.drive();


    }

    
}
