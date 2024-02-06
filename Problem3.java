import java.util.Scanner;

public class Problem3 {

    public static int solve(String s,int i,int n,int ans)
    {
        if(i==n)
            return ans;
        
        int val = (s.charAt(i)-'0');
        ans = (10*ans) + val;
        return solve(s, i+1, n, ans);
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking input from user
        System.out.println("Enter the String");
        String s = sc.next();

        int n = s.length();

        int val = solve(s,0,n,0);

        // int val = s.charAt(0) - '0';
        System.out.println(val);
        sc.close();
    }
}
