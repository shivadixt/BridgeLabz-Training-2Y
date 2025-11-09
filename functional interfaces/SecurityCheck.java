interface SensitiveData {} // Custom marker interface

class UserCredentials implements SensitiveData {
    String username = "admin";
    String password = "12345";
}

public class SecurityCheck {
    public static void main(String[] args) {
        UserCredentials user = new UserCredentials();

        if (user instanceof SensitiveData) {
            System.out.println("Encrypting sensitive data...");
        }
    }
}

