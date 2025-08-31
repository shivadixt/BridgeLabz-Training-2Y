package String_practice.level3;
import java.util.*;

public class q_10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first string: ");
        String s1=sc.nextLine().toLowerCase();
        System.out.print("enter second string: ");
        String s2=sc.nextLine().toLowerCase();
        if(s1.length()!=s2.length()) {
            System.out.println("not anagram");
            return;
        }
        char[] a1=s1.toCharArray();
        char[] a2=s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        if(Arrays.equals(a1,a2)) System.out.println("anagram");
        else System.out.println("not anagram");
    }
}

