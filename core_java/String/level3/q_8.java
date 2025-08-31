package String_practice.level3;
import java.util.*;

public class q_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter string: ");
        String s=sc.nextLine();
        String res="";
        for(int i=0;i<s.length();i++) {
            char ch=s.charAt(i);
            if(res.indexOf(ch)==-1) res+=ch;
        }
        System.out.println("after removing duplicates: "+res);
    }
}

