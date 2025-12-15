package Encapsulation;

public class Client {
    public static void main(String[] args) {

        BankAccount bankacount = new BankAccount("Deependra", 5000);

        bankacount.deposit(7000);
        System.out.println("After deposit balance in account : "+bankacount.getBalance());
        bankacount.withdraw(2000);

        System.out.println("Account holder Name: " +  bankacount.getAccountHolder());
        System.out.println(" Your balance is " + bankacount.getBalance());

        System.out.println("The initial balance  is : " + bankacount.getBalance());

        bankacount.deposit(7000);
        System.out.println("The amount is: " + bankacount.getBalance() + " successfully deposit");

        bankacount.withdraw(2500);
        System.out.println("The amount is:" + bankacount.getBalance());
    }
}
