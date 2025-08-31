package String_practice.level2;
import java.util.*;

public class q6 {
    public static String trimSpaces(String s) {
        int start=0,end=s.length()-1;
        while(start<=end&&s.charAt(start)==' ') start++;
        while(end>=start&&s.charAt(end)==' ') end--;
        return s.substring(start,end+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter string: ");
        String s=sc.nextLine();
        System.out.println("trimmed: '"+trimSpaces(s)+"'");
    }
}

