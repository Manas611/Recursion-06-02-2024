import java.util.Scanner;

public class Problem4 {

    public static String solve(String s,int i,int n,String out)
    {
        // Adding the character in Final String
        out = out + s.charAt(i);

        // Base condition 
        if(i==n-1)
            return out;

        // Condition if both character are equal
        if(s.charAt(i) == s.charAt(i+1))
            out = out + '*';
        
        // Recursive Calls
        return solve(s, i+1, n, out);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking input from user
        System.out.println("Enter the String");
        String s = sc.next();

        int n = s.length();

        // Calling the Recursive function
        String ans = solve(s,0,n,"");
        System.out.println(ans);
        sc.close();
    }
}
