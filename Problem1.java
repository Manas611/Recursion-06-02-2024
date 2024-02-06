import java.util.Scanner;

public class Problem1 {

    public static float solve(int k,int i,float ans)
    {
        // BAse condition
        if( i == k+1)
            return ans;
        
        // Calculating the value for recursive calls
        float val = (float)(Math.pow(2.0, i));
        val = 1/val; 
        ans = ans + val;
        return solve(k, i+1, ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking input from user
        System.out.println("Enter the number");
        int k = sc.nextInt();

        // Calling the recursive function and storing its value
        float val = solve(k,1,1.0f);
        System.out.println(val);

        sc.close();
    }
}
