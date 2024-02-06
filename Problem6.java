import java.util.Scanner;

public class Problem6 {

    public static int solve(int n,int res)
    {
        if(n == 0)
            return res;
        
        int r = n%10;
        n = n/10;
        res = res + r;

        return solve(n, res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking input from user
        System.out.println("Enter the number");
        int n = sc.nextInt();

        int ans = solve(n,0);
        System.out.println(ans);
        sc.close();
    }
}
