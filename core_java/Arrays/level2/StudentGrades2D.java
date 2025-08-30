import java.util.*;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3];
        double[] percentage = new double[n];
        char[] grade = new char[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));
            
            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                int m;
                while (true) {
                    System.out.print(subject + ": ");
                    m = sc.nextInt();
                    if (m >= 0) break; 
                    else System.out.println("Marks cannot be negative! Enter again.");
                }
                marks[i][j] = m; 
            }

            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            if (percentage[i] >= 80) grade[i] = 'A';
            else if (percentage[i] >= 70) grade[i] = 'B';
            else if (percentage[i] >= 60) grade[i] = 'C';
            else if (percentage[i] >= 50) grade[i] = 'D';
            else if (percentage[i] >= 40) grade[i] = 'E';
            else grade[i] = 'R';
        }
        System.out.println("Student Report");
        System.out.println("ID\tPhysics\tChemistry\tMaths\t%age\tGrade");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "\t" +
                               marks[i][0] + "\t" +
                               marks[i][1] + "\t\t" +
                               marks[i][2] + "\t" +
                               String.format("%.2f", percentage[i]) + "\t" +
                               grade[i]);
        }
    }
}
