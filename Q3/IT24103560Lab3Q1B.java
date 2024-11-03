import java.util.Scanner;

public class IT24103560Lab3Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for total bill amount
        System.out.print("Enter the total bill amount: ");
        double totalBill = scanner.nextDouble();

        // Calculate 10% discount
        double discount = totalBill * 0.10;

        // Calculate amount to pay after discount
        double amountToPay = totalBill - discount;

        // Display results
        System.out.println("Total Bill: $" + totalBill);
        System.out.println("Discount: $" + discount);
        System.out.println("Amount to Pay after Discount: $" + amountToPay);

        scanner.close();
    }
}


                  