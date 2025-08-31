package String_practice.level1;

import java.util.Scanner;
public class q2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter main string");
        String s1=sc.nextLine();
        System.out.println("enter substring");
        String s2=sc.nextLine();
        int count=0;
        for(int i=0;i<=s1.length()-s2.length();i++){
            String sub=s1.substring(i,i+s2.length());
            if(sub.equals(s2)){
                count++;
            }
        }
        System.out.println("occurrence count: "+count);
    }
}
