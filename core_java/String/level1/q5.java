package String_practice.level1;

import java.util.Scanner;
public class q5 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[] arr={10,20,30,40,50};
        System.out.println("enter index to access");
        int index=sc.nextInt();
        try{
            System.out.println("value at index "+index+" is "+arr[index]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("invalid index");
        }
    }
}

