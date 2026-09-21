class InvalidAgeException extends Exception {

    InvalidAgeException(String message) {
        super(message);
    }

    public static void main(String[] args) {

        int age = 15;

        try {
            checkAge(age);
        }
        catch (InvalidAgeException e) {
            System.out.println("Age entered: " + age);
            System.out.println(e.getMessage());
        }
    }

    static void checkAge(int age)
            throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException(
                "Age must be 18 or above"
            );
        }

        System.out.println("Eligible");
    }
}