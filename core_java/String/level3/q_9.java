package String_practice.level3;
import java.util.*;

public class q_9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter string: ");
        String s=sc.nextLine();
        String[] words=s.split(" ");
        for(int i=0;i<words.length;i++) {
            String w=words[i];
            String rev="";
            for(int j=w.length()-1;j>=0;j--) rev+=w.charAt(j);
            System.out.print(rev+" ");
        }
    }
}

