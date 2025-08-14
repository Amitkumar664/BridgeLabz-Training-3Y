import java.util.Scanner;

// Program Name: HeightConverter
// Purpose: To convert height in centimeters to feet and inches

class HeightConverter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Variables
        double heightCm;
        double cmPerInch = 2.54;
        int inchesPerFoot = 12;

        // Input
        System.out.print("Enter your height in centimeters: ");
        heightCm = input.nextDouble();

        // Conversion
        double totalInches = heightCm / cmPerInch;
        int feet = (int) (totalInches / inchesPerFoot);
        double inches = totalInches % inchesPerFoot;

        // Output
        System.out.println("Your Height in cm is " + heightCm +
                           " while in feet is " + feet +
                           " and inches is " + inches);

        input.close();
    }
}
