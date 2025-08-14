// Program Name: AverageMarksPCM
// Purpose: To find Sam's average mark in PCM subjects

class AverageMarksPCM {
    public static void main(String[] args) {

        // Fixed values
        String name = "Sam";
        int marksMaths = 94;
        int marksPhysics = 95;
        int marksChemistry = 96;
        int totalSubjects = 3;

        // Result variable
        double averageMarks = (marksMaths + marksPhysics + marksChemistry) / (double) totalSubjects;

        // Output
        System.out.println(name + "'s average mark in PCM is " + averageMarks);
    }
}

