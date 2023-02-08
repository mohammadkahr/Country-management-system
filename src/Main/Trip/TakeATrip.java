package Main.Trip;

import Main.Buildings.Terminal;
import Main.Date;
import Main.Person;

import java.lang.reflect.Array;
import java.time.temporal.Temporal;
import java.util.ArrayList;

public class TakeATrip implements  Comparable {
    private Terminal destination ;// مقصد
    private Terminal beginning  ; // مبدا
    private ArrayList<Person> travelers = new ArrayList<>();
    private Person driver ;
    private Date date ;
    private int id ;
    private int cost ;
    private String vehicles;

    public static ArrayList<TakeATrip> trips = new ArrayList<>();

    public TakeATrip(Terminal destination, Terminal beginning, Person driver, Date date, int id, int cost) {
        this.destination = destination;
        this.beginning = beginning;
        this.driver = driver;
        this.date = date;
        this.id = id;
        this.cost = cost;
    }

    //setters and getters
    public Terminal getDestination() {
        return destination;
    }
    public void setDestination(Terminal destination) {
        this.destination = destination;
    }
    public Terminal getBeginning() {
        return beginning;
    }
    public void setBeginning(Terminal beginning) {
        this.beginning = beginning;
    }
    public ArrayList<Person> getTravelers() {
        return travelers;
    }
    public void setTravelers(ArrayList<Person> travelers) {
        this.travelers = travelers;
    }
    public Person getDriver() {
        return driver;
    }
    public void setDriver(Person driver) {
        this.driver = driver;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public String getVehicles() {
        return vehicles;
    }
    public void setVehicles(String vehicles) {
        this.vehicles = vehicles;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }


    //methods

    @Override
    public int compareTo(Object o) {
        if (this.date.getYear() < ((TakeATrip)(o)).date.getYear()){
            return 1 ;
        }

        else if (this.date.getYear() > ((TakeATrip)(o)).date.getYear()){
            return -1;
        }

        else if (this.date.getYear() == ((TakeATrip)(o)).date.getYear()){
            if (this.date.getMount() < ((TakeATrip)(o)).date.getMount()){
                return 1;
            }

            else if (this.date.getMount() > ((TakeATrip)(o)).date.getMount()){
                return -1;
            }

            else if (this.date.getMount() == ((TakeATrip)(o)).date.getMount()){
                if (this.date.getDay() < ((TakeATrip)(o)).date.getDay()){
                    return 1;
                }

                else if (this.date.getDay() > ((TakeATrip)(o)).date.getDay()){
                    return -1;
                }

                else if (this.date.getDay() == ((TakeATrip)(o)).date.getDay()){
                    if (this.cost < ((TakeATrip)(o)).cost){
                        return 1 ;
                    }
                    return -1;
                }
            }
        }
        return 0 ;
    }
}

