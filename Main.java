
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // SHOPPING CART PROGRAM
        Scanner scanner = new Scanner(System.in);
        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.println("What item would you like?: ");
        item = scanner.nextLine();

        System.out.println("What is the price for each?: ");
        price = scanner.nextDouble();

        System.out.println("How many would you like?: ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("Your total for " + quantity + " " + item + "/s is: " + currency + total);

        scanner.close();
    }
}

