class InvalidPasswordException extends Exception {

    InvalidPasswordException(String message) {
        super(message);
    }

    public static void main(String[] args) {

        String password = "abc123";

        try {
            checkPassword(password);
        }
        catch (InvalidPasswordException e) {
            System.out.println("Password entered: " + password);
            System.out.println(e.getMessage());
        }
    }

    static void checkPassword(String password)
            throws InvalidPasswordException {

        if (password.length() < 8) {
            throw new InvalidPasswordException(
                "Password must contain at least 8 characters"
            );
        }

        System.out.println("Valid Password");
    }
}