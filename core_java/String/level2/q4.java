package String_practice.level2;
import java.util.*;

public class q4 {
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
    public static int[] shortestLongest(String[][] arr) {
        int min=Integer.parseInt(arr[0][1]),max=min;
        int minIdx=0,maxIdx=0;
        for(int i=1;i<arr.length;i++) {
            int len=Integer.parseInt(arr[i][1]);
            if(len<min) {min=len;minIdx=i;}
            if(len>max) {max=len;maxIdx=i;}
        }
        return new int[]{minIdx,maxIdx};
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter text: ");
        String s=sc.nextLine();
        String[] w=splitWords(s);
        String[][] arr=wordsWithLength(w);
        int[] ans=shortestLongest(arr);
        System.out.println("shortest: "+arr[ans[0]][0]);
        System.out.println("longest: "+arr[ans[1]][0]);
    }
}

