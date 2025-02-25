
import java.util.*;
public class MyBank {
    private String name;
    ArrayList<Account> accounts = new ArrayList<>();

    public MyBank(String name){
        this.name = name;
    }

    /**
     * open(name) opens an account with the given name
     * @param name is the name of the user that will open the account
     */
    public void open(String name){
        accounts.add(new Account(name));
    }
    public void open(String name, double amount){
        accounts.add(new Account(name, amount));
    }

    public void credit(int accno, double amount){
        int i;
        for(i = 0; i < accounts.size(); i++){
            if(accno == accounts.get(i).getID())
                accounts.get(i).credit(amount);
        }
    }
    public void debit(int accno, double amount){
        int i;
        for(i = 0; i < accounts.size(); i++){
            if(accno == accounts.get(i).getID())
                accounts.get(i).debit(amount);
        }
    }
    public String inquiry(int accno){
        int i;
        for(i = 0; i < accounts.size(); i++){
            if(accno == accounts.get(i).getID())
            {
                return accounts.get(i).inquire();
            }
        }
        return null;
    }
    public double close(int accno){
        int i;
        for(i = 0; i < accounts.size(); i++){
            if(accno == accounts.get(i).getID())
                return accounts.get(i).close();
        }
        return 0;
    }
}
