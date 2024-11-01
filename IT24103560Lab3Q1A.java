import java.util.Scanner;

public class IT24103560Lab3Q1A{
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the price per kg of rice
        System.out.print("Enter the price of 1kg of rice: ");
        double pricePerKg = input.nextDouble();

        // Prompt the user to enter the number of kilograms they want to buy
        System.out.print("Enter the number of kilograms you want to buy: ");
        double kilograms = input.nextDouble();

        // Calculate the total amount
        double totalAmount = pricePerKg * kilograms;

        // Display the total amount
        System.out.println("The total amount is: " + totalAmount);

        // Close the scanner
        input.close();
    }
}