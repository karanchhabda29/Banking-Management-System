package util;

import java.util.Scanner;

public class Menu {
    private static final Scanner scanner = new Scanner(System.in);

    public static int showMenu(){
        System.out.println("\n===== Bank Managment System =====");
        System.out.println("1. Create Account");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Display Accounts");
        System.out.println("5. Exit");
        System.out.println("Enter your choice: ");

        return scanner.nextInt();
    }
    public static Scanner getScanner(){
        return scanner;
    }
}
