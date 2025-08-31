package String_practice.level1;

import java.util.Scanner;
public class q4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String s=sc.nextLine();
        String res="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z'){
                res+=(char)(ch-32);
            }else if(ch>='A' && ch<='Z'){
                res+=(char)(ch+32);
            }else{
                res+=ch;
            }
        }
        System.out.println("converted string: "+res);
    }
}

