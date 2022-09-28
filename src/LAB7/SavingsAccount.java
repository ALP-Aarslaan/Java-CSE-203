package LAB7;

public class SavingsAccount extends BankAccount {
    private double interest=0.05;
    private double maxWithLimit;
    SavingsAccount(String memberName, double accountBalance,double maxWithLimit) {
        super(memberName, accountBalance, 2000);
        this.maxWithLimit=maxWithLimit;
    }
    private double calculateInterest(){
        return getAccountBalance()*interest;
    }
    double getNetBalance(){
        double totalInterest= calculateInterest();
        return getAccountBalance()+totalInterest;
    }

    @Override
    public void withdraw(double withAmount) {

        if((withAmount<maxWithLimit)){
            super.withdraw(withAmount);
        }
    }

    @Override
    void display() {
        super.display();
        System.out.println("Interest : "+getAccountBalance()*interest);
        System.out.println("maximum withdraw limit : "+maxWithLimit);
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public double getMaxWithLimit() {
        return maxWithLimit;
    }

    public void setMaxWithLimit(double maxWithLimit) {
        this.maxWithLimit = maxWithLimit;
    }
}
