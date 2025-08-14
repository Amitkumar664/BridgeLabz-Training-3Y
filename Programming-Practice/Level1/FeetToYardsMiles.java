import java.util.Scanner;

// Program Name: FeetToYardsMiles
// Purpose: To convert feet to yards and miles

class FeetToYardsMiles {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Variables
        double distanceFeet, distanceYards, distanceMiles;
        int feetPerYard = 3;
        int yardsPerMile = 1760;

        // Input
        System.out.print("Enter distance in feet: ");
        distanceFeet = input.nextDouble();

        // Calculations
        distanceYards = distanceFeet / feetPerYard;
        distanceMiles = distanceYards / yardsPerMile;

        // Output
        System.out.println("The distance in yards is " + distanceYards +
                           " and in miles is " + distanceMiles);

        input.close();
    }
}
