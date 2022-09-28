package LAB4;
import java.util.Scanner;
public class $_2_BankSystem {
    public static void main(String[] args) {
        BankAccount1[] account = new BankAccount1[10];
        Scanner scan = new Scanner(System.in);
        System.out.println("welcome to ABC bank");
        int n = 0;
        while(true){
            System.out.println("#press 1 to create new account\n#press 2 to displaying account\n#press 3 to deposit cash" +
                    "\n#press 4 to withdraw cash\n#press 0 to exit");
            char ch=scan.next().charAt(0);
            switch(ch){
                case('1'): {
                    System.out.println("how many accounts you want to create ?");
                    n = scan.nextInt();
                    for (int i = 0; i < n; i++) {
                        scan.nextLine();
                        System.out.println("enter your name for no :" + (i + 1) + " account :");
                        String name = scan.nextLine();
                        System.out.println("enter your Balance for no :" + (i + 1) + " account :");
                        double balance = scan.nextDouble();
                        System.out.println("enter your ID for no :" + (i + 1) + " account :");
                        int id = scan.nextInt();
                        account[i] = new BankAccount1(name, id, balance);
                    }
                }
                break;
                case('2'):{
                    System.out.println("enter your account id : ");
                    int account_id=scan.nextInt();
                    for(int i=0;i<n;i++) {
                        if (account_id==account[i].id){
                            account[i].display();
                        }
                    }
                }
                break;
                case('3'):{
                    System.out.println("enter your account id : ");
                    int account_id=scan.nextInt();
                    for(int i=0;i<n;i++){
                        if(account_id==account[i].id){
                            System.out.println("how much money you want to deposit : ");
                            double amount=scan.nextDouble();
                            account[i].deposit(amount);
                            System.out.println("Current balance : "+account[i].balance);
                        }
                    }
                }
                break;
                case('4'):{
                    System.out.println("enter your account id : ");
                    int account_id=scan.nextInt();
                    for(int i=0;i<n;i++){
                        if(account_id==account[i].id){
                            System.out.println("how much money you want to with draw : ");
                            double amount=scan.nextDouble();
                            account[i].withdraw(amount);
                            System.out.println("Current balance : "+account[i].balance);
                        }
                    }
                }
                break;
                case('0'):
                    System.exit(0);
            }
        }
    }
}
class BankAccount1 {
    String name;
    int id;
    double balance;
    public BankAccount1(String name, int id, double balance){
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
        System.out.println("name : "+name);
        System.out.println("id : "+id);
        System.out.println("balance : "+balance);
    }
}
