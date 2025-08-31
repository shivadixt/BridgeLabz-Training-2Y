package String_practice.level1;

import java.util.Scanner;
public class q6 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter numerator");
        int a=sc.nextInt();
        System.out.println("enter denominator");
        int b=sc.nextInt();
        try{
            int res=a/b;
            System.out.println("result: "+res);
        }catch(ArithmeticException e){
            System.out.println("cannot divide by zero");
        }
    }
}

