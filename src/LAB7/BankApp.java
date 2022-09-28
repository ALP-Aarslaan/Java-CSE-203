package LAB7;

import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Input 1 to create an account.\n" +
                    " Input 2 to deposit to an existing account.\n" +
                    " Input ‘3’ to withdraw from an account.\n" +
                    " Input ‘4’ to check the balance of an account.\n" +
                    " Input ‘5’ to display the details of a specific account.\n" +
                    " Input ‘6’ to display the list of the accounts.\n" +
                    " Input ‘0’ to exit the system.");
            int num = scan.nextInt();
            if (num == 1) {
                System.out.println("enter your name : ");
                String name = scan.next();
                System.out.println("enter initial balance :");
                double initialBalance = scan.nextDouble();
                scan.nextLine();
                System.out.println("enter maximum limit of withdraw :");
                double maxLimit = scan.nextDouble();
                System.out.println("enter which type account you want to create :");
                System.out.println("enter A to create savings account ");
                System.out.println("enter B to create current account ");
                char ch=scan.next().charAt(0);
                if (ch == 'A') {
                    SavingsAccount p1 = new SavingsAccount(name, initialBalance, maxLimit);
                }
                if (ch == 'B') {
                    System.out.println("to create current account enter your trade licence number :");
                    String licenceNum = scan.next();
                    CurrentAccount s1 = new CurrentAccount(name, initialBalance, licenceNum);
                }
            }

        if (num == 2) {
            Bank ob = new Bank();
            System.out.println("enter account number : ");
            String accountNum=scan.next();
            for (int i = 0; i < ob.accounts.size(); i++) {
                if (ob.accounts.get(i).equals(accountNum)) {
                    System.out.println("enter deposit amount :");
                    double depositAmount = scan.nextDouble();
                    ob.deposit(accountNum, depositAmount);
                }
            }

        }
        if (num == 3) {
            Bank ob = new Bank();
            System.out.println("enter account number : ");
            String accountNum = scan.next();
            for (int i = 0; i < ob.accounts.size(); i++) {
                if (ob.accounts.get(i).equals(accountNum)) {
                    System.out.println("enter withdraw amount :");
                    double withAmount = scan.nextDouble();
                    ob.withdraw(accountNum, withAmount);
                }
            }
        }
        if (num == 4) {
            Bank ob = new Bank();
            System.out.println("enter account number : ");
            String accountNum = scan.next();
            for (int i = 0; i < ob.accounts.size(); i++) {
                if (ob.accounts.get(i).equals(accountNum)) {
                    ob.getBalance(accountNum);
                }
            }
        }
        if (num == 5) {
            Bank ob = new Bank();
            System.out.println("enter account number : ");
            String accountNum = scan.next();
            for (int i = 0; i < ob.accounts.size(); i++) {
                if (ob.accounts.get(i).equals(accountNum)) {
                    ob.display();
                }
            }
        }
        if (num == 6) {
            Bank ob = new Bank();
            for (int i = 0; i < ob.accounts.size(); i++) {
                ob.accounts.get(i).display();
            }
        }
        if (num == 0) {
            System.exit(0);
        }

        }
    }

}

