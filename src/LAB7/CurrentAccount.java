package LAB7;

public class CurrentAccount extends BankAccount {
    String tradeLicenceNumber;
    CurrentAccount(String memberName, double accountBalance,String tradeLicenceNumber) {
        super(memberName, accountBalance, 5000);
        this.tradeLicenceNumber=tradeLicenceNumber;
    }
}
