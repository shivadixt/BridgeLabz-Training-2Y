import java.util.*;
public class NumbersCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nums[] = new int[5];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                if (nums[i] % 2 == 0) {
                    System.out.println(nums[i] + " is Positive and Even");
                } else {
                    System.out.println(nums[i] + " is Positive and Odd");
                }
            }
            else if (nums[i] < 0) 
            {
                System.out.println(nums[i] + " is Negative");
            }
            else 
            {
                System.out.println(nums[i] + " is Zero");
            }
        }

        if (nums[0] == nums[nums.length - 1]){
            System.out.println("First and Last elements are Equal");
        }
        else if (nums[0] > nums[nums.length - 1]) 
        {
            System.out.println("First element is Greater than Last element");
        }
        else
        {
            System.out.println("First element is Less than Last element");
        }


    }
    
}
