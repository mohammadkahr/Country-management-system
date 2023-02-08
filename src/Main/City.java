package Main;
import Main.Buildings.*;
import Main.Trip.TakeATrip;
import Main.Vehicles.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;


public class City {
    static Scanner input = new Scanner(System.in);

    private String name;
    private int money ;
    private ArrayList<Person> people = new ArrayList<>();
    private ArrayList<Hotel> hotels = new ArrayList<>();
    private ArrayList<Terminals> terminals = new ArrayList<>();
    private ArrayList<Airport> airports = new ArrayList<>();
    private ArrayList<Railroad> railroads = new ArrayList<>();
    private ArrayList<Harbour> harbours = new ArrayList<>();
    private ArrayList<Passenger> passengers = new ArrayList<>();
    private ArrayList<Cargo> cargos = new ArrayList<>();
    private ArrayList<Bus> buses = new ArrayList<>();
    private ArrayList<Train> trains = new ArrayList<>();
    private ArrayList<Ship> ships = new ArrayList<>();
    private ArrayList<Boat> boats = new ArrayList<>();
    private ArrayList<Terminal> terminal = new ArrayList<>();
    private ArrayList<Bank> banks = new ArrayList<>();


    public City(String name, int money) {
        this.name = name;
        this.money = money;
    }

