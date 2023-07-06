package practice.day4.homework;

public class Vehicle {
    final static double DEFAULT_FUEL_CONSUMPTION = 1.25;
    private double fuelConsumption;
    private double fuel;
    private int horsePower;

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        if (this.fuelConsumption < 0){
            throw new IllegalArgumentException("Wrong data!");
        }
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        if (this.fuel < 0){
            throw new IllegalArgumentException("Wrong data!");
        }
        this.fuel = fuel;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        if (this.horsePower < 50){
            throw new IllegalArgumentException("Wrong data!");
        }
        this.horsePower = horsePower;
    }
    public Vehicle(double fuel, int horsePower){
        this.fuel = fuel;
        this.horsePower = horsePower;
        this.fuelConsumption = DEFAULT_FUEL_CONSUMPTION;
    }
    public void Drive(double kilometers){
        double fuelLeft = fuel - (kilometers*getFuelConsumption()) / 100;
        double drivable_Kilometers = (getFuel()/getFuelConsumption())*100;
        if (drivable_Kilometers < kilometers){
            System.out.println("You can drive " + drivable_Kilometers + " kilometers with " + getFuel());;
        }
        else
            System.out.println("You will have " + fuelLeft + " litters left after your " + kilometers + " kilometers drive");

    }

}
