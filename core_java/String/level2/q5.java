package String_practice.level2;
import java.util.*;

public class q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter string: ");
        String s=sc.nextLine().toLowerCase();
        int v=0,c=0;
        for(int i=0;i<s.length();i++) {
            char ch=s.charAt(i);
            if(ch>='a'&&ch<='z') {
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') v++;
                else c++;
            }
        }
        System.out.println("vowels: "+v);
        System.out.println("consonants: "+c);
    }
}

