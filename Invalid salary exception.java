class InvalidSalaryException extends Exception {
    InvalidSalaryException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {

        double salary = -5000;

        try {
            if (salary < 0) {
                throw new InvalidSalaryException("Invalid Salary!");
            }

            System.out.println("Salary is valid: " + salary);
        }
        catch (InvalidSalaryException e) {
            System.out.println(e.getMessage());
        }
    }
}