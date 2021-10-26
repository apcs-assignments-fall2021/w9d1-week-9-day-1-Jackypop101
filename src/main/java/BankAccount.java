public class BankAccount {
    // state instance variable
    private int balance;
    private int accountNumber;
    private double interest;
    private String preferredName;
    //conductor
    public BankAccount (int b, int a, String p){
        balance = b;
        accountNumber = a;
        preferredName = p;
    }
    //behavior
    public void withdraw(int x){
        this.balance -= x;
    }
    public void deposit(int x){
        this.balance += x;
    }
    public double calculate_interest(){
        return(this.interest);
    }
    public int get_Accountnumber(){
        return(this.accountNumber);
    }
    public String get_PreferredName(){
        return(this.preferredName);
    }
    public void set_PreferredName(String x){
        this.preferredName = x;
    }
    public String to_String(){
        return("Account number: " + this.accountNumber + "\n Account Balance: " + this.balance);

    }
}