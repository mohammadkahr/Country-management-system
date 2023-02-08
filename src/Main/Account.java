package Main;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Account {

    static Scanner input = new Scanner(System.in);

    private int accountId ;
    private String name ;
    private int personId ;
    private int bankroll ;
    private String date ;

    static ArrayList <Account> accounts = new ArrayList<>() ;

    //constructor
    public Account(int accountId, String name, int personId, int bankroll, String date) {
        this.accountId = accountId;
        this.name = name;
        this.personId = personId;
        this.bankroll = bankroll;
        this.date = date;
    }

    //setters
    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPersonId(int personId) {
        this.personId = personId;
    }
    public void setBankroll(int bankroll) {
        this.bankroll = bankroll;
    }
    public void setDate(String date) {
        this.date = date;
    }


    //getters
    public int getAccountId() {
        return accountId;
    }
    public String getName() {
        return name;
    }
    public int getPersonId() {
        return personId;
    }
    public int getBankroll() {
        return bankroll;
    }
    public String getDate() {
        return date;
    }

    //Methods
    static void addAccount(City city) {
        try{
            System.out.println("Enter bank's name : ");
            String bankName = input.next();
            Bank bank = searchBank(bankName , city);
            if (bank != null) {
                System.out.println("You are going to add new account.");
                System.out.println("Enter your personal id : ");
                int personalId = input.nextInt();

                System.out.println("Enter your name : ");
                String name = input.next();

                System.out.println("Enter date today : ");
                String date = input.next();

                System.out.println("Enter money : ");
                int money = input.nextInt();

                int accID = bank.getAccounts().size() + 1000;

                Account acc = new Account(accID, name, personalId, money, date);

                Account.accounts.add(acc);
                bank.getAccounts().add(acc);
                totalMoney(bank);

                int numberOfAccount = bank.getNumberOfAccounts();
                numberOfAccount++;
                bank.setNumberOfAccounts(numberOfAccount);
                //bank.accounts().add(acc);
                //Bank.addAccount(city,bank,acc);
                System.out.println("Rigesterd");
            }
            else
                System.out.println("There isn't any bank with this name!");
        }
        catch (Exception ex ){
            ex.printStackTrace();
        }

    }
    static void deposit(City city){
        try{
            System.out.println("Enter bank's name : ");
            String bankName = input.next();
            Bank bank = searchBank(bankName , city);
            if (bank != null) {
                System.out.println("Enter your account id : ");
                int accountId = input.nextInt();
                System.out.println("Enter money you want to deposit");
                int money = input.nextInt();

                Account acc = Account.searchAccount(accountId , city ,bankName);
//                assert acc != null;
                acc.setBankroll((acc.getBankroll() + money));

                totalMoney(bank);
                System.out.println("Rigesterd");
            }
            else
                System.out.println("There isn't any bank with this name!");
        }
        catch (Exception ex){
            ex.printStackTrace();
        }

    }
    static void withdrawal(City city){
        try{
            System.out.println("Enter bank's name : ");
            String bankName = input.next();
            Bank bank = searchBank(bankName , city);
            if (bank != null) {
                System.out.println("Enter your account id : ");
                int accountId = input.nextInt();
                System.out.println("Enter money you want to withdrawal");
                int money = input.nextInt();

                Account acc = Account.searchAccount(accountId , city ,bankName);
                assert acc != null;
                acc.setBankroll((acc.getBankroll() - money));
                totalMoney(bank);
                System.out.println("Rigesterd");
            }
            else
                System.out.println("There isn't any bank with this name!");

        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
    static void receiveInventory(City city){
        try{
            System.out.println("Enter bank's name : ");
            String bankName = input.next();
            Bank bank = searchBank(bankName , city);
            if (bank != null) {
                System.out.println("Enter your account id : ");
                int accountId = input.nextInt();

                Account acc = Account.searchAccount(accountId , city , bankName);
                assert acc != null;
                System.out.println("You have " + acc.getBankroll() + " $ ");
            }
            else
                System.out.println("There isn't any bank with this name!");
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
    static Account searchAccount (int accountId , City city , String bankName){
        try{
            for (int i = 0; i < city.getBanks().size(); i++) {
                if (Objects.equals(city.getBanks().get(i).getName(), bankName)){
                    for (int j = 0; j < city.getBanks().get(i).getAccounts().size() ; j++) {
                        if (accountId == city.getBanks().get(i).getAccounts().get(j).getAccountId()){
                            return city.getBanks().get(i).getAccounts().get(j) ;
                        }
                    }
                }
            }
            return null ;
        }
        catch (Exception ex){
            ex.printStackTrace();
            return null;
        }

    }
    static Bank searchBank (String name , City city){
        try {
            for (int i = 0; i < city.getBanks().size(); i++) {
                if (Objects.equals(name, city.getBanks().get(i).getName())) {
                    return city.getBanks().get(i);
                }
            }
            return null;
        }catch (Exception ex){
            ex.printStackTrace();
            return null ;
        }
    }
    static void totalMoney(Bank bank){
        try {
            int total = 0;
            for (int i = 0; i < bank.getAccounts().size(); i++) {
                total += bank.getAccounts().get(i).getBankroll();
            }
            bank.setTotalMoney(total);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    static void panel (City city){
        while (true){
            System.out.println("select a number");
            System.out.println("1.Create an account");
            System.out.println("2.Deposit");
            System.out.println("3.withdrawal");
            System.out.println("4.Receive inventory");
            System.out.println("5.List of accounts ");
            System.out.println("9.Back");

            short select = input.nextShort();

            if (select == 1){
                Account.addAccount(city);
            }//add account
            else if (select == 2){
                Account.deposit(city);
            }//Deposit
            else if (select == 3){
                Account.withdrawal(city);
            }//withdrawal
            else if (select == 4){
                Account.receiveInventory(city);
            }//Receive inventory
            else if (select == 5) {
                Account.listAcc(city);
            }//list of accounts
            else if (select == 9){
                Bank.panel(city);
            }//Back
        }
    }


    static void listAcc(City city){
        try {
            if (city.getBanks().size() > 0) {
                for (int i = 0; i < city.getBanks().size(); i++) {
                    System.out.println("Name of bank : " + city.getBanks().get(i).getName());
                    for (int j = 0; j < city.getBanks().get(i).getAccounts().size(); j++) {
                        System.out.print((1 + j) + "...");
                        System.out.println(city.getBanks().get(i).getAccounts().get(j));
                        System.out.println();
                    }
                }
            } else
                System.out.println("There isn't any account here !");
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
    @Override
    public String toString() {
        return "\nAccount id : " + accountId +
                "\nName : " + name +
                "\nPerson id : " + personId +
                "\nbankroll : " + bankroll +
                "\ndate : " + date ;
    }
}
