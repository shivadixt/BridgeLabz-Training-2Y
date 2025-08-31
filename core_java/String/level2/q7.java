package String_practice.level2;
import java.util.*;

public class q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter name of first person: ");
        String n1=sc.nextLine();
        System.out.print("enter age of first person: ");
        int a1=sc.nextInt();
        sc.nextLine();
        System.out.print("enter name of second person: ");
        String n2=sc.nextLine();
        System.out.print("enter age of second person: ");
        int a2=sc.nextInt();
        if(a1>a2) System.out.println(n1+" is older");
        else if(a2>a1) System.out.println(n2+" is older");
        else System.out.println("both are of same age");
    }
}
