package String_practice.level3;
import java.util.*;

public class q_2 {
    public static int getLength(String s) {
        int count=0;
        try {
            while(true) {
                s.charAt(count);
                count++;
            }
        } catch(Exception e) {}
        return count;
    }

    public static char[] uniqueChars(String s) {
        int len=getLength(s);
        char[] res=new char[len];
        int idx=0;
        for(int i=0;i<len;i++) {
            char ch=s.charAt(i);
            boolean found=false;
            for(int j=0;j<i;j++) {
                if(s.charAt(j)==ch) {
                    found=true;
                    break;
                }
            }
            if(!found) res[idx++]=ch;
        }
        return Arrays.copyOf(res,idx);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter string: ");
        String s=sc.nextLine();
        char[] ans=uniqueChars(s);
        System.out.print("unique characters: ");
        for(char c:ans) System.out.print(c+" ");
    }
}

