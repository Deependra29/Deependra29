package Encapsulation;

public class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double amount){
        this.accountHolder=accountHolder;

        if(amount>0){
            this.balance=amount;
        }else{
            this.balance=0;
        }
    }

    public String getAccountHolder(){
        return accountHolder;
    }

    public  double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if(amount>0){
            balance += amount;
            System.out.println("The amount is successfully added");
        }else{
            System.out.println("Please entre the valid amount");

        }
    }

    public  void withdraw(double amount){
        if(amount > 0 && amount<=balance){
            balance -= amount;
            System.out.println("The amount is successfully withdraw");
        }else{
            System.out.println("The balance is insufficient");
        }
    }
}
