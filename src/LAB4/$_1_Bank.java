package LAB4;

import java.util.Scanner;

public class $_1_Bank {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your name : ");
        String name=scan.nextLine();
        System.out.println("enter your id : ");
        int id=scan.nextInt();
        System.out.println("enter your balance : ");
        double balance =scan.nextFloat();
        BankAccount1 ob1=new BankAccount1(name,id,balance);
        while(true){
            System.out.println("#press 1 to deposit money \n #press 2 to withdraw money \n" +
                    " #press 3 to display information\n#press 0 to exit");

            char ch=scan.next().charAt(0);
            switch(ch){
                case('1') :{
                    System.out.println("enter how much money you want to deposit : ");
                    double amount=scan.nextDouble();
                    ob1.deposit(amount);
                    System.out.println("current balance : "+ob1.balance);
                }break;
                case ('2'):{
                    System.out.println("enter how much money you want to withdraw : ");
                    double withMoney=scan.nextDouble();
                    ob1.withdraw(withMoney);
                    System.out.println("Current balance : "+ob1.balance);
                }break;
                case ('3'):{
                    ob1.display();
                }break;
                case ('0'):
                    System.exit(0);
            }
        }
    }
}
class BankAccount{
    String name;
            int id;
    double balance;
  public BankAccount(String name,int id,double balance){
        this.name=name;
        this.id=id;
        this.balance=balance;
    }
    void deposit(double depAmount){
        balance=balance+depAmount;
    }
    void withdraw(double withAmount){
        if(balance>withAmount){
            balance=balance-withAmount;
        }
        else{
            System.out.println("balance exceeded");
        }
    }
    double getBalance() {

        return balance;
    }
    void display() {
      System.out.println(this);
    }

    @Override
    public String toString() {
        return "Bank{"+"name='"+name+'\''+",id='"+id+'\''+",balance="+balance+'}';
    }
}
