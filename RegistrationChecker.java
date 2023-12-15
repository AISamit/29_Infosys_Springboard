package day4;
public class RegistrationChecker {
    public static void main(String[] args) {
        // Create two student registration objects
        StudentRegistration student1 = new StudentRegistration("Peter", 23, 5001);
        StudentRegistration student2 = new StudentRegistration("Peter", 24, 5003);

        // Generate roll number for both students
        student1.generateRollNumber();
        student2.generateRollNumber();

        // Display student details
        displayStudentDetails(student1);
        displayStudentDetails(student2);

        // Compare objects and display the result
        if (student1.equals(student2)) {
            System.out.println("Objects are equal.");
        } else {
            System.out.println("Objects are not equal.");
        }
    }

    private static void displayStudentDetails(StudentRegistration student) {
        System.out.println("Student Details");
        System.out.println("Name: " + student.getStudentName());
        System.out.println("Admission Number: " + student.getAdmissionNumber());
        System.out.println("Roll Number: " + student.getRollNumber());
        System.out.println();
    }
}

class StudentRegistration {
    private String studentName;
    private double age;
    private int admissionNumber;
    private int rollNumber;
    private static int counter = 1001;

    public StudentRegistration(String studentName, double age, int admissionNumber) {
        this.studentName = studentName;
        this.age = age;
        this.admissionNumber = admissionNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getAge() {
        return age;
    }

    public int getAdmissionNumber() {
        return admissionNumber;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void generateRollNumber() {
        if (rollNumber == 0) {
            rollNumber = counter++;
        } else {
            System.out.println("Roll number already generated for the student.");
        }
    }

    @Override
    public int hashCode() {
        return studentName.hashCode() + Double.hashCode(age) + admissionNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        StudentRegistration that = (StudentRegistration) obj;
        return studentName.equals(that.studentName) &&
               age == that.age &&
               admissionNumber == that.admissionNumber;
    }
}