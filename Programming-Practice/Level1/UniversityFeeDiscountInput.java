import java.util.Scanner;

// Program Name: UniversityFeeDiscountInput
// Purpose: To calculate discount amount and final fee using user input

class UniversityFeeDiscountInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Variable declaration
        double fee, discountPercent, discountAmount, finalFee;

        // Input
        System.out.print("Enter Student Fee (INR): ");
        fee = input.nextDouble();
        System.out.print("Enter Discount Percent: ");
        discountPercent = input.nextDouble();

        // Calculation
        discountAmount = (fee * discountPercent) / 100;
        finalFee = fee - discountAmount;

        // Output
        System.out.println("The discount amount is INR " + discountAmount +
                           " and final discounted fee is INR " + finalFee);

        input.close();
    }
}
