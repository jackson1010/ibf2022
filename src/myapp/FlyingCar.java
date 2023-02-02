package myapp;

public class FlyingCar extends Car {

    private float altitude = 0f;

    public FlyingCar() {
    }

    public float getAltitude() {
        return altitude;
    }

    public void setAltitude(float altitude) {
        this.altitude = altitude;
    }

    public void climb(float feet) {
        if (altitude < 100) {
            altitude = Math.min(altitude + feet, 100f);
        }
    }

    @Override
    public String getRegistration() {
        return (super.getRegistration());
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void start() {
        // TODO Auto-generated method stub
        super.start();
        System.out.print("Car is flying");
    }
    

}
