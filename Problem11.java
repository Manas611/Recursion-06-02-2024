import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Problem11 {

    public static void Reverse(Queue<Integer> q)
    {
        if(q.size() == 0)
            return;
        
        int x = q.remove();

        Reverse(q);

        q.add(x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of queue");
        int n = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();

        for(int i=0;i<n;i++)
        {
            q.add(sc.nextInt());
        }

        Reverse(q);
        System.out.println(q);
        sc.close();
    }
}
