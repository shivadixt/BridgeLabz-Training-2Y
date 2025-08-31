package String_practice.level3;
import java.util.*;

public class q_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter string: ");
        String s=sc.nextLine();
        int len=s.length();
        char ans=0;
        for(int i=0;i<len;i++) {
            char ch=s.charAt(i);
            boolean repeat=false;
            for(int j=0;j<len;j++) {
                if(i!=j && s.charAt(j)==ch) {
                    repeat=true;
                    break;
                }
            }
            if(!repeat) {
                ans=ch;
                break;
            }
        }
        if(ans!=0) System.out.println("first non repeating: "+ans);
        else System.out.println("no non repeating char found");
    }
}

