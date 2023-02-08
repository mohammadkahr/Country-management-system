package Main.Vehicles;


import Main.Person;

final public class Train extends Ground_Vehicle{

    enum services{
        RESTAURANT,MOSQUE,CAFE,CINEMA;
    }
    private int stars;
    private services [] service ;

    public Train(String price, int capacity, int id, String company, Person driver, int stars, services[] service) {
        super(price, capacity, id, company, driver);
        this.stars = stars;
        this.service = service;
    }

    // getters and setters
    public int getStars() {
        return stars;
    }
    public void setStars(int stars) {
        this.stars = stars;
    }
    public services[] getService() {
        return service;
    }
    public void setService(services[] service) {
        this.service = service;
    }

}
