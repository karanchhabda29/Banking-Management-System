package service;


import exception.AccountNotFoundException;
import model.Account;
import service.BankService;

import java.util.HashMap;
import java.util.Map;

public class BankServiceImpl implements BankService {

    private Map<String, Account> accounts = new HashMap<>();

    @Override
    public void createAccount(String number, String owner, double balance) {
        accounts.put(number, new Account(number, owner, balance));
    }

    private Account findAccount(String number) {
        Account account = accounts.get(number);
        if (account == null) {
            throw new AccountNotFoundException("Account not found: " + number);
        }
        return account;
    }

    @Override
    public void deposit(String accountNumber, double amount) {
        findAccount(accountNumber).deposit(amount);
    }

    @Override
    public void withdraw(String accountNumber, double amount) {
        findAccount(accountNumber).withdraw(amount);
    }
    @Override
    public void showAccounts(){
        if(accounts.isEmpty()){
            System.out.println("Account list is empty");
            return;
        }
        accounts.values().forEach(acc ->
                System.out.println(acc.getAccountNumber()+ " | " +
                        acc.getOwnerName()+" | " +
                        acc.getBalance()));
    }
//    @Override
//    public void showAccounts() {
//        for (Account acc : accounts.values()) {
//            System.out.println(
//                    acc.getAccountNumber() + " | " +
//                            acc.getOwnerName() + " | " +
//                            acc.getBalance()
//            );
//        }
//    }

}
