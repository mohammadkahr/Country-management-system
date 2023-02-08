package Main.Vehicles;

import Main.Person;

final public class Boat extends Marine_Vehicle {
    private String Fuel;
    private int Minimum_depth;
    private Person sailor;

    public Boat(String price, int capacity, int id, String company, String fuel, int minimum_depth, Person sailor) {
        super(price, capacity, id, company);
        Fuel = fuel;
        Minimum_depth = minimum_depth;
        this.sailor = sailor;
    }

    // getters and setters

    public Person getSailor() {
        return sailor;
    }
    public void setSailor(Person sailor) {
        this.sailor = sailor;
    }
    public String getFuel() {
        return Fuel;
    }
    public void setFuel(String fuel) {
        Fuel = fuel;
    }
    public int getMinimum_depth() {
        return Minimum_depth;
    }
    public void setMinimum_depth(int minimum_depth) {
        Minimum_depth = minimum_depth;
    }

}
