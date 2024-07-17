// this staircase Problem this problem we can go only 1 steps or 2 steps in our stair as well
//n=1 -> 1 steps
//n=2 -. 2 steps  (1,1) and (2) are two ways
// and the series like 1,2,3,5,8,13,21.... so on


import java.util.Scanner;

public class countWays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of stairs  : ");
        int num = sc.nextInt();
        int Series = NoofSteps(num+1);
        System.out.println(Series);
    }
    public static int NoofSteps(int num) {
        int result=0;
        if(num<=1)
        {
            return num;
        }
        else{
            result=NoofSteps(num-1)+NoofSteps(num-2);
        }
        return result;
    }

}
