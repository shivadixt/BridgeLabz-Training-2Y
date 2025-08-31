package String_practice.level2;
import java.util.*;

public class q2 {
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

    public static String[] mySplit(String s) {
        int len = myLength(s);
        int space = 1;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == ' ') space++;
        }
        String[] words = new String[space];
        int w = 0;
        String temp = "";
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == ' ') {
                words[w++] = temp;
                temp = "";
            } else {
                temp += s.charAt(i);
            }
        }
        words[w] = temp;
        return words;
    }

    public static boolean compare(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter text: ");
        String s = sc.nextLine();
        String[] a1 = mySplit(s);
        String[] a2 = s.split(" ");
        System.out.println("equal: " + compare(a1, a2));
    }
}

