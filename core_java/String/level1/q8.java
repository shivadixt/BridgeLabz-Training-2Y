package String_practice.level1;

import java.util.Scanner;
public class q8 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        int maxDigit=5;
        int[] digits=new int[maxDigit];
        int index=0;
        while(n>0){
            if(index==maxDigit){
                maxDigit+=10;
                int[] temp=new int[maxDigit];
                for(int i=0;i<digits.length;i++){
                    temp[i]=digits[i];
                }
                digits=temp;
            }
            digits[index]=n%10;
            n=n/10;
            index++;
        }
        int largest=-1,second=-1;
        for(int i=0;i<index;i++){
            if(digits[i]>largest){
                second=largest;
                largest=digits[i];
            }else if(digits[i]>second && digits[i]!=largest){
                second=digits[i];
            }
        }
        System.out.println("largest digit: "+largest);
        System.out.println("second largest digit: "+second);
    }
}

