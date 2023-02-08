package Main;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Bank {

    static Scanner input = new Scanner(System.in);

    private String Name ;
    private ArrayList <Account> accounts = new ArrayList<>();
    private int totalMoney ;
    private int numberOfAccounts ;


    //constructor


    public Bank(String name, int totalMoney, int numberOfAccounts) {
        Name = name;
        this.totalMoney = totalMoney;
        this.numberOfAccounts = numberOfAccounts;
    }

    //setters
    public void setName(String name) {
        Name = name;
    }
    public void setTotalMoney(int totalMoney) {
        this.totalMoney = totalMoney;
    }
    public void setNumberOfAccounts(int numberOfAccounts) {
        this.numberOfAccounts = numberOfAccounts;
    }
    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    //getters
    public String getName() {
        return Name;
    }
    public int getTotalMoney() {
        return totalMoney;
    }
    public int getNumberOfAccounts() {
        return numberOfAccounts;
    }
    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    //methods
    static void addNewBank(City city){
        try{
            System.out.println("Enter your bank name : ");
            String name = input.next();

            Bank bank = new Bank(name,0,0);

            city.getBanks().add(bank);
        }
        catch (Exception ex){
            ex.printStackTrace();
        }

    }
    static void listOfBanks(City city){
        try {
            if (city.getBanks().size() > 0) {
                for (int i = 0; i < city.getBanks().size(); i++) {
                    System.out.println((1 + i) + "...");
                    System.out.println("Name : " + city.getBanks().get(i).getName());
                    System.out.println("Number of accounts : " + city.getBanks().get(i).getNumberOfAccounts());
                    System.out.println("Total money : " + city.getBanks().get(i).getTotalMoney());
                    System.out.println();
                }
            } else
                System.out.println("This city haven't any bank");
        }
        catch (Exception ex){
            ex.printStackTrace();
        }

    }
    static void addAccount(City city , Bank bank , Account account){
        try {
            for (int i = 0; i < Country.cities.size(); i++) {
                if (Objects.equals(Country.cities.get(i).getName(), city.getName())) {
                    for (int j = 0; j < Country.cities.get(i).getBanks().size(); j++) {
                        if (Objects.equals(Country.cities.get(i).getBanks().get(j).getName(), bank.Name)) {
                            Country.cities.get(i).getBanks().get(j).getAccounts().add(account);
                        }
                    }
                }
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

    static void panel (City city){
        while (true){
            System.out.println("Select a number : ");
            System.out.println("1.Create a bank");
            System.out.println("2.List of banks ");
            System.out.println("3.Bank services ");
            System.out.println("9.Back");

            short select = input.nextShort();

            if (select == 1){
                Bank.addNewBank(city);
            }//Create a bank
            else if (select == 2){
                Bank.listOfBanks(city);
            }//List of banks
            else if (select == 3){
                Account.panel(city);
            }//Bank services
            else if (select == 9){
                City.menu(city);
            }//Back

        }
    }

    @Override
    public String toString() {
        return "\nName : " + Name +
                "\nTotalMoney : " + totalMoney +
                "\nNumberOfAccounts : " + numberOfAccounts;
    }
}
