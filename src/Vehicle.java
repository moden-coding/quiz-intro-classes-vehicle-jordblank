public class Vehicle {
    String make;
    String model;
    int year;
    double fuel;
    boolean operational;

    public Vehicle(String ma, String mo, int y, double f) {
        make = ma;
        model = mo;
        year = y;
        fuel = f;
        if (fuel > 0) {
            operational = true;
        } else {
            operational = false;
        }

    }

    public void drive(){
        if (fuel >= 10){
            fuel = fuel - 10;
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
        }
    

    public void refuel(double amount) {
        fuel = amount;

    }

    public String toString() {
        return ("Make: " + make + ", Model: " + model + ", Year: " + year + ", Fuel: " + fuel);

    }
}
