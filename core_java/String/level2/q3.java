package String_practice.level2;

import java.util.*;

public class q3 {
    public static String[] splitWords(String s) {
        int n=s.length(),count=1;
        for(int i=0;i<n;i++) if(s.charAt(i)==' ') count++;
        String[] words=new String[count];
        int start=0,idx=0;
        for(int i=0;i<n;i++) {
            if(s.charAt(i)==' ') {
                words[idx++]=s.substring(start,i);
                start=i+1;
            }
        }
        words[idx]=s.substring(start);
        return words;
    }
    public static int getLength(String s) {
        int c=0;
        try {
            while(true) {
                s.charAt(c);
                c++;
            }
        } catch(Exception e) {}
        return c;
    }
    public static String[][] wordsWithLength(String[] w) {
        String[][] arr=new String[w.length][2];
        for(int i=0;i<w.length;i++) {
            arr[i][0]=w[i];
            arr[i][1]=String.valueOf(getLength(w[i]));
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter text: ");
        String s=sc.nextLine();
        String[] w=splitWords(s);
        String[][] res=wordsWithLength(w);
        for(int i=0;i<res.length;i++) {
            System.out.println(res[i][0]+"\t"+Integer.parseInt(res[i][1]));
        }
    }
}

