import java.util.Scanner;

public class Problem7 {

    public static int solve(int n,int m,int ans)
    {
        if(n==0)
            return ans;
         ans = ans + m;
         return solve(n-1, m, ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking input from user
        System.out.println("Enter the Two number");
        int n = sc.nextInt();
        int m = sc.nextInt();

        int ans = solve(n,m,0);
        System.out.println(ans);

        sc.close();
    }
}
