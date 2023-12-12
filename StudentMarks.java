package day2;
public class StudentMarks {
    // Instance variable to store marks
    private int[] marksArray;

    // Constructor to initialize the array
    public StudentMarks() {
        marksArray = new int[5];
    }

    // Method to store marks in the array
    public void setMarks(int[] marks) {
        // Check if the provided array has exactly 5 elements
        if (marks.length == 5) {
            System.arraycopy(marks, 0, marksArray, 0, 5);
            System.out.println("Marks stored successfully.");
        } else {
            System.out.println("Invalid number of subjects. Please provide marks for exactly 5 subjects.");
        }
    }

    // Method to display marks from the array
    public void displayMarks() {
        System.out.println("Student Marks:");
        int subjectNumber = 1;

        // Traverse the array using enhanced for loop
        for (int mark : marksArray) {
            System.out.println("Subject " + subjectNumber + ": " + mark);
            subjectNumber++;
        }
    }

    public static void main(String[] args) {
        // Create an instance of StudentMarks
        StudentMarks student = new StudentMarks();

        // Store marks using setMarks method
        int[] marksData = {75, 80, 90, 85, 88};
        student.setMarks(marksData);

        // Display marks using displayMarks method
        student.displayMarks();
    }
}
