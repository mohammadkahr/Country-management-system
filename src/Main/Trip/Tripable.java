package Main.Trip;
import Main.City;

import java.util.Scanner;

public interface Tripable {
    static Scanner input = new Scanner(System.in);

    // methods
    void newTrip(City city);
    void sortTrips();
    int calculateCostTrip(TakeATrip trip);
    void listOfTripsIn(String nameTerminal);
    void listOfTripsOut(String nameTerminal);

}
