package Main.Vehicles;

public abstract class Marine_Vehicle {

    private String price;
    private int capacity;
    private int id;
    private String company;

    public Marine_Vehicle(String price, int capacity, int id, String company) {
        this.price = price;
        this.capacity = capacity;
        this.id = id;
        this.company = company;
    }

    // setters and getters
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
