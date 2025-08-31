package String_practice.level3;
import java.util.*;

public class q_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter string: ");
        String s=sc.nextLine();
        int len=s.length();
        boolean[] visited=new boolean[len];
        for(int i=0;i<len;i++) {
            if(visited[i]) continue;
            char ch=s.charAt(i);
            int count=1;
            for(int j=i+1;j<len;j++) {
                if(s.charAt(j)==ch) {
                    visited[j]=true;
                    count++;
                }
            }
            System.out.println(ch+" : "+count);
        }
    }
}

