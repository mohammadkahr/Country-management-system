package Main.Buildings;
import Main.Vehicles.*;
import Main.Person;

import java.util.ArrayList;

final public class Harbour extends Terminal{
    private ArrayList<Ship> ships  = new ArrayList<>();
    private ArrayList<Boat> boats = new ArrayList<>();
    private int n_dock;

    public Harbour(int cost, String n_city, String n_terminal, String address, int extent, String kind, int n_dock) {
        super(cost, n_city, n_terminal, address, extent, kind);
        this.n_dock = n_dock;
    }

    // setters and getters
    public ArrayList<Ship> getShips() {
        return ships;
    }
    public void setShips(ArrayList<Ship> ships) {
        this.ships = ships;
    }
    public ArrayList<Boat> getBoats() {
        return boats;
    }
    public void setBoats(ArrayList<Boat> boats) {
        this.boats = boats;
    }
    public int getN_dock() {
        return n_dock;
    }
    public void setN_dock(int n_dock) {
        this.n_dock = n_dock;
    }
}
