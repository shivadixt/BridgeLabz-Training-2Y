import java.util.*;

public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();
        double[][] personData = new double[number][3];  
        String[] weightStatus = new String[number];      
        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter details for person " + (i + 1));
            double w;
            while (true) {
                System.out.print("Weight (kg): ");
                w = sc.nextDouble();
                if (w > 0) break;  
                else System.out.println("Please enter a positive weight!");
            }
            double h;
            while (true) {
                System.out.print("Height (m): ");
                h = sc.nextDouble();
                if (h > 0) break;
                else System.out.println("Please enter a positive height!");
            }
            personData[i][0] = w;  
            personData[i][1] = h;
            double bmi = w / (h * h);
            personData[i][2] = bmi;
            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) +
                " | Weight: " + personData[i][0] + "kg" +
                " | Height: " + personData[i][1] + "m" +
                " | BMI: " + String.format("%.2f", personData[i][2]) +
                " | Status: " + weightStatus[i]);
        }
    }
}
