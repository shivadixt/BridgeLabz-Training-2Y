package String_practice.level2;

import java.util.*;

public class q9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number of students: ");
        int n=sc.nextInt();
        int[] p=new int[n];
        int[] c=new int[n];
        int[] m=new int[n];
        int[] res=new int[n];
        String[] grade=new String[n];
        for(int i=0;i<n;i++) {
            System.out.print("enter physics marks for student "+(i+1)+": ");
            p[i]=sc.nextInt();
            System.out.print("enter chemistry marks for student "+(i+1)+": ");
            c[i]=sc.nextInt();
            System.out.print("enter maths marks for student "+(i+1)+": ");
            m[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++) {
            res[i]=(p[i]+c[i]+m[i])/3;
            if(res[i]>80) grade[i]="a";
            else if(res[i]>=70) grade[i]="b";
            else if(res[i]>=60) grade[i]="c";
            else if(res[i]>=50) grade[i]="d";
            else if(res[i]>=40) grade[i]="e";
            else grade[i]="r";
        }
        for(int i=0;i<n;i++) {
            System.out.println("student "+(i+1));
            System.out.println("physics: "+p[i]+" chemistry: "+c[i]+" maths: "+m[i]);
            System.out.println("percentage: "+res[i]+"%");
            System.out.println("grade: "+grade[i]);
        }
    }
}

