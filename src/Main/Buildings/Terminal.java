package Main.Buildings;
import Main.City;
import Main.Country;
import Main.Date;
import Main.Exception.*;
import Main.Person;
import Main.Trip.TakeATrip;
import Main.Trip.Tripable;
import java.util.ArrayList;
import java.util.Objects;


public class Terminal implements Tripable {
    private int cost;
    private String n_city;
    private String n_terminal;
    private String address;
    private int extent;
    private String kind;
    private ArrayList<Person> aircrew = new ArrayList<>();
    private ArrayList<TakeATrip> trips = new ArrayList<>();
    private ArrayList<TakeATrip> tripIn = new ArrayList<>();
    private ArrayList<TakeATrip> tripOut = new ArrayList<>();

    public Terminal(int cost, String n_city, String n_terminal, String address, int extent, String kind) {
        this.cost = cost;
        this.n_city = n_city;
        this.n_terminal = n_terminal;
        this.address = address;
        this.extent = extent;
        this.kind = kind;
    }

    // getters and setters
    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public String getN_city() {
        return n_city;
    }
    public void setN_city(String n_city) {
        this.n_city = n_city;
    }
    public String getN_terminal() {
        return n_terminal;
    }
    public void setN_terminal(String n_terminal) {
        this.n_terminal = n_terminal;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getExtent() {
        return extent;
    }
    public void setExtent(int extent) {
        this.extent = extent;
    }
    public ArrayList<Person> getPerson() {
        return aircrew;
    }
    public void setPerson(ArrayList<Person> person) {
        this.aircrew  = person;
    }
    public ArrayList<Person> getAircrew() {
        return aircrew;
    }
    public void setAircrew(ArrayList<Person> aircrew) {
        this.aircrew = aircrew;
    }
    public ArrayList<TakeATrip> getTrips() {
        return trips;
    }
    public void setTrips(ArrayList<TakeATrip> trips) {
        this.trips = trips;
    }
    public ArrayList<TakeATrip> getTripIn() {
        return tripIn;
    }
    public void setTripIn(ArrayList<TakeATrip> tripIn) {
        this.tripIn = tripIn;
    }
    public ArrayList<TakeATrip> getTripOut() {
        return tripOut;
    }
    public void setTripOut(ArrayList<TakeATrip> tripOut) {
        this.tripOut = tripOut;
    }
    public String getKind() {
        return kind;
    }
    public void setKind(String kind) {
        this.kind = kind;
    }


    // methods
    public void newTrip(City city) {
        try{
            System.out.println("You are going ti add new trip.");
            //انتخاب مسافران
            System.out.println("Choose travelers ");
            int counter = 1;
            for (int i = 0; i < city.getPeople().size(); i++) {
                System.out.println((counter) + ".Name : " +city.getPeople().get(i).getName());
                System.out.println("Last name : " +city.getPeople().get(i).getLast_name() );
                System.out.println("Job : " + city.getPeople().get(i).getJob() + "\n");
                counter++;
            }
            ArrayList<Person> travelers = new ArrayList<>();
            int select;
            while (true){
                select = input.nextInt();
                select--;
                if(city.getPeople().size() < select )
                    throw new MyOutOfBand();
                for (int i = 0; i < city.getPeople().size() ; i++) {
                    if (i == select){
                        travelers.add(city.getPeople().get(select));
                    }
                }
                System.out.println("Do you want to continue?\n1.Yes\n2.No");
                short con = input.nextShort();
                if (con==2){
                    break;
                }
            }

            //انتخاب مبدا
            Terminal terBeg = new Terminal(0,null,null,null,0,null);
            System.out.println("Enter name of beginning terminal");
            String NameBeg = input.next();
            boolean bnameBeg = false;
            for (int i = 0; i < city.getTerminal().size(); i++) {
                if (Objects.equals(NameBeg, city.getTerminal().get(i).getN_terminal())) {
                    bnameBeg = true;
                    terBeg = city.getTerminal().get(i);
                    break;
                }
            }
            if (!bnameBeg){
                throw new NoTerminalInCity();
            }
            //انتخاب مقصد
            Terminal terDes = new Terminal(0,null,null,null,0,null);
            System.out.println("Enter name of destination terminal");
            String nameDes = input.next();
            boolean bnameDes = false;
            for (int i = 0; i < Country.getCities().size(); i++) {
                for (int j = 0; j < Country.getCities().get(i).getTerminal().size(); j++) {
                    if (Objects.equals(Country.getCities().get(i).getTerminal().get(j).getN_terminal(), nameDes)) {
                        bnameDes = true;
                        terDes = Country.getCities().get(i).getTerminal().get(j);
                        break;
                    }
                }
            }
            if (!bnameDes){
                throw new NoTerminal();
            }
//            if (Objects.equals(terBeg.getKind(), terDes.getKind())){
//                throw new InvalidTerminal();
//            }

            //انتخاب وسیله نقلیه
            String vehicle = null ;
            System.out.println("Enter id vehicles ");
            int id = input.nextInt();
            boolean bId = false; boolean dPio = false ; boolean dDri = false;
            for (int i = 0; i < city.getBuses().size(); i++) {
                if (id == city.getBuses().get(i).getId()) {
                    bId = true;
                    dDri = true;
                    vehicle = "bus" ;
                    if (city.getBuses().get(i).getCapacity() < (travelers.size() / 2) ){
                        throw new NoTravelers();
                    }
                    break;
                }
            }

            for (int i = 0; i < city.getPassengers().size(); i++) {
                if (id == city.getPassengers().get(i).getId()) {
                    dPio = true;
                    bId = true;
                    vehicle = "airplane" ;
                    if (city.getPassengers().get(i).getCapacity() < (travelers.size() / 2) ){
                        throw new NoTravelers();
                    }
                    break;
                }
            }
            if (!bId){
                throw new NoVehicle();
            }

            //انتخاب راننده
            int driver = 1;int choose;
            Person pdriver =new Person(null,null,null,null
                    ,null,null,null);
            if (dPio){
                System.out.println("Choose number of pilot ");
                for (int i = 0; i < city.getPeople().size(); i++) {
                    if (Objects.equals(city.getPeople().get(i).getJob(), "pilot")){
                        System.out.println((driver)+ ".Name  : " +city.getPeople().get(i).getName() );
                        System.out.println("Last name : " + city.getPeople().get(i).getLast_name());
                        driver++;
                    }
                }
                choose = input.nextInt();
                choose--;
                if(city.getPeople().size() < select )
                    throw new MyOutOfBand();
                for (int i = 0; i < city.getPeople().size(); i++) {
                    if (Objects.equals(city.getPeople().get(i).getJob(), "pilot")){
                        if (choose == i){
                            pdriver = city.getPeople().get(i);
                        }
                    }
                }
                if (pdriver == null){
                    throw new NoDriver();
                }
            }
            if (dDri){
                System.out.println("Choose number of driver ");
                for (int i = 0; i < city.getPeople().size(); i++) {
                    if (Objects.equals(city.getPeople().get(i).getJob(), "driver")){
                        System.out.println((driver)+ ".Name  : " +city.getPeople().get(i).getName() );
                        System.out.println("Last name : " + city.getPeople().get(i).getLast_name());
                        driver++;
                    }
                }
                choose = input.nextInt();
                choose--;
                if(city.getPeople().size() < select )
                    throw new MyOutOfBand();
                for (int i = 0; i < city.getPeople().size(); i++) {
                    if (Objects.equals(city.getPeople().get(i).getJob(), "driver")){
                        if (choose == i){
                            pdriver = city.getPeople().get(i);
                        }
                    }
                }
                if (pdriver == null){
                    throw new NoDriver();
                }
            }

            //انتخاب زمان
            System.out.println("Enter date (year / mou / day");
            Date date = new Date(input.nextInt(), input.nextInt(), input.nextInt());

            //id
            int idTrip = 10000 + TakeATrip.trips.size();

            //price
            System.out.println("Enter the ticket price");
            int price = input.nextInt();

            TakeATrip trip = new TakeATrip(terDes,terBeg,pdriver,date,idTrip,price);
            trip.setTravelers(travelers);
            trip.setVehicles(vehicle);

            //add to lists
            TakeATrip.trips.add(trip);
            for (int i = 0; i < Country.getCities().size() ; i++) {
                for (int j = 0; j < Country.getCities().get(i).getTerminal().size() ; j++) {
                    if (Objects.equals(Country.getCities().get(i).getTerminal().get(j).getN_terminal(), trip.getBeginning().getN_terminal())){
                        Country.getCities().get(i).getTerminal().get(j).getTripIn().add(trip);
                    }//مبدا
                    if (Objects.equals(Country.getCities().get(i).getTerminal().get(j).getN_terminal(), trip.getDestination().getN_terminal())){
                        Country.getCities().get(i).getTerminal().get(j).getTripOut().add(trip);
                    }//مقصد
                }
            }

            for (int i = 0; i < city.getPeople().size() ; i++) {
                for (int j = 0; j < travelers.size() ; j++) {
                    if (Objects.equals(city.getPeople().get(i).getName(), travelers.get(j).getName())){
                        if(Objects.equals(city.getPeople().get(i).getLast_name(), travelers.get(j).getLast_name())){
                            city.getPeople().remove(i);
                            i--;
                        }
                    }
                }
            }
            for (int i = 0; i < Country.getCities().size(); i++) {
                if (Objects.equals(Country.getCities().get(i).getName(), terDes.getN_city())){
                    for (Person traveler : travelers) {
                        Country.getCities().get(i).getPeople().add(traveler);
                    }
                }
            }
            for (int i = 0; i < city.getPeople().size() ; i++) {
                if (Objects.equals(city.getPeople().get(i).getName(), pdriver.getName())){
                    if (Objects.equals(city.getPeople().get(i).getLast_name(), pdriver.getLast_name())){
                        city.getPeople().remove(i);
                        i--;
                    }
                }
            }
            for (int i = 0; i < Country.getCities().size(); i++) {
                if (Objects.equals(Country.getCities().get(i).getName(), terDes.getN_city())){
                    Country.getCities().get(i).getPeople().add(pdriver);
                }
            }

            int totalCost = calculateCostTrip(trip);
            city.setMoney(city.getMoney() + totalCost);

            if (dPio){
                for (int i = 0; i < city.getPassengers().size(); i++) {
                    if (id == city.getPassengers().get(i).getId()){
                        for (int j = 0; j < Country.getCities().size(); j++) {
                            if (Objects.equals(Country.getCities().get(i).getName(), terDes.getN_city())){
                                Country.getCities().get(i).getPassengers().add(city.getPassengers().get(i));
                            }
                        }
                        city.getPassengers().remove(i);
                        i--;
                    }
                }
            }
            if (dDri){
                for (int i = 0; i < city.getBuses().size(); i++) {
                    if (id == city.getBuses().get(i).getId()){
                        for (int j = 0; j < Country.getCities().size(); j++) {
                            if (Objects.equals(Country.getCities().get(i).getName(), terDes.getN_city())){
                                Country.getCities().get(i).getBuses().add(city.getBuses().get(i));
                            }
                        }
                        city.getBuses().remove(i);
                        i--;
                    }
                }
            }
//            removeTek(city);
//            for (int i = 0; i < Country.getCities().size(); i++) {
//                if (Objects.equals(Country.getCities().get(i).getName(), trip.getDestination().getN_city())){
//                    removeTek(Country.getCities().get(i));
//                }
//            }
//            for (int i = 0; i < travelers.size(); i++) {
//                travelers.remove(i);
//                i--;
//            }
            System.out.println("Rigesterd\n");
        }
//        catch (RuntimeException ex){
//            System.out.println(ex.getMessage());
//        }
        catch (NoTerminalInCity ex){
            System.out.println(ex.toString());
        }
        catch (NoTerminal ex){
            System.out.println(ex.toString());
        }
        catch (NoVehicle ex){
            System.out.println(ex.toString());
        }
        catch (NoTravelers ex){
            System.out.println(ex.toString());
        }
        catch (MyOutOfBand ex){
            System.out.println(ex.toString());
        }
//        catch (InvalidTerminal ex){
//            System.out.println(ex.toString());
//        }
//        catch (InvalidInput ex){
//            System.out.println(ex.toString());
//        }


    }
    public void sortTrips (){
        for (int i = 0; i < TakeATrip.trips.size() ; i++) {
            for (int j = 0; j < TakeATrip.trips.size()-1-j ; j++) {
                if (TakeATrip.trips.get(j).compareTo(TakeATrip.trips.get(j+1)) > 0 ){
                    TakeATrip temp  = TakeATrip.trips.get(j);
                    TakeATrip.trips.remove(j);
                    TakeATrip.trips.add(j+1 , temp);
                }
            }
        }
    }
    public int calculateCostTrip(TakeATrip trip){
        int cost ;
        cost = trip.getCost();
        int totalCost ;
        totalCost = cost * trip.getTravelers().size();
        return totalCost;
    }
    public void listOfTripsIn(String nameTerminal){
        int counter = 1;
        for (int i = 0; i < TakeATrip.trips.size(); i++) {
            if (Objects.equals(TakeATrip.trips.get(i).getDestination().getN_city(), nameTerminal)){
                System.out.println((counter) + ".Id : " + TakeATrip.trips.get(i).getId());
                System.out.println("Vehicle : " + TakeATrip.trips.get(i).getVehicles());
                System.out.println("Shahre mabda : "+TakeATrip.trips.get(i).getBeginning().getN_city());
                System.out.println("Shahre maghsad : " + TakeATrip.trips.get(i).getDestination().getN_city());
                System.out.println("Date : " + TakeATrip.trips.get(i).getDate().getYear()+"/"+
                        TakeATrip.trips.get(i).getDate().getMount()+"/"+TakeATrip.trips.get(i).getDate().getDay());
                counter++;
            }
        }
        System.out.println("End\n");
    }
    public void listOfTripsOut(String nameTerminal){
        int counter = 1;
        for (int i = 0; i < TakeATrip.trips.size(); i++) {
            if (Objects.equals(TakeATrip.trips.get(i).getBeginning().getN_city(), nameTerminal)){
                System.out.println((counter) + ".Id : " + TakeATrip.trips.get(i).getId());
                System.out.println("Vehicle : " + TakeATrip.trips.get(i).getVehicles());
                System.out.println("Shahre mabda : "+TakeATrip.trips.get(i).getBeginning().getN_city());
                System.out.println("Shahre maghsad : " + TakeATrip.trips.get(i).getDestination().getN_city());
                System.out.println("Date : " + TakeATrip.trips.get(i).getDate().getYear()+"/"+
                        TakeATrip.trips.get(i).getDate().getMount()+"/"+TakeATrip.trips.get(i).getDate().getDay());
                counter++;
            }
        }
        System.out.println("End\n");
    }

    static void removeTek(City city){
        for (int i = 0; i < city.getPeople().size(); i++) {
            for (int j = 0; j < city.getPeople().size(); j++) {
                if (city.getPeople().get(i).getName() == city.getPeople().get(j).getName()){
                    if (city.getPeople().get(i).getLast_name() == city.getPeople().get(j).getLast_name()){
                        city.getPeople().remove(i);
                        i--;j--;
                    }
                }
            }
        }
    }

}

