package model;
import exception.InsufficientBalanceException;

public class Account {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public Account(String accountNumber, String ownerName, double balance){

        if(balance < 0){
            throw new IllegalArgumentException("balance cannot be negative");
        }

        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public String getOwnerName(){
        return ownerName;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance");
        }
        balance -= amount;
    }
}
