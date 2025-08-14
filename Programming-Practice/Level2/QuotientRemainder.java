import java.util.Scanner;

// Program Name: QuotientRemainder
// Purpose: Find quotient and remainder of two integers
class QuotientRemainder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Inputs
        System.out.print("Enter first integer: ");
        int number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int number2 = input.nextInt();

        // Calculations
        int quotient = number1 / number2;
        int remainder = number1 % number2;

        // Output
        System.out.println("For numbers " + number1 + " and " + number2 + ":");
        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);

        input.close();
    }
}
