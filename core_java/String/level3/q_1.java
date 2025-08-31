package String_practice.level3;
import java.util.*;

public class q_1 {
    public static String[][] findBMI(double[][] data) {
        String[][] res=new String[data.length][4];
        for(int i=0;i<data.length;i++) {
            double w=data[i][0];
            double h=data[i][1]/100.0;
            double bmi=w/(h*h);
            String status;
            if(bmi<18.5) status="underweight";
            else if(bmi<25) status="normal";
            else if(bmi<30) status="overweight";
            else status="obese";
            res[i][0]=String.format("%.1f",w);
            res[i][1]=String.format("%.1f",data[i][1]);
            res[i][2]=String.format("%.1f",bmi);
            res[i][3]=status;
        }
        return res;
    }

    public static void display(String[][] arr) {
        System.out.println("weight height bmi status");
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<4;j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double[][] data=new double[10][2];
        for(int i=0;i<10;i++) {
            System.out.print("enter weight of person "+(i+1)+": ");
            data[i][0]=sc.nextDouble();
            System.out.print("enter height of person "+(i+1)+" in cm: ");
            data[i][1]=sc.nextDouble();
        }
        String[][] ans=findBMI(data);
        display(ans);
    }
}

