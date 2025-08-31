package String_practice.level3;
import java.util.*;

public class q_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter string: ");
        String s=sc.nextLine();
        int len=s.length();
        boolean pal=true;
        for(int i=0;i<len/2;i++) {
            if(s.charAt(i)!=s.charAt(len-1-i)) {
                pal=false;
                break;
            }
        }
        if(pal) System.out.println("palindrome");
        else System.out.println("not palindrome");
    }
}
