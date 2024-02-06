public class Problem9 {

    public static int solve(int[] arr,int prev,int i,int n)
    {
        if(i == n)
            return 0;
        int len = 0 + solve(arr, prev, i+1, n);
        if(prev == -1 || arr[prev] < arr[i])
        {
            len = 1 + solve(arr, i, i+1, n);
        }
        return len;
    }
    public static void main(String[] args) {
        int[] arr = {1,1};
        int n = arr.length;

        int ans = solve(arr,-1,0,n);
        System.out.println(ans);
    }
}
