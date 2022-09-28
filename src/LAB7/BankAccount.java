
package LAB7;

import java.util.Random;

public class BankAccount {
    private String memberName,accountNumber;
    private double accountBalance,minimumBalance;

    public BankAccount(String memberName, double accountBalance, int i) {
        this.memberName=memberName;
        this.accountBalance=accountBalance;
        this.accountBalance=i;
    }

    public String getMemberName() {
        return memberName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }


    BankAccount(String memberName, double accountBalance, double minimumBalance,String accountNumber){
        this.memberName=memberName;
        this.accountBalance=accountBalance;
        this.minimumBalance=minimumBalance;
        Random rand=new Random();
        this.accountNumber=(accountNumber=""+rand.nextInt(10)+""+rand.nextInt(10)+""+rand.nextInt(10)+""+rand.nextInt(10)+""+rand.nextInt(10));

    }
    public void deposit(double depAmount){
        accountBalance=accountBalance+depAmount;
    }
    public void withdraw(double withAmount){
        if((accountBalance-withAmount)>=minimumBalance) {
            accountBalance = accountBalance - withAmount;
        }
        else{
            System.out.println("minimum amount limit crossed");
        }
    }
    void display(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "memberName='" + memberName + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", accountBalance=" + accountBalance +
                ", minimumBalance=" + minimumBalance +
                '}';
    }
}
