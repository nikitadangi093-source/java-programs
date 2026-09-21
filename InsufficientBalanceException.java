class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        double balance = 5000;
        double withdraw = 7000;

        try {
            if (withdraw > balance) {
                throw new InsufficientBalanceException(
                    "Insufficient Balance!"
                );
            }

            balance = balance - withdraw;
            System.out.println("Withdrawal successful");
            System.out.println("Remaining balance: " + balance);
        }
        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}