import java.util.Scanner;
import java.util.Stack;

public class Problem14 {

    public static void SortStack(Stack<Integer> st)
    {
        if(st.empty())
        {
            return;
        }

        int x = st.pop();

        SortStack(st);

        Stack<Integer> temp = new Stack<>();

        while (!st.empty() && st.peek()>x) {
            temp.push(st.pop());         
        }

        st.push(x);
        while (!temp.empty()) {
            st.push(temp.pop());
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of stack");
        int n = sc.nextInt();
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<n;i++)
        {
            st.push(sc.nextInt());
        }

        SortStack(st);

        System.out.println(st);

        // while (!st.empty()) {
        //     System.out.print(st.peek() + " ");
        //     st.pop();
        // }
        sc.close();

    }
}
