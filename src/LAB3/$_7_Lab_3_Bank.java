package LAB3;

public class $_7_Lab_3_Bank {
    public static void main(String[] args) {
        BankAccount jonayed=new BankAccount("mohammad Jonayed","19101019",1000);
        jonayed.withdraw(100);
        System.out.println("after withdraw:");
        System.out.println(jonayed.balance);
        jonayed.deposit(500);
        System.out.println("after deposit:");
        System.out.println(jonayed.balance);
    }
}
class BankAccount{
    String name;
    String id;
    double balance;
    BankAccount(String n,String i,double b){
        name=n;
        id=i;
        balance=b;
    }
    void deposit(double depAmount){
        balance=balance+depAmount;
    }
    void withdraw(double withAmount){
        if(balance<withAmount){
            System.out.println("main balance exceeded");
        }
        else{
            balance=balance-withAmount;
        }
    }
    double getBalance(){
        return balance;
    }
    void display(){
        System.out.println("name : "+"["+name+"]");
        System.out.println("ID : "+"["+id+"]");
        System.out.println("Balance : ["+balance+"]");
    }
}
