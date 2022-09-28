package LAB9;

public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message){
        super(message);
    }
    public InsufficientBalanceException(double amt){
        super("cant withdraw more than "+amt+" taka");
    }
}
