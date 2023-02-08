package Main.Vehicles;

import Main.Person;

public abstract class Ground_Vehicle {
    private String price;
    private int capacity;
    private int id;
    private String company;
    private Person driver;

    public Ground_Vehicle(String price, int capacity, int id, String company, Person driver) {
        this.price = price;
        this.capacity = capacity;
        this.id = id;
        this.company = company;
        this.driver = driver;
    }

    // getters and setters
    public Person getDriver() {
        return driver;
    }
    public void setDriver(Person driver) {
        this.driver = driver;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
}
