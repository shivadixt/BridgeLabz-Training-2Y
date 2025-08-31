package String_practice.level1;

import java.util.Scanner;
public class q9 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        int count=0,temp=n;
        while(temp>0){
            count++;
            temp/=10;
        }
        int[] digits=new int[count];
        for(int i=0;i<count;i++){
            digits[i]=n%10;
            n/=10;
        }
        System.out.println("reverse number:");
        for(int i=0;i<count;i++){
            System.out.print(digits[i]);
        }
    }
}

