import java.util.*;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = sc.nextLong();
        String numStr = Long.toString(number);
        int[] digits = new int[numStr.length()];

        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0'; 
        }
        int[] freq = new int[10];

        for (int d : digits) {
            freq[d]++;
        }
        System.out.println("Digit Frequency in number " + number + ":");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " occurs " + freq[i] + " times.");
            }
        }
    }
}
