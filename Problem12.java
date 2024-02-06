public class Problem12 {

    public static String rem(String s)
    {
        String ans = "";
        int n = s.length();
        int i = 0;
        while (i<n) {
            if(i<n-1 && s.charAt(i) == s.charAt(i+1))
            {
                while (i<n-1 && s.charAt(i) == s.charAt(i+1)) {
                    i++;
                }
            }
            else
            {
                ans = ans + s.charAt(i);
            }
            i++;
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "acaaabbbacdddd";

        String s1 = "";
        while(s.length() != s1.length())
        {
            s1 = s;
            s = rem(s);
        }

        System.out.println(s);
    }
}
