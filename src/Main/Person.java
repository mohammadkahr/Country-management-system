package Main;
public class Person {
    private String name ;
    private String last_name ;
    private String Year_of_birth ;
    private String place_of_birth ;
    private String gender ;
    private String job ;
    private String salary ;

    public Person(String name, String last_name, String year_of_birth, String place_of_birth, String gender, String job, String salary) {
        this.name = name;
        this.last_name = last_name;
        this.Year_of_birth = year_of_birth;
        this.place_of_birth = place_of_birth;
        this.gender = gender;
        this.job = job;
        this.salary = salary;
    }


    // getters
    public String getName() {
        return name;
    }
    public String getLast_name() {
        return last_name;
    }
    public String getYear_of_birth() {
        return Year_of_birth;
    }
    public String getPlace_of_birth() {
        return place_of_birth;
    }
    public String getGender() {
        return gender;
    }
    public String getJob() {
        return job;
    }
    public String getSalary() {
        return salary;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public void setYear_of_birth(String year_of_birth) {
        Year_of_birth = year_of_birth;
    }
    public void setPlace_of_birth(String place_of_birth) {
        this.place_of_birth = place_of_birth;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public void setSalary(String salary) {
        this.salary = salary;
    }

    //Methods




}
