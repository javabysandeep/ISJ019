package _3_classComponents;

public class BankAccount {

    // instance variable
    int customerId;
    int accountNumber;
    String accountHolderName;
    double balance;

    //static variable
    static String bankName = "SBI";

    void deposit(double amount) {
        //double amount ---> loc
        balance += amount;
    }

    void withdraw(double amount) {
        balance -= amount;
    }

    BankAccount() {
    }

    public BankAccount(int customerId, int accountNumber, String accountHolderName, double balance) {
        this.customerId = customerId;
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    {
        //System.out.println("instance block");
    }

    static {
       // System.out.println(" static instance block");
    }

    class A {
    }

    static class B {
    }
}
