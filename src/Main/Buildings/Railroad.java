package Main.Buildings;
import Main.Vehicles.*;
import Main.Person;
import java.util.ArrayList;

final public class Railroad extends Terminal{
    private ArrayList<Train> trains = new ArrayList<>() ;
    private int n_in_rail;
    private int n_out_rail;

    public Railroad(int cost, String n_city, String n_terminal, String address, int extent, String kind, int n_in_rail, int n_out_rail) {
        super(cost, n_city, n_terminal, address, extent, kind);
        this.n_in_rail = n_in_rail;
        this.n_out_rail = n_out_rail;
    }

    // getters and setters
    public ArrayList<Train> getTrains() {
        return trains;
    }
    public void setTrains(ArrayList<Train> trains) {
        this.trains = trains;
    }
    public int getN_in_rail() {
        return n_in_rail;
    }
    public void setN_in_rail(int n_in_rail) {
        this.n_in_rail = n_in_rail;
    }
    public int getN_out_rail() {
        return n_out_rail;
    }
    public void setN_out_rail(int n_out_rail) {
        this.n_out_rail = n_out_rail;
    }
}
