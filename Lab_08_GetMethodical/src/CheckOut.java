import java.util.Scanner;

public class CheckOut {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        boolean moreItems = true;

        do {
            // Prompt for the price of the item using getRangedDouble
            double price = SafeInput.getRangedDouble(scanner, "Enter the price of the item (0.50 to 10.00): ", 0.50, 10.00);
            total = total + price;

            // Ask if the user has more items using getYNConfirm
            moreItems = SafeInput.getYNConfirm(scanner, "Do you have more items? (Y/N): ");
        }while (moreItems);

        // Display the total cost to 2 decimal places
        System.out.printf("Total cost of items: $%.2f\n", total);

        scanner.close();
    }
}