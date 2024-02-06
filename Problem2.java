import java.util.Scanner;

public class Problem2 {

    public static boolean solve(String s, int i, int j)
    {
        // if pointer paases each other then True
        if(i>=j)
            return true;
        
        // False if character is unmatched
        if(s.charAt(i) != s.charAt(j))
            return false;
        
        // Recursive calls
        return solve(s, i+1, j-1);
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking input from user
        System.out.println("Enter the String");
        String s = sc.next();

        int n = s.length();

        // calling the recurive function
        boolean val =  solve(s,0,n-1);
        System.out.println(val);

        sc.close();
    }
}
