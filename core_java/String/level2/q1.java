package String_practice.level2;
import java.util.*;

public class q1 {
    public static int myLength(String s) {
        int c = 0;
        try {
            while (true) {
                s.charAt(c);
                c++;
            }
        } catch (Exception e) {
        }
        return c;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter string: ");
        String s = sc.next();
        int len1 = myLength(s);
        int len2 = s.length();
        System.out.println("custom length: " + len1);
        System.out.println("builtin length: " + len2);
    }
}

