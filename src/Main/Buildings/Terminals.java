package Main.Buildings;
import Main.Person;
import Main.Vehicles.Bus;

import java.util.ArrayList;

final public class Terminals extends Terminal {
    private ArrayList<Bus> buses = new ArrayList<>();

    //constructor
    public Terminals(int cost, String n_city, String n_terminal, String address, int extent, String kind) {
        super(cost, n_city, n_terminal, address, extent, kind);
    }

    //setters and getters
    public ArrayList<Bus> getBuses() {
        return buses;
    }
    public void setBuses(ArrayList<Bus> buses) {
        this.buses = buses;
    }
}
