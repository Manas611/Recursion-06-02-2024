
import java.util.*;

public class Factorial {
    public static int Fact(int n,int[] dp)
    {
        if(n == 0 || n==1)
            return 1;
        
        // Check If already present or not
        if(dp[n] != -1)
        {
            return dp[n];
        }

        // Storing in Dp array
        return dp[n] = n*Fact(n-1, dp);
    }
    public static void main(String[] args) {
        // Take the User Input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for Factorial");
        int n = sc.nextInt();


        // Storing Elements in Array
        int[] dp = new int[1000];

        //Assigning VAlue in dp Array
        for(int i=0;i<100;i++)
        {
            dp[i] = -1;
        }

        // Handling for Negative numbers
        if(n<0)
        {
            System.out.println("Invalid Input");
        }
        else
        {
            int val = Fact(n,dp);
            System.out.println(val);
        }

        sc.close();
    }
}
