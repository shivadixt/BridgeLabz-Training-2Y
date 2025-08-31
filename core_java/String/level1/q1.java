package String_practice.level1;

import java.util.Scanner;
public class q1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first string");
        String s1=sc.next();
        System.out.println("enter second string");
        String s2=sc.next();
        boolean res1=compareStrings(s1,s2);
        boolean res2=s1.equals(s2);
        System.out.println("result using charat method: "+res1);
        System.out.println("result using equals method: "+res2);
        if(res1==res2){
            System.out.println("both results are same");
        }else{
            System.out.println("results are different");
        }
    }

    static boolean compareStrings(String a,String b){
        if(a.length()!=b.length()){
            return false;
        }
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=b.charAt(i)){
                return false;
            }
        }
        return true;
    }
}

