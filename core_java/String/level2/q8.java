package String_practice.level2;

import java.util.*;

public class q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        System.out.print("enter rock, paper or scissors: ");
        String user=sc.nextLine().toLowerCase();
        String[] opts={"rock","paper","scissors"};
        String comp=opts[r.nextInt(3)];
        System.out.println("computer chose: "+comp);
        if(user.equals(comp)) System.out.println("draw");
        else if(user.equals("rock")&&comp.equals("scissors")||
                user.equals("paper")&&comp.equals("rock")||
                user.equals("scissors")&&comp.equals("paper"))
            System.out.println("you win");
        else System.out.println("computer wins");
    }
}

