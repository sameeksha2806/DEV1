class InvalidAgeException extends Exception {
    private String message;

    public InvalidAgeException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

// Class to check age eligibility
class AgeChecker {
    void checkAge(int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("Age cannot be negative.");
        } else if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older.");
        } else {
            System.out.println("Age is valid.");
        }
    }
}

// Main class to test custom exception
public class CustomException {
    public static void main(String[] args) {
        AgeChecker ageChecker = new AgeChecker();

        try {
            ageChecker.checkAge(16);  // This will throw an exception
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

       
    }
}