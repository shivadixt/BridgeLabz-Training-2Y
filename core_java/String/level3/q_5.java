package String_practice.level3;
import java.util.*;

public class q_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first string: ");
        String s1=sc.nextLine();
        System.out.print("enter second string: ");
        String s2=sc.nextLine();
        if(s1.length()!=s2.length()) {
            System.out.println("not a rotation");
            return;
        }
        String check=s1+s1;
        if(check.contains(s2)) System.out.println("rotation");
        else System.out.println("not a rotation");
    }
}

