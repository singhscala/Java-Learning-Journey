package cdac.coreJava.day10.Assignment.ExceptionHandling;

public class Security {

    public static void checkPassword(String password) throws Exception {
        if (password == null || password.isEmpty()) {
            throw new Exception("Authentication failure: Password cannot be empty.");
        }
        System.out.println("Password check successful.");
    }

    public static void processData(String password) {
        try {
            checkPassword(password);
            System.out.println("Data successfully processed.");
        } catch (Exception e) {
            System.out.println("Log: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        try {
            processData("secret");
            processData(null);
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
}