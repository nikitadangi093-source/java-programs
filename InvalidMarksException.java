class InvalidMarksException extends Exception {
    InvalidMarksException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        int marks = 105;

        try {
            if (marks < 0 || marks > 100) {
                throw new InvalidMarksException("Invalid marks!");
            }

            System.out.println("Marks are valid.");
        } 
        catch (InvalidMarksException e) {
            System.out.println(e.getMessage());
        }
    }
}