import java.util.Scanner;
import java.util.Arrays;

class Student {
    String name;
    int rollNumber;
    int[] marks;

    public Student(String name, int rollNumber, int[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public int calculateTotalMarks() {
        int total = 0;
        for (int mark : this.marks) {
            total += mark;
        }
        return total;
    }

    public void displayStudentDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Roll No: " + this.rollNumber);
        
        String marksStr = Arrays.toString(this.marks)
                                .replace("[", "")
                                .replace("]", "");
        System.out.println("Marks: " + marksStr);
        
        System.out.println("Total Marks: " + calculateTotalMarks());
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); 

        Student[] students = new Student[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Roll No: ");
            int rollNo = scanner.nextInt();
            
            int[] marks = new int[3];
            System.out.print("Marks in 3 subjects: ");
            for (int j = 0; j < 3; j++) {
                marks[j] = scanner.nextInt();
            }
            scanner.nextLine(); 
            
            students[i] = new Student(name, rollNo, marks);
        }

        System.out.println("\nStudent Details:");
        for (Student student : students) {
            student.displayStudentDetails();
            System.out.println(); 
        }

        scanner.close();
    }
}
