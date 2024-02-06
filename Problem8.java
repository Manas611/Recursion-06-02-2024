import java.util.Scanner;

public class Problem8 {

    public static int solve(int n,int cnt)
    {
        
        int r = n%10;
        n = n/10;
        if(r == 0)
        cnt += 1;
        
        if(n <= 0)
            return cnt;
        
        return solve(n, cnt);

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
