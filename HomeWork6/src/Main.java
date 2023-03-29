class WrongLoginException extends Exception {
    public WrongLoginException() {
        super();
    }

    public WrongLoginException(String message) {
        super(message);
    }
}

class WrongPasswordException extends Exception {
    public WrongPasswordException() {
        super();
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}

public class Main {
    public static boolean checkCredentials(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login == null || !login.contains("_") || login.length() > 20) {
            throw new WrongLoginException("Invalid login");
        }
        if (password == null || !password.contains("_") || !password.contains("!") || password.length() > 20 || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Invalid password or passwords do not match");
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Starting homework6 ...");
        String login = "test_user";
        String password = "test_password!";
        String confirmPassword = "test_password!";

        try {
            boolean result = checkCredentials(login, password, confirmPassword);
            System.out.println("Credentials are valid: " + result);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}
