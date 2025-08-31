package String_practice.level1;

import java.util.Scanner;
public class q7 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String[] names={"amar","akbar","anthony"};
        int[] age=new int[3];
        int[] height=new int[3];
        for(int i=0;i<3;i++){
            System.out.println("enter age of "+names[i]);
            age[i]=sc.nextInt();
            System.out.println("enter height of "+names[i]);
            height[i]=sc.nextInt();
        }
        int minAge=age[0],young=0;
        int maxHeight=height[0],tall=0;
        for(int i=1;i<3;i++){
            if(age[i]<minAge){
                minAge=age[i];
                young=i;
            }
            if(height[i]>maxHeight){
                maxHeight=height[i];
                tall=i;
            }
        }
        System.out.println("youngest: "+names[young]);
        System.out.println("tallest: "+names[tall]);
    }
}

