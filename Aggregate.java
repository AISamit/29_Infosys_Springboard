package day4;
// Main.java
public class Aggregate {
    public static void main(String[] args) {
        // Example usage for Intern
        Intern intern1 = new Intern(5000, 500);
        System.out.println("Intern 1: The total aggregate percentage secured is " + intern1.calcPercentage());

        Intern intern2 = new Intern(8000, 500);
        System.out.println("Intern 2: The total aggregate percentage secured is " + intern2.calcPercentage());

        // Example usage for Trainee
        Trainee trainee = new Trainee(6000);
        System.out.println("Trainee: The total aggregate percentage secured is " + trainee.calcPercentage());
    }
}

interface DataProvider {
    int TOTAL_MAXIMUM_MARKS = 8000;
    int COURSE_MARKS_A = 900;
    int CO_CURRICULAR_MARKS_A = 100;
    int COURSE_MARKS_B = 1000;
}

// Intern.java
class Intern implements DataProvider {
    private int marksSecured;
    private int graceMarks;

    // Constructor
    public Intern(int marksSecured, int graceMarks) {
        this.marksSecured = marksSecured;
        this.graceMarks = graceMarks;
    }

    // Method to calculate overall percentage
    public double calcPercentage() {
        int totalMarks = marksSecured + graceMarks + CO_CURRICULAR_MARKS_A;
        if (totalMarks > TOTAL_MAXIMUM_MARKS) {
            System.out.println("Please enter the correct marks");
       		return 0;
        }else{
        return ((double) totalMarks / TOTAL_MAXIMUM_MARKS) * 100;
    }}
}

// Trainee.java
class Trainee implements DataProvider {
    private int marksSecured;

    // Constructor
    public Trainee(int marksSecured) {
        this.marksSecured = marksSecured;
    }

    // Method to calculate overall percentage
    public double calcPercentage() {
        int totalMarks = marksSecured + COURSE_MARKS_B;
        return ((double) totalMarks / TOTAL_MAXIMUM_MARKS) * 100;
    }
}