public class Account {
    private int id;
    private String name;
    private double balance;
    private boolean bOpen;
    private static int noOfAccounts = 0;

    public Account(String name)
    {
        noOfAccounts++;
        this.id = Integer.parseInt("123000" + noOfAccounts);
        this.name = name;
        this.bOpen = true; // open

    }
    public Account(String name,double amt)
    {
        noOfAccounts++;
        this.id = Integer.parseInt("123000" + noOfAccounts);
        this.name = name;
        this.balance = amt;
        this.bOpen = true; // open
    }
    public int getNoOfAccounts()
    {
        return noOfAccounts;
    }
    public int getID()
    {
        return id;
    }
    public String getName(){
        return name;
    }
    public double getBalance()
    {
        return balance;
    }
    public boolean isOpen(){
        return bOpen;
    }

    public void credit(double amt){
        this.balance += amt;
    }
    public void debit(double amt){
        this.balance -= amt;
    }
    public String inquire(){
        String format = id + name + ":" + balance;
        return format;
    }
    public double close(){
        bOpen = false;
        return balance;
    }
}