    //setters and getters
    public static Scanner getInput() {
        return input;
    }
    public static void setInput(Scanner input) {
        City.input = input;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }
    public ArrayList<Person> getPeople() {
        return people;
    }
    public void setPeople(ArrayList<Person> people) {
        this.people = people;
    }
    public ArrayList<Hotel> getHotels() {
        return hotels;
    }
    public void setHotels(ArrayList<Hotel> hotels) {
        this.hotels = hotels;
    }
    public ArrayList<Terminals> getTerminals() {
        return terminals;
    }
    public void setTerminals(ArrayList<Terminals> terminals) {
        this.terminals = terminals;
    }
    public ArrayList<Airport> getAirports() {
        return airports;
    }
    public void setAirports(ArrayList<Airport> airports) {
        this.airports = airports;
    }
    public ArrayList<Railroad> getRailroads() {
        return railroads;
    }
    public void setRailroads(ArrayList<Railroad> railroads) {
        this.railroads = railroads;
    }
    public ArrayList<Harbour> getHarbours() {
        return harbours;
    }
    public void setHarbours(ArrayList<Harbour> harbours) {
        this.harbours = harbours;
    }
    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }
    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }
    public ArrayList<Cargo> getCargos() {
        return cargos;
    }
    public void setCargos(ArrayList<Cargo> cargos) {
        this.cargos = cargos;
    }
    public ArrayList<Bus> getBuses() {
        return buses;
    }
    public void setBuses(ArrayList<Bus> buses) {
        this.buses = buses;
    }
    public ArrayList<Train> getTrains() {
        return trains;
    }
    public void setTrains(ArrayList<Train> trains) {
        this.trains = trains;
    }
    public ArrayList<Ship> getShips() {
        return ships;
    }
    public void setShips(ArrayList<Ship> ships) {
        this.ships = ships;
    }
    public ArrayList<Boat> getBoats() {
        return boats;
    }
    public void setBoats(ArrayList<Boat> boats) {
        this.boats = boats;
    }
    public ArrayList<Terminal> getTerminal() {
        return terminal;
    }
    public void setTerminal(ArrayList<Terminal> terminal) {
        this.terminal = terminal;
    }
    public ArrayList<Bank> getBanks() {
        return banks;
    }
    public void setBanks(ArrayList<Bank> banks) {
        this.banks = banks;
    }

    // methods
    static void add_person_ready(City city){
        Person person1 = new Person("ali","shams","1990","ESF","man","pilot","1500");
        Person person2 = new Person("reza","adel","1978","TEH","man","driver","900");
        Person person3 = new Person("shawn","mendes","1998","canadian","man","locomotive driver","1200");
        Person person4 = new Person("selena","gomez","1995","NY","woman","sailor","1300");
        Person person5 = new Person("mahdi","mahdian","2000","ESF","man","crew","200");
        Person person6 = new Person("Billie","Eilish","1989","atalanta","woman","pilot","1900");
        Person person7 = new Person("Aria","stark","1975","england","woman","sailor","1200");
        Person person8 = new Person("jan","snow","1984","shiraz","man","driver","1100");
        Person person9 = new Person("Ed","sheeran","1991","tokyo","man","locomotive driver","1220");



        city.getPeople().add(person6);
        city.getPeople().add(person7);
        city.getPeople().add(person8);
        city.getPeople().add(person1);
        city.getPeople().add(person2);
        city.getPeople().add(person3);
        city.getPeople().add(person4);
        city.getPeople().add(person5);
        city.getPeople().add(person9);
        System.out.println("registered");
    }
    static void add_person(City city) throws IndexOutOfBoundsException {
        System.out.println("enter name ");
        System.out.println("enter last name ");
        System.out.println("enter year of birth ");
        System.out.println("enter place of birth");
        System.out.println("enter gender");
        System.out.println("enter job");
        System.out.println("enter salary");
        Person person =new Person(input.next(),input.next(),input.next(),input.next(),input.next(),input.next(),input.next());
        city.getPeople().add(person);
        System.out.println("registered");
    }
    static void list_persons(City city){
        if (city.getPeople().size() > 0) {
            for (int i = 0; i < city.getPeople().size(); i++) {
                System.out.println("\n" + (i + 1) + "...");
                System.out.println("Name : " + city.getPeople().get(i).getName());
                System.out.println("Last name : " + city.getPeople().get(i).getLast_name());
                System.out.println("Year of birth : " + city.getPeople().get(i).getYear_of_birth());
                System.out.println("Place of birth : " + city.getPeople().get(i).getPlace_of_birth());
                System.out.println("Gender : " + city.getPeople().get(i).getGender());
                System.out.println("Job : " + city.getPeople().get(i).getJob());
                System.out.println("Salary : " + city.getPeople().get(i).getSalary());

            }
            //System.out.println("\nEnd");
        }
        else
            System.out.println("No one lives in this city!");
    }

    static int build_a_hotel(City city) throws IOException,IndexOutOfBoundsException {
        System.out.println("The cost of building the hotel is 10,000 $");
        if (city.money >= 10000){
            System.out.println("enter number of beds : ");
            System.out.println("enter area : ");
            System.out.println("enter daily cost : ");
            Room room = new Room(input.nextInt(),input.nextInt(),input.nextInt());
            System.out.println("enter name ");
            System.out.println("enter address");
            System.out.println("enter stars ");
            System.out.println("enter number of rooms ");
            Hotel hotel1 =new Hotel(input.next(),10000,input.next(),input.nextInt(),input.nextInt(), room);


            city.getHotels().add(hotel1);
            System.out.println("registered");
            city.money = city.money - 10000;
            return city.money;
        }
        else {
            System.out.println("your money isn't enough!");
        }

        return city.money;
    }
    static void list_hotels(City city){
        if (city.getHotels().size() > 0 ) {
            for (int i = 0; i < city.getHotels().size(); i++) {
                System.out.println("\n" + (i + 1) + "...");
                System.out.println("Name : " + city.getHotels().get(i).getName());
                System.out.println("Cost : " + city.getHotels().get(i).getCost());
                System.out.println("Address : " + city.getHotels().get(i).getAddress());
                System.out.println("number of stars : " + city.getHotels().get(i).getStars());
                System.out.println("number of rooms : " + city.getHotels().get(i).getRooms().getN_beds());


            }
            //System.out.println("End");
        }
        else
            System.out.println("This city haven't any hotel");


    }

    static int build_Airport(City city) throws IndexOutOfBoundsException {
        System.out.println("The cost of building the Airport is 10,000 $");
        if (city.money >= 10000){
            System.out.println("enter name ");
            System.out.println("enter address");
            System.out.println("enter area ");
            System.out.println("enter number of bands ");
            Airport airport = new Airport(10000, city.name, input.next(), input.next(), input.nextInt(),
                    "airport",null,input.nextInt());
            //Airport airport = new Airport(10000,city.name,input.next(), input.next(),input.nextInt(),null,input.nextInt() );

            System.out.println("international or not?\n1.yes\n2.no");
            short a = input.nextShort();
            if (a==1) airport.setType("Internationale");
            if (a==2) airport.setType("Internal");

            Terminal terminal = new Terminal(10000, city.name, airport.getN_terminal(), airport.getAddress() ,airport.getExtent() , "airport");
            city.terminal.add(terminal) ;
            city.getAirports().add(airport);
            System.out.println("registered");
            city.money = city.money - 10000;
            return city.money;
        }
        else {
            System.out.println("your money isn't enough!");
        }

        return city.money;
    }
    static int buy_airplane_cargo(City city) throws IndexOutOfBoundsException {
        System.out.println("The cost of buy a airplane is 5,000 $");
        if (city.money >= 5000){
            System.out.println("enter capacity(wage)");
            System.out.println("enter name of company");
            System.out.println("enter maximum of height ");
            System.out.println("enter maximum band length ");
            System.out.println("enter wage of airplane");
            int id = city.getCargos().size();
            id = id + 1500;
            Cargo cargo = new Cargo("5000", input.nextInt(), id, input.next(), input.nextInt(), input.nextInt(), input.nextInt(), null);
            int counter1 = 1;
            for (Person person : city.people) {
                if (Objects.equals(person.getJob(), "pilot")) {
                    System.out.println("\n" + counter1 + "...");
                    System.out.println("Name : " + person.getName());
                    System.out.println("Last name : " + person.getLast_name());
                    System.out.println("Year of birth : " + person.getYear_of_birth());
                    System.out.println("Place of birth : " + person.getPlace_of_birth());
                    System.out.println("Gender : " + person.getGender());
                    System.out.println("Salary : " + person.getSalary());
                    counter1++;
                }
            }
            System.out.println("enter number of pilot to employment");
            short counter2 = input.nextShort();
            counter1 = 1;

            for (Person person : city.people) {
                if (Objects.equals(person.getJob(), "pilot")) {
                    if (counter1 == counter2) {
                        cargo.setCapitan(person);
                        boolean res = deletePerson(city,person);
                        if (res){
                            System.out.println("Ok");
                        }
                        break;
                    }
                    counter1++;
                }
            }

            city.getCargos().add(cargo);

            System.out.println("registered");
            city.money= city.money - 5000;
            return city.money;
        }
        else {
            System.out.println("your money isn't enough!");
        }

        return city.money;
    }
    static int buy_airplane_passenger(City city) throws IndexOutOfBoundsException {
        System.out.println("The cost of buy a airplane is 7,000 $");
        if (city.money >= 7000){
            System.out.println("enter number of seat");
            System.out.println("enter name of company");
            System.out.println("enter maximum of height ");
            System.out.println("enter maximum band length ");
            System.out.println("enter number of aircrew");
            int id = city.getPassengers().size();
            id = id + 1000;
            Passenger passenger = new Passenger("7000", input.nextInt(), id, input.next(), input.nextInt(), input.nextInt(), input.nextInt(), null,0);
            int counter1 = 1;
            for (Person person : city.people) {
                if (Objects.equals(person.getJob(), "pilot")) {
                    System.out.println("\n" + counter1 + "...");
                    System.out.println("Name : " + person.getName());
                    System.out.println("Last name : " + person.getLast_name());
                    System.out.println("Year of birth : " + person.getYear_of_birth());
                    System.out.println("Place of birth : " + person.getPlace_of_birth());
                    System.out.println("Gender : " + person.getGender());
                    System.out.println("Salary : " + person.getSalary());
                    counter1++;
                }
            }
            System.out.println("enter number of pilot to employment");
            short counter2 = input.nextShort();
            counter1 = 1;

            for (Person person : city.people) {
                if (Objects.equals(person.getJob(), "pilot")) {
                    if (counter1 == counter2) {
                        passenger.setCapitan(person);
                        boolean res = deletePerson(city,person);
                        if (res){
                            System.out.println("Ok");
                        }
                        break;
                    }
                    counter1++;
                }
            }

            System.out.println("Enter name of terminal to add airplane");
            counter1 = 1;
            for (int i = 0; i < city.getAirports().size(); i++) {
                System.out.println((counter1)+"." + city.getAirports().get(i).getN_terminal());
            }
            counter2 = input.nextShort();
            counter2--;

            for (int i = 0; i < city.getAirports().size(); i++) {
                if (i == counter2){
                    city.getAirports().get(i).getPassengers().add(passenger);
                }
            }


            city.getPassengers().add(passenger);
            System.out.println("Id : " + id);
            System.out.println("registered");
            city.money = city.money - 7000;
            return city.money;
        }
        else {
            System.out.println("your money isn't enough!");
        }

        return city.money;
    }
    static void list_of_airplanes_car(City city){
        for (int i = 0; i < city.getCargos().size(); i++) {
            System.out.println("\n" + (i+1) + "..." );
            System.out.println("Id : " + city.getCargos().get(i).getId());
            System.out.println("Cost : " + city.getCargos().get(i).getPrice());
            System.out.println("Name of company : " + city.getCargos().get(i).getCompany());
            System.out.println("Band length  : "+city.getCargos().get(i).getBand_length());
            System.out.println("Wage : " + city.getCargos().get(i).getWage());
            System.out.println("Name of capitan : "+city.getCargos().get(i).getCapitan().getName()+" "+ city.getCargos().get(i).getCapitan().getLast_name());
        }
        System.out.println("End");
    }
    static void list_of_airplanes_pass(City city){
        for (int i = 0; i < city.getPassengers().size(); i++) {
            System.out.println("\n" + (i+1) + "..." );
            System.out.println("Id : " + city.getPassengers().get(i).getId());
            System.out.println("Cost : " + city.getPassengers().get(i).getPrice());
            System.out.println("Number of seats : "+ city.getPassengers().get(i).getCapacity());
            System.out.println("Name of company : " + city.getPassengers().get(i).getCompany());
            System.out.println("Name of capitan : "+city.getPassengers().get(i).getCapitan().getName()+" "+city.getPassengers().get(i).getCapitan().getLast_name());
        }
        System.out.println("End");


    }
    static void list_of_airports(City city){
        if (city.getAirports().size() > 0) {
            for (int i = 0; i < city.getAirports().size(); i++) {
                System.out.println("\n" + (i + 1) + "...");
                System.out.println("Name : " + city.getAirports().get(i).getN_terminal());
                System.out.println("Name of city: " + city.getAirports().get(i).getN_city());
                System.out.println("Address : " + city.getAirports().get(i).getAddress());
                System.out.println("Cost : " + city.getAirports().get(i).getCost());
                System.out.println("Class : " + city.getAirports().get(i).getType());

            }
            //System.out.println("End");
        }
        else
            System.out.println("This city haven't any airport");
    }

    static int build_terminal_bus(City city) throws IndexOutOfBoundsException {
        System.out.println("The cost of building the Terminal is 5,000 $");
        if (city.money >= 5000){
            System.out.println("enter name ");
            System.out.println("enter address");
            System.out.println("enter area ");

            Terminals terminal_bus = new Terminals(5000, city.name, input.next(), input.next(), input.nextInt(),"bus");
            //Terminals terminal_bus = new Terminals(5000, city.name, input.next(),input.next(), input.nextInt());

            Terminal terminal = new Terminal(5000, city.name, terminal_bus.getN_terminal(), terminal_bus.getAddress() ,terminal_bus.getExtent(),"bus");

            city.terminal.add(terminal) ;

            city.getTerminals().add(terminal_bus);
            System.out.println("registered");
            city.money = city.money - 5000;
            return city.money;
        }
        else {
            System.out.println("your money isn't enough!");
        }
        return city.money;
    }
    static int buy_bus(City city) throws IndexOutOfBoundsException {
        System.out.println("The cost of buy a bus is 2,000 $");
        if (city.money >= 2000){
            System.out.println("enter number of seat");
            System.out.println("enter name of company");

            int id = city.getBuses().size();
            id = id + 2001;
            Bus bus = new Bus("2000", input.nextInt(),id, input.next(),null );
            int counter1 = 1;
            for (Person person : city.people) {
                if (Objects.equals(person.getJob(), "driver")) {
                    System.out.println("\n" + counter1 + "...");
                    System.out.println("Name : " + person.getName());
                    System.out.println("Last name : " + person.getLast_name());
                    System.out.println("Year of birth : " + person.getYear_of_birth());
                    System.out.println("Place of birth : " + person.getPlace_of_birth());
                    System.out.println("Gender : " + person.getGender());
                    System.out.println("Salary : " + person.getSalary());
                    counter1++;
                }
            }
            System.out.println("enter number of driver to employment");
            short counter2 = input.nextShort();
            counter1 = 1;
            for (Person person : city.people) {
                if (Objects.equals(person.getJob(), "driver")) {
                    if (counter1 == counter2) {
                        bus.setDriver(person);
                        boolean res = deletePerson(city,person);
                        if (res){
                            System.out.println("Ok");
                        }
                        break;
                    }
                    counter1++;
                }
            }

            counter1 = 1;
            for (int i = 0; i < city.getTerminals().size(); i++) {
                System.out.println((counter1) + "."+city.getTerminals().get(i).getN_terminal());
            }
            System.out.println("enter number of terminal to add bus");
            counter2 = input.nextShort();
            counter2--;
            for (int i = 0; i < city.getTerminals().size(); i++) {
                if (i == counter2){
                    city.getTerminals().get(i).getBuses().add(bus);
                }
            }



            city.getBuses().add(bus);
            System.out.println("Id : " + id);
            System.out.println("registered");

            city.money = city.money - 2000;
            return city.money;
        }
        else {
            System.out.println("your money isn't enough!");
        }

        return city.money;
    }
    static void list_of_buses(City city){
        for (int i = 0; i < city.getBuses().size(); i++) {
            System.out.println("\n" + (i+1) + "..." );
            System.out.println("Id : " + city.getBuses().get(i).getId());
            System.out.println("Cost : " + city.getBuses().get(i).getPrice());
            System.out.println("Number of seats : "+ city.getBuses().get(i).getCapacity());
            System.out.println("Name of company : " + city.getBuses().get(i).getCompany());
            System.out.println("driver : " +city.getBuses().get(i).getDriver().getName()+" "+city.getBuses().get(i).getDriver().getLast_name());
        }
        System.out.println("End");


    }
    static void list_terminal(City city){
        if (city.getTerminals().size() > 0) {
            for (int i = 0; i < city.getTerminals().size(); i++) {
                System.out.println("\n" + (i + 1) + "...");
                System.out.println("Name : " + city.getTerminals().get(i).getN_terminal());
                System.out.println("Name of city: " + city.getTerminals().get(i).getN_city());
                System.out.println("Address : " + city.getTerminals().get(i).getAddress());
                System.out.println("Cost : " + city.getTerminals().get(i).getCost());
                System.out.println("Area : " + city.getTerminals().get(i).getExtent());

            }
            //System.out.println("End");
        }
        else
            System.out.println("This city haven't any terminal");
    }

    static int build_harbour(City city) throws IndexOutOfBoundsException {
        System.out.println("The cost of building the Harbour is 8,000 $");
        if (city.money >= 8000){

            System.out.println("enter name ");
            System.out.println("enter address");
            System.out.println("enter area ");
            System.out.println("enter number of dock ");

            Harbour harbour = new Harbour(8000, city.name, input.next(), input.next(), input.nextInt(),"harbour",input.nextInt());

            Terminal terminal = new Terminal(8000, city.name, harbour.getN_terminal(), harbour.getAddress() ,harbour.getExtent(),"harbour");
            city.terminal.add(terminal) ;

            city.getHarbours().add(harbour);
            System.out.println("registered");
            city.money = city.money - 8000;
            return city.money;
        }

        else {
            System.out.println("your money isn't enough!");
        }

        return city.money;

    }
    static int buy_ship(City city) throws IndexOutOfBoundsException {
        System.out.println("The cost of buy a ship is 20,000 $");
        if (city.money >= 20000){
            System.out.println("enter number of seat");
            System.out.println("enter name of company");
            System.out.println("enter name of fuel consumed");
            System.out.println("enter minimum required depth");// hadaghal omgh mored niaz
            System.out.println("enter number of restaurant ");
            System.out.println("enter number of rooms ");
            int id = city.getShips().size();
            id = id + 3000;
            Ship ship = new Ship("20000", input.nextInt(),id, input.next(), input.next(), input.nextInt(), input.nextInt(), input.nextInt(),null);
            int counter1 = 1;
            for (Person person : city.people) {
                if (Objects.equals(person.getJob(), "sailor")) {
                    System.out.println("\n" + counter1 + "...");
                    System.out.println("Name : " + person.getName());
                    System.out.println("Last name : " + person.getLast_name());
                    System.out.println("Year of birth : " + person.getYear_of_birth());
                    System.out.println("Place of birth : " + person.getPlace_of_birth());
                    System.out.println("Gender : " + person.getGender());
                    System.out.println("Salary : " + person.getSalary());
                    counter1++;
                }
            }
            System.out.println("enter number of sailor to employment");
            short counter2 = input.nextShort();
            counter1 = 1;

            for (Person person : city.people) {
                if (Objects.equals(person.getJob(), "sailor")) {
                    if (counter1 == counter2) {
                        ship.setSailor(person);
                        boolean res = deletePerson(city,person);
                        if (res){
                            System.out.println("Ok");
                        }
                        break;
                    }
                    counter1++;
                }
            }
            city.getShips().add(ship);
            System.out.println("registered");
            city.money = city.money - 20000;
            return city.money;
        }
        else {
            System.out.println("your money isn't enough!");
        }
        return city.money;
    }
    static int buy_boat(City city) throws IndexOutOfBoundsException {
        System.out.println("The cost of buy a boat is 4,000 $");
        if (city.money >= 4000){
            System.out.println("enter number of seat");
            System.out.println("enter name of company");
            System.out.println("enter name of fuel consumed");
            System.out.println("enter minimum required depth");// hadaghal omgh mored niaz

            int id = city.getShips().size();
            id = id + 3500;
            Boat boat = new Boat("4000", input.nextInt(),id, input.next(), input.next(), input.nextInt(),null);
            int counter1 = 1;
            for (Person person : city.people) {
                if (Objects.equals(person.getJob(), "sailor")) {
                    System.out.println("\n" + counter1 + "...");
                    System.out.println("Name : " + person.getName());
                    System.out.println("Last name : " + person.getLast_name());
                    System.out.println("Year of birth : " + person.getYear_of_birth());
                    System.out.println("Place of birth : " + person.getPlace_of_birth());
                    System.out.println("Gender : " + person.getGender());
                    System.out.println("Salary : " + person.getSalary());
                    counter1++;
                }
            }
            System.out.println("enter number of sailor to employment");
            short counter2 = input.nextShort();
            counter1 = 1;

            for (Person person : city.people) {
                if (Objects.equals(person.getJob(), "sailor")) {
                    if (counter1 == counter2) {
                        boat.setSailor(person);
                        boolean res = deletePerson(city,person);
                        if (res){
                            System.out.println("Ok");
                        }
                        break;
                    }
                    counter1++;
                }
            }
            city.getBoats().add(boat);
            System.out.println("registered");
            city.money = city.money - 4000;
            return city.money;
        }
        else {
            System.out.println("your money isn't enough!");
        }
        return city.money;
    }
    static void list_boat(City city){
        for (int i = 0; i < city.getBoats().size(); i++) {
            System.out.println("\n" + (i+1) + "..." );
            System.out.println("Id : " + city.getBoats().get(i).getId());
            System.out.println("Cost : " + city.getBoats().get(i).getPrice());
            System.out.println("Number of seats : "+city.getBoats().get(i).getCapacity());
            System.out.println("Name of company : " + city.getBoats().get(i).getCompany());
            System.out.println("fuel : " + city.getBoats().get(i).getFuel());
            System.out.println("minimum required depth : " + city.getBoats().get(i).getMinimum_depth());
            System.out.println("Name of capitan : "+city.getBoats().get(i).getSailor().getName()+" "+city.getBoats().get(i).getSailor().getLast_name());
        }
        System.out.println("End");

    }
    static void list_ship(City city){
        for (int i = 0; i < city.getShips().size(); i++) {
            System.out.println("\n" + (i+1) + "..." );
            System.out.println("Id : " + city.getShips().get(i).getId());
            System.out.println("Cost : " + city.getShips().get(i).getPrice());
            System.out.println("Number of seats : "+city.getShips().get(i).getCapacity());
            System.out.println("Name of company : " + city.getShips().get(i).getCompany());
            System.out.println("fuel : " + city.getShips().get(i).getFuel());
            System.out.println("number of rooms : "+city.getShips().get(i).getN_rooms());
            System.out.println("Number of restaurant : "+city.getShips().get(i).getN_restaurant());
            System.out.println("minimum required depth : " + city.getShips().get(i).getMinimum_depth());
            System.out.println("Name of capitan : "+city.getShips().get(i).getSailor().getName()+" "+city.getShips().get(i).getSailor().getLast_name());
        }
        System.out.println("End");

    }
    static void list_harbour(City city){
        if (city.getHarbours().size() > 0) {
            for (int i = 0; i < city.getHarbours().size(); i++) {
                System.out.println("\n" + (i + 1) + "...");
                System.out.println("Name : " + city.getHarbours().get(i).getN_terminal());
                System.out.println("Name of city: " + city.getHarbours().get(i).getN_city());
                System.out.println("Address : " + city.getHarbours().get(i).getAddress());
                System.out.println("Cost : " + city.getHarbours().get(i).getCost());
                System.out.println("Number of docks : " + city.getHarbours().get(i).getN_dock());
                System.out.println("Area : " + city.getHarbours().get(i).getExtent());
            }
            //System.out.println("End");
        }
        else
            System.out.println("This city haven't any harbour");


    }

    static int build_railroad(City city) throws IndexOutOfBoundsException {
        System.out.println("The cost of building the railroad is 6,000 $");
        if (city.money >= 6000){
            System.out.println("enter name ");
            System.out.println("enter address");
            System.out.println("enter area ");
            System.out.println("enter number of rail (in)");
            System.out.println("enter number of rail (out)");

            Railroad railroad = new Railroad(6000, city.name, input.next(), input.next(), input.nextInt(),"railroad",input.nextInt(),input.nextInt());
            //Railroad railroad = new Railroad(6000, city.name, input.next(), input.next(), input.nextInt(), null,null, input.nextInt(), input.nextInt());
            city.getRailroads().add(railroad);
            Terminal terminal = new Terminal(6000, city.name, railroad.getN_terminal(), railroad.getAddress(), railroad.getExtent(), railroad.getKind());
            city.getTerminal().add(terminal);

            System.out.println("registered");
            city.money = city.money - 6000;
            return city.money;
        }
        else {
            System.out.println("your money isn't enough!");
        }
        return city.money ;

    }
    static int buy_train(City city) throws IndexOutOfBoundsException {
        System.out.println("The cost of buy a train is 3,000 $");
        if (city.money >= 3000){
            System.out.println("enter number of seat");
            System.out.println("enter name of company");
            System.out.println("enter number of stars ");


            int id = city.getTrains().size();
            id = id + 4000;
            Train train = new Train("3000", input.nextInt(),id, input.next(), null , input.nextInt(), null);
            int counter1 = 1;
            for (Person person : city.people) {
                if (Objects.equals(person.getJob(), "locomotive driver")) {
                    System.out.println("\n" + counter1 + "...");
                    System.out.println("Name : " + person.getName());
                    System.out.println("Last name : " + person.getLast_name());
                    System.out.println("Year of birth : " + person.getYear_of_birth());
                    System.out.println("Place of birth : " + person.getPlace_of_birth());
                    System.out.println("Gender : " + person.getGender());
                    System.out.println("Salary : " + person.getSalary());
                    counter1++;
                }
            }
            System.out.println("enter number of locomotive driver to employment");
            short counter2 = input.nextShort();
            counter1 = 1;

            for (Person person : city.people) {
                if (Objects.equals(person.getJob(), "locomotive driver")) {
                    if (counter1 == counter2) {
                        train.setDriver(person);
                        boolean res = deletePerson(city,person);
                        if (res){
                            System.out.println("Ok");
                        }
                        break;
                    }
                    counter1++;
                }
            }

            city.getTrains().add(train);
            System.out.println("registered");
            city.money = city.money - 3000;
            return city.money;
        }
        else {
            System.out.println("your money isn't enough!");
        }
        return city.money;
    }
    static void list_trains(City city){
        try {
            for (int i = 0; i < city.getTrains().size(); i++) {
                System.out.println("\n" + (i + 1) + "...");
                System.out.println("Id : " + city.getTrains().get(i).getId());
                System.out.println("Cost : " + city.getTrains().get(i).getPrice());
                System.out.println("Number of seats : " + city.getTrains().get(i).getCapacity());
                System.out.println("Name of company : " + city.getTrains().get(i).getCompany());
                System.out.println("number of stars : " + city.getTrains().get(i).getStars());
                System.out.println("Name of capitan : " + city.getTrains().get(i).getDriver().getName() + " " + city.getTrains().get(i).getDriver().getLast_name());
            }
            System.out.println("End");
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
    static void list_railroad(City city){
        try {
            if (city.getRailroads().size() > 0) {
                for (int i = 0; i < city.getRailroads().size(); i++) {
                    System.out.println("\n" + (i + 1) + "...");
                    System.out.println("Name : " + city.getRailroads().get(i).getN_terminal());
                    System.out.println("Name of city: " + city.getRailroads().get(i).getN_city());
                    System.out.println("Address : " + city.getRailroads().get(i).getAddress());
                    System.out.println("Cost : " + city.getRailroads().get(i).getCost());
                    System.out.println("Area : " + city.getRailroads().get(i).getExtent());
                    System.out.println("Number of rail(in) : " + city.getRailroads().get(i).getN_in_rail());
                    System.out.println("Number of rail(out) : " + city.getRailroads().get(i).getN_out_rail());
                }

            } else
                System.out.println("This city haven't any railroad");
        }
        catch (Exception ex){
            ex.printStackTrace();
        }

    }

    public static void menu (City city)  {
        try {
            short select;
            System.out.println("your city's name is : " + city.name);
            System.out.println("you have " + city.money + "$");
            while (true) {
                System.out.println("\nwhat do you want to do?");
                System.out.println("1.Hotel(s)");
                System.out.println("2.Airport(s)");
                System.out.println("3.Harbour(s)");
                System.out.println("4.Terminal(s)");
                System.out.println("5.Railroad(s)");
                System.out.println("6.People");
                System.out.println("7.Trip");
                System.out.println("8.Bank");
                System.out.println("9.back");
                System.out.println("99.Details");

                select = input.nextShort();

                if (select == 1) {
                    while (true) {
                        System.out.println("\nwhat do you want to do?");
                        System.out.println("1.Build a hotel");
                        System.out.println("2.List of hotel(s)");
                        System.out.println("9.Back");
                        select = input.nextShort();
                        if (select == 1) {
                            city.money = build_a_hotel(city);
                            System.out.println("The rest of your money is : " + city.money);
                        } else if (select == 2) {
                            list_hotels(city);
                        } else if (select == 9) {
                            break;
                        }
                    }

                }//hotel
                else if (select == 2) {
                    while (true) {
                        System.out.println("\nwhat do you want to do?");
                        System.out.println("1.Build an airport");
                        System.out.println("2.Buy a passenger airplane");
                        System.out.println("3.Buy a cargo airplane");
                        System.out.println("4.List of airplane(s)(passenger)");
                        System.out.println("5.List of airplane(s)(cargo)");
                        System.out.println("6.List of airport(s)");
                        System.out.println("9.Back");
                        select = input.nextShort();
                        if (select == 1) {
                            city.money = build_Airport(city);
                            System.out.println("The rest of your money is : " + city.money);
                        } else if (select == 2) {
                            city.money = buy_airplane_passenger(city);
                            System.out.println("The rest of your money is : " + city.money);
                        } else if (select == 3) {
                            city.money = buy_airplane_cargo(city);
                            System.out.println("The rest of your money is : " + city.money);
                        } else if (select == 4) {
                            list_of_airplanes_pass(city);
                        } else if (select == 5) {
                            list_of_airplanes_car(city);
                        } else if (select == 6) {
                            list_of_airports(city);
                        } else if (select == 9) {
                            break;
                        }
                    }
                }//airport
                else if (select == 3) {
                    while (true) {
                        System.out.println("\nwhat do you want to do?");
                        System.out.println("1.Build a harbour");
                        System.out.println("2.Buy a ship");
                        System.out.println("3.Buy a boat");
                        System.out.println("4.List of harbour(s)");
                        System.out.println("5.List of ship(s)");
                        System.out.println("6.List of boat(s)");
                        System.out.println("9.Back");
                        select = input.nextShort();
                        if (select == 1) {
                            city.money = build_harbour(city);
                            System.out.println("The rest of your money is : " + city.money);
                        } else if (select == 2) {
                            city.money = buy_ship(city);
                            System.out.println("The rest of your money is : " + city.money);
                        } else if (select == 3) {
                            city.money = buy_boat(city);
                            System.out.println("The rest of your money is : " + city.money);
                        } else if (select == 4) {
                            list_harbour(city);
                        } else if (select == 5) {
                            list_ship(city);
                        } else if (select == 6) {
                            list_boat(city);
                        } else if (select == 9) {
                            break;
                        }
                    }
                }//harbour
                else if (select == 4) {
                    while (true) {
                        System.out.println("\nwhat do you want to do?");
                        System.out.println("1.Build a terminal");
                        System.out.println("2.Buy a bus");
                        System.out.println("3.List of terminals");
                        System.out.println("4.List of bus(es)");
                        System.out.println("9.Back");
                        select = input.nextShort();
                        if (select == 1) {
                            city.money = build_terminal_bus(city);
                            System.out.println("The rest of your money is : " + city.money);
                        } else if (select == 2) {
                            city.money = buy_bus(city);
                            System.out.println("The rest of your money is : " + city.money);
                        } else if (select == 3) {
                            list_terminal(city);
                        } else if (select == 4) {
                            list_of_buses(city);
                        } else if (select == 9) {
                            break;
                        }
                    }

                }//terminal
                else if (select == 5) {
                    while (true) {
                        System.out.println("\nwhat do you want to do?");
                        System.out.println("1.Build a railroad");
                        System.out.println("2.Buy a train");
                        System.out.println("3.List of railroad(s)");
                        System.out.println("4.List of train(s)");
                        System.out.println("9.Back");
                        select = input.nextShort();
                        if (select == 1) {
                            city.money = build_railroad(city);
                            System.out.println("The rest of your money is : " + city.money);
                        } else if (select == 2) {
                            city.money = buy_train(city);
                            System.out.println("The rest of your money is : " + city.money);
                        } else if (select == 3) {
                            list_railroad(city);
                        } else if (select == 4) {
                            list_trains(city);
                        } else if (select == 9) {
                            break;
                        }
                    }
                }//railroad
                else if (select == 6) {
                    while (true) {
                        System.out.println("\nwhat do you want to do?");
                        System.out.println("1.Add person");
                        System.out.println("2.list of person(s)");
                        System.out.println("3.Add person (ready-9)");
                        System.out.println("9.Back");
                        select = input.nextShort();
                        if (select == 1) {
                            add_person(city);
                        } else if (select == 2) {
                            list_persons(city);
                        } else if (select == 3) {
                            add_person_ready(city);
                        } else if (select == 9) {
                            break;
                        }
                    }
                }//people
                else if (select == 7) {
                    Terminal terminal = new Terminal(0, null, null, null, 0, null);
                    while (true) {
                        System.out.println("\nwhat do you want to do?");
                        System.out.println("1.Take trip");
                        System.out.println("2.List of incoming trips");
                        System.out.println("3.List of outgoing trips");
                        System.out.println("9.Back");
                        select = input.nextShort();
                        if (select == 1) {
                            terminal.newTrip(city);
                        }//Take trip
                        else if (select == 2) {
                            terminal.listOfTripsIn(city.getName());
                        }//List of incoming trips
                        else if (select == 3) {
                            terminal.listOfTripsOut(city.getName());
                        }//List of outgoing trips
                        else if (select == 9) {
                            break;
                        }
                    }
                }//trip
                else if (select == 8) {
                    Bank.panel(city);
                }//bank
                else if (select == 9) {
                    Country.panel();
                }//back
                else if (select == 99) {
                    City.details(city);
                }//details
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
    static boolean deletePerson(City city , Person person){
        try {
            for (int i = 0; i < city.people.size(); i++) {
                if (person.getName() == city.people.get(i).getName()) {
                    if (person.getLast_name() == city.people.get(i).getLast_name()) {
                        if (person.getJob() == city.people.get(i).getJob()) {
                            if (person.getGender() == city.people.get(i).getGender()) {
                                city.people.remove(i);
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        catch (Exception ex){
            ex.printStackTrace();
            return false ;
        }
    }
    static void details(City city){
        try {
            System.out.print("Persons are : ");
            list_persons(city);
            System.out.println("\n");

            System.out.print("Hotels are : ");
            list_hotels(city);
            System.out.println("\n");

            System.out.print("Airports are : ");
            list_of_airports(city);
            System.out.println("\n");

            System.out.print("Terminals are : ");
            list_terminal(city);
            System.out.println("\n");

            System.out.print("Railroads are : ");
            list_railroad(city);
            System.out.println("\n");

            System.out.print("Harbours are : ");
            list_harbour(city);
            System.out.println("\n");

            System.out.print("Banks are : ");
            Bank.listOfBanks(city);
            System.out.println();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }

    }

}
