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
                scanner.nextLine();

                switch (choice){
                    case 1:
                        System.out.println("Enter account number: ");
                        String number = scanner.nextLine();

                        System.out.println("Enter owner name: ");
                        String name = scanner.nextLine();

                        System.out.println("Enter balance: ");
                        double balance = scanner.nextDouble();
                        scanner.nextLine();

                        bankService.createAccount(number, name, balance);
                        System.out.println("Account created successfully");
                        break;

                    case 2:
                        System.out.println("Enter account number: ");
                        number = scanner.nextLine();

                        System.out.println("Amount: ");
                        double depositAmount = scanner.nextDouble();
                        scanner.nextLine();

                        bankService.deposit(number, depositAmount);
                        System.out.println("Deposited successfully");
                        break;

                    case 3:
                        System.out.println("Enter account number: ");
                        number = scanner.nextLine();

                        System.out.println("Amount: ");
                        double withdrawAmount = scanner.nextDouble();
                        scanner.nextLine();

                        bankService.withdraw(number, withdrawAmount);
                        System.out.println("Withdraw successfully");
                        break;

                    case 4:
                        bankService.showAccounts();
                        break;

                    case 5:
                        running = false;
                        System.out.println("Thank you for using our Bank Service");
                        break;

                    default:
                        System.out.println("Invalid choice");


                }
            }catch (Exception e){
                running = false;
                System.out.println("Error"+ e.getMessage());
            }
        }
    }

}
