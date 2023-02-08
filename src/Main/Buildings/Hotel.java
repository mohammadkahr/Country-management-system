package Main.Buildings;

import java.util.ArrayList;
import java.util.PrimitiveIterator;

final public class Hotel {

    enum services {
        FOOD,TOWEL,
    }
    private String name;
    private int cost ;
    private String address;
    private int stars;
    private int n_rooms;
    private Room rooms;

    public Hotel(String name, int cost, String address, int stars, int n_rooms, Room rooms) {
        this.name = name;
        this.cost = cost;
        this.address = address;
        this.stars = stars;
        this.n_rooms = n_rooms;
        this.rooms = rooms;
    }

    //getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getStars() {
        return stars;
    }
    public void setStars(int stars) {
        this.stars = stars;
    }
    public int getN_rooms() {
        return n_rooms;
    }
    public void setN_rooms(int n_rooms) {
        this.n_rooms = n_rooms;
    }
    public Room getRooms() {
        return rooms;
    }
    public void setRooms(Room rooms) {
        this.rooms = rooms;
    }
}
