package Main.Buildings;

final public class Room {

    private int n_beds;
    private int area;
    private int daily_cost;

    public Room( int n_beds, int area, int daily_cost) {

        this.n_beds = n_beds;
        this.area = area;
        this.daily_cost = daily_cost;
    }

    // getters and setters

    public int getN_beds() {
        return n_beds;
    }
    public void setN_beds(int n_beds) {
        this.n_beds = n_beds;
    }
    public int getArea() {
        return area;
    }
    public void setArea(int area) {
        this.area = area;
    }
    public int getDaily_cost() {
        return daily_cost;
    }
    public void setDaily_cost(int daily_cost) {
        this.daily_cost = daily_cost;
    }
}
