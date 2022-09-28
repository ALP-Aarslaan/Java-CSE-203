package LAB7;

import java.util.ArrayList;

public class Bank {
    ArrayList<BankAccount> accounts = new ArrayList<>();

    private void addAccount(BankAccount acc) {
        accounts.add(acc);
    }

    void addAccount(String name, double balance, double maxWithLimit) {
        SavingsAccount ob1 = new SavingsAccount(name, balance, maxWithLimit);
        addAccount(ob1);
    }

    void addAccount(String name, double balance, String tradeLicence) {
        CurrentAccount ob1 = new CurrentAccount(name, balance, tradeLicence);
        addAccount(ob1);
    }

    private BankAccount findAccount(String accountNum) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccountNumber().equals(accountNum)) {
                return accounts.get(i);
            }
        }
        return null;

    }

    void deposit(String accountNum, double amt) {
        BankAccount acNum = findAccount(accountNum);
        for (int i = 0; i < accounts.size(); i++) {
            BankAccount ob = accounts.get(i);
            if (acNum.equals(ob)) {
                ob.deposit(amt);
            }
            else if(acNum==null){
                System.out.println("Account doesn't exists");
            }
        }
    }

    void withdraw(String accountNum, double amt) {
        BankAccount acNum = findAccount(accountNum);
        for (int i = 0; i < accounts.size(); i++) {
            BankAccount ob = accounts.get(i);
            if (acNum.equals(ob)) {
                ob.withdraw(amt);
            }
        }
    }

    void getBalance(String accountNum) {
        BankAccount acNum = findAccount(accountNum);
        if (acNum instanceof CurrentAccount)
            acNum.getAccountBalance();
        else if (acNum instanceof SavingsAccount)
             ((SavingsAccount) acNum).getNetBalance();
        else if(acNum==null){
            System.out.println("account does not exist");
        }
        return;
    }
    void display(String accountNum){
        BankAccount acNum=findAccount(accountNum);
        for(int i=0;i<accounts.size();i++){
            BankAccount ob=accounts.get(i);
            if(acNum.equals(ob)){
                ob.display();
            }
        }
    }
    void display(){
        for(int i=0;i<accounts.size();i++){
            BankAccount ob=accounts.get(i);
            ob.display();
        }
    }
}
