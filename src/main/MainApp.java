package main;

import service.BankService;
import service.BankServiceImpl;


import util.Menu;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args){
        BankService bankService = new BankServiceImpl();
        Scanner scanner = Menu.getScanner();

        boolean running = true;

        while (running){
            try {
                int choice = Menu.showMenu();

                switch (choice){
                    case 1:
                        System.out.println("Enter account number: ");
                        String number = scanner.next();

                        System.out.println("Enter owner name: ");
                        String name = scanner.next();

                        System.out.println("Enter balance: ");
                        double balance = scanner.nextDouble();

                        bankService.createAccount(number, name, balance);
                        System.out.println("Account created successfully");
                        break;

                    case 2:
                        System.out.println("Enter account number: ");
                        number = scanner.next();

                        System.out.println("Amount: ");
                        double depositAmount = scanner.nextDouble();

                        bankService.deposit(number, depositAmount);
                        System.out.println("Deposited successfully");
                        break;

                    case 3:
                        System.out.println("Enter account number: ");
                        number = scanner.next();

                        System.out.println("Amount: ");
                        double withdrawAmount = scanner.nextDouble();

                        bankService.withdraw(number, withdrawAmount);
                        System.out.println("Withdraw successfully");
                        break;

                    case 4:
                        bankService.showAccounts();
                        break;

                    case 0:
                        running = false;
                        System.out.println("Thank you for using our Bank Service");
                        break;

                    default:
                        System.out.println("Invalid choice");


                }
            }catch (Exception e){
                System.out.println("Error"+ e.getMessage());
            }
        }
    }

}
