import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String correctUsername = "hema";
        String correctPassword = "1234";
        double balance = 5000.0;

        int attempts = 0;
        boolean loggedIn = false;

        System.out.println("===== Welcome to ATM =====");

        while (attempts < 3) {
            System.out.print("Enter username: ");
            String inputUsername = scanner.nextLine();

            System.out.print("Enter password: ");
            String inputPassword = scanner.nextLine();

            if (inputUsername.equals(correctUsername)) {
                if (inputPassword.equals(correctPassword)) {
                    System.out.println("✅ Login successful! Welcome, " + inputUsername);
                    loggedIn = true;
                    break;
                } else {
                    System.out.println("❌ Incorrect password.");
                }
            } else {
                System.out.println("❌ Username not found.");
            }

            attempts++;
            if (attempts < 3) {
                System.out.println("⚠️ Attempts left: " + (3 - attempts));
            } else {
                System.out.println("🚫 Account locked after 3 failed attempts.");
            }
        }

        // After successful login
        if (loggedIn) {
            System.out.println("💰 Your current balance is: $" + balance);
            System.out.println("✅ Thank you for using the ATM.");
        }

        scanner.close();
    }
}
