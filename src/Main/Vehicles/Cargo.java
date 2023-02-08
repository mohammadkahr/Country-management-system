package Main.Vehicles;

import Main.Person;

final public class Cargo extends Aerial_Vehicle {
    //barbari
    private int Height;
    private int Band_length;
    private int wage;
    private Person capitan;

    public Cargo(String price, int capacity, int id, String company, int height, int band_length, int wage, Person capitan) {
        super(price, capacity, id, company);
        Height = height;
        Band_length = band_length;
        this.wage = wage;
        this.capitan = capitan;
    }

    //setters and getters
    public int getHeight() {
        return Height;
    }
    public void setHeight(int height) {
        Height = height;
    }
    public int getBand_length() {
        return Band_length;
    }
    public void setBand_length(int band_length) {
        Band_length = band_length;
    }
    public int getWage() {
        return wage;
    }
    public void setWage(int wage) {
        this.wage = wage;
    }
    public Person getCapitan() {
        return capitan;
    }
    public void setCapitan(Person capitan) {
        this.capitan = capitan;
    }
}
