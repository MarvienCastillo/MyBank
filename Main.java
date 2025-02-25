//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class Main {
    public static void main(String[] args) {

        MyBank bank = new MyBank("BDO");
        bank.open("Marvien",1000);
        System.out.println(bank.accounts.get(0).getID());
        Scanner s = new Scanner(System.in);
        System.out.println("Enter account name: ");
        String name = s.nextLine();
        System.out.println("Enter balance: ");
        double balance = s.nextDouble();
        bank.open(name,balance);
        System.out.println(bank.accounts.get(1).getID());
        System.out.println(bank.accounts.get(1).getBalance());
    }
}