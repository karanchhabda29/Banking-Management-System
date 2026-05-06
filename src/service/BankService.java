package service;

public interface BankService {
    void createAccount(String number, String owner, double balance);
    void deposit(String accountNumber, double amount);
    void withdraw(String accountNumber, double amount);
    void showAccounts();
}
