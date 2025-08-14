import java.util.Scanner;

// Program Name: BasicCalculator
// Purpose: Perform addition, subtraction, multiplication, and division on two numbers
class BasicCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take inputs
        System.out.print("Enter first number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();

        // Perform calculations
        double sum = number1 + number2;
        double difference = number1 - number2;
        double product = number1 * number2;
        double quotient = number1 / number2;

        // Display results
        System.out.println("For numbers " + number1 + " and " + number2 + ":");
        System.out.println("Addition = " + sum);
        System.out.println("Subtraction = " + difference);
        System.out.println("Multiplication = " + product);
        System.out.println("Division = " + quotient);

        input.close();
    }
}
