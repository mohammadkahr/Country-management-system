package Main;
import Main.Buildings.Airport;
import Main.Buildings.Hotel;
import Main.Buildings.Room;
import Main.Buildings.Terminal;
import Main.Trip.TakeATrip;
import Main.Vehicles.Passenger;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.exit;

public class Country {
    static Scanner input = new Scanner(System.in);

    static ArrayList<City> cities = new ArrayList<>();
    private int population;
    private static int total_Budget ;

    public Country( int population, int total_Budget) {
        this.population = population;
    }

    //setters and getters
    public static void setTotal_Budget(int total_Budget) {
        Country.total_Budget = total_Budget;
    }
    public static Scanner getInput() {
        return input;
    }
    public static void setInput(Scanner input) {
        Country.input = input;
    }
    public static ArrayList<City> getCities() {
        return cities;
    }
    public static void setCities(ArrayList<City> cities) {
        Country.cities = cities;
    }
    public int getPopulation() {
        return population;
    }
    public void setPopulation(int population) {
        this.population = population;
    }
    public int getTotal_Budget() {
        return total_Budget;
    }

    // Methods
    static void panel () {
        try {
            while (true) {
                System.out.println("Hello dear user.what do you want to do?");
                System.out.println("1.Create new city");
                System.out.println("2.Calculate total budget");
                System.out.println("3.Panel of city");
                System.out.println("4.List of trips");
                System.out.println("5.List of cities");
                System.out.println("6.Add capital(ready)");
                System.out.println("9.Exit");

                short select = input.nextShort();

                if (select == 1) {
                    Country.addCity();
                }//Create new city
                else if (select == 2) {
                    Country.calculateBudget();
                }//Calculate total budget
                else if (select == 3) {
                    Country.openCities();
                }//Panel of city
                else if (select == 4) {
                    Terminal terminal = new Terminal(0, null, null, null, 0, null);
                    terminal.sortTrips();
                    Country.listOfTrips();
                }//List of trips
                else if (select == 5) {
                    Country.listOfCities();
                }//List of cities
                else if (select == 6) {
                    Country.addCapital();
                }//Add capital
                else if (select == 9) {
                    System.err.println("good job");
                    exit(0);
                }//exit

            }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
    static void addCity(){
        try {
            System.out.println("you are going to create a new city. ");
            System.out.println("whats your city's name?");
            String name = input.next();
            City city = new City(name, 100000);
            cities.add(city);
            System.out.println("Rigesterd\n");
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
    static void calculateBudget() {
        try {
            int temp = 0;
            for (int i = 0; i < Country.cities.size(); i++) {
                temp = temp + Country.cities.get(i).getMoney();
            }
            Country.setTotal_Budget(temp);
            System.out.println("Total budget is : " + temp);
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
    static void openCities() {
        try {
            System.out.println("Select a city : ");
            for (int i = 0; i < Country.cities.size(); i++) {
                System.out.println((i + 1) + "." + Country.cities.get(i).getName());
            }

            System.out.println();
            int choose = input.nextInt();
            choose--;
            City.menu(Country.cities.get(choose));
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
    static void listOfCities(){
        try {
            int total = 0;
            for (int i = 0; i < Country.cities.size(); i++) {
                System.out.println((i + 1) + ".Name : " + Country.cities.get(i).getName());
                System.out.println("Budget : " + Country.cities.get(i).getMoney());
                System.out.println("Number of people :" + Country.cities.get(i).getPeople().size() + "\n");
                total = total + Country.cities.get(i).getMoney();
            }
            System.out.println("Your total budget is : " + total);
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
    static void listOfTrips(){
        try {
            for (int i = 0; i < TakeATrip.trips.size(); i++) {
                System.out.println((i + 1) + ".Id : " + TakeATrip.trips.get(i).getId());
                System.out.println("Beginning city : " + TakeATrip.trips.get(i).getBeginning().getN_city());
                System.out.println("Destination city : " + TakeATrip.trips.get(i).getDestination().getN_city());
                System.out.println("Date : " + TakeATrip.trips.get(i).getDate().toString());
                System.out.println("Number of Travelers : " + TakeATrip.trips.get(i).getTravelers().size() + "\n");
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
    static void addCapital(){
        City capital = new City("capital" , 57000);
        Country.getCities().add(capital);

        City.add_person_ready(capital);

        Room room = new Room(2,70,100);
        Hotel hotel = new Hotel("hotel1",10000,"capital-st",3,10,room);
        capital.getHotels().add(hotel);

        Airport airport = new Airport(10000,"capital","airport1"
                ,"capital-st",15000, "airport","Internal",10);
        capital.getAirports().add(airport);
        capital.getTerminal().add(airport);

        Person capitan = new Person("capitan1","capitan1",
                "1990","ISF","man","pilot","2000");
        Passenger pass = new Passenger("7000",6,1000,"homa",10000
        ,1200,10,capitan,0);
        capital.getPassengers().add(pass);
        capital.getAirports().get(0).getPassengers().add(pass);

//        Bank bank = new Bank("meli",1000,1);
//        Account acc = new Account(1000,"reza",120250,1000,"2022-01-01");
//        bank.getAccounts().add(acc);
//        capital.getBanks().add(bank);


    }



}

