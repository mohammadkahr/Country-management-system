package Main.Vehicles;

import Main.Person;

final public class Passenger extends Aerial_Vehicle{
    private int Height;
    private int Band_length;
    private int aircrew ;
    private Person capitan;
    private int clas;

    public Passenger(String price, int capacity, int id, String company, int height, int band_length, int aircrew, Person capitan, int clas) {
        super(price, capacity, id, company);
        Height = height;
        Band_length = band_length;
        this.aircrew = aircrew;
        this.capitan = capitan;
        this.clas = clas;
    }

    //getters and setters
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
    public int getAircrew() {
        return aircrew;
    }
    public void setAircrew(int aircrew) {
        this.aircrew = aircrew;
    }
    public Person getCapitan() {
        return capitan;
    }
    public void setCapitan(Person capitan) {
        this.capitan = capitan;
    }
    public int getClas() {
        return clas;
    }
    public void setClas(int clas) {
        this.clas = clas;
    }
}
