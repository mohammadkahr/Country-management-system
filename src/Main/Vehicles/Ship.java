package Main.Vehicles;

import Main.Person;

final public class Ship extends Marine_Vehicle {

    private String Fuel;
    private int Minimum_depth;
    private int N_restaurant;
    private int N_rooms;
    private Person sailor;

    public Ship(String price, int capacity, int id, String company, String fuel, int minimum_depth, int n_restaurant, int n_rooms, Person sailor) {
        super(price, capacity, id, company);
        Fuel = fuel;
        Minimum_depth = minimum_depth;
        N_restaurant = n_restaurant;
        N_rooms = n_rooms;
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
    public int getN_restaurant() {
        return N_restaurant;
    }
    public void setN_restaurant(int n_restaurant) {
        N_restaurant = n_restaurant;
    }
    public int getN_rooms() {
        return N_rooms;
    }
    public void setN_rooms(int n_rooms) {
        N_rooms = n_rooms;
    }
}
