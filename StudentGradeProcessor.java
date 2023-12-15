package day5;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Objects;

public class StudentGradeProcessor {

    public static void main(String[] args) {
        Set<Student1> s1 = new HashSet<>();
        s1.add(new Student1("Shashank", 1, 90));
        s1.add(new Student1("Nikhil", 2, 40));
        s1.add(new Student1("Karan", 3, 50));
        s1.add(new Student1("Karan", 1, 10));

        Map<Integer, String> m = new TreeMap<>();
        for (Student1 s : s1) {
            if (s.getTotalMarks() >= 60 && s.getTotalMarks() <= 100) {
                m.put(s.getRollNumber(), "A");
            } else if (s.getTotalMarks() >= 40 && s.getTotalMarks() < 60) {
                m.put(s.getRollNumber(), "B");
            } else if (s.getTotalMarks() >= 0 && s.getTotalMarks() < 40) {
                m.put(s.getRollNumber(), "C");
            } else {
                System.out.println("Please check your total marks !!");
            }
        }

        for (Map.Entry<Integer, String> entry : m.entrySet()) {
            System.out.println(" Roll number : " + entry.getKey() + " Grade : " + entry.getValue());
        }
    }
}


class Student1 {
    private String name;
    private int rollNumber;
    private int totalMarks;

    public Student1(String name, int rollNumber, int totalMarks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.totalMarks = totalMarks;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    // add toString() method
    @Override
    public String toString() {
        return "Student name = " + name + ", rollNumber = " + rollNumber;
    }

    // add appropriate method for avoiding duplicate Student
    @Override
    public int hashCode() {
        return rollNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student1 s = (Student1) o;
        return rollNumber == s.rollNumber || Objects.equals(getName(), s.name);
    }
}