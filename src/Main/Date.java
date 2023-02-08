package Main;

public class Date {
    private int year ;
    private int mount ;
    private int day ;

    public Date(int year, int mount, int day) {
        this.year = year;
        this.mount = mount;
        this.day = day;
    }

    //getters and setters
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getMount() {
        return mount;
    }
    public void setMount(int mount) {
        this.mount = mount;
    }
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }

    // methods


    @Override
    public String toString() {
        return year + "/" + mount + "/" + day ;
    }
}


