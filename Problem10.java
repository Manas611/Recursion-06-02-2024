import java.util.Scanner;

public class Problem10 {

    public static int Fact(int n)
    {
        if(n == 0 || n==1)
            return 1;
        
        // Storing in Dp array
        return n*Fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking input from user
        System.out.println("Enter the Two number");
        int n = sc.nextInt();
        int r = sc.nextInt();

        int upper = Fact(n);
        int lower1 = Fact(r);
        int lower2 = Fact(n-r);

        lower2 = lower1*lower2;
        int ans = upper/lower2;

        System.out.println(ans);
        sc.close();

    }
}
