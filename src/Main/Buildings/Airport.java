package Main.Buildings;
import Main.Vehicles.*;
import Main.Person;
import java.util.ArrayList;

final public class Airport extends Terminal {
    private ArrayList<Passenger> passengers = new ArrayList<>() ;
    private ArrayList<Cargo> cargos  = new ArrayList<>() ;
    private String type ;
    private int n_bands;

    public Airport(int cost, String n_city, String n_terminal, String address, int extent, String kind, String type, int n_bands) {
        super(cost, n_city, n_terminal, address, extent, kind);
        this.type = type;
        this.n_bands = n_bands;
    }

    // setters and getters

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }
    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }
    public ArrayList<Cargo> getCargos() {
        return cargos;
    }
    public void setCargos(ArrayList<Cargo> cargos) {
        this.cargos = cargos;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getN_bands() {
        return n_bands;
    }
    public void setN_bands(int n_bands) {
        this.n_bands = n_bands;
    }
}
