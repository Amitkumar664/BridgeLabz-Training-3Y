import java.util.Scanner;

// Program Name: PurchasePrice
// Purpose: Calculate total purchase price from unit price and quantity
class PurchasePrice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Inputs
        System.out.print("Enter unit price: ");
        double unitPrice = input.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        // Calculation
        double totalPrice = unitPrice * quantity;

        // Output
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity is " +
                           quantity + " and unit price is INR " + unitPrice);

        input.close();
    }
}
