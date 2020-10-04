import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class priorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

//        pq.add(22);
//        pq.add(44);
//        pq.add(11);
//        pq.add(33);
//
//        System.out.println(pq);
//        System.out.println(pq.remove());
//        System.out.println(pq.remove());
//        System.out.println(pq.remove());
//        System.out.println(pq.remove());

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a[] = new int[n];

        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++)
        {
            if(i < k)
            {
                pq.add(a[i]);
            }
            else
            {
                if(pq.peek() < a[i])
                {
                    pq.remove();
                    pq.add(a[i]);
                }
            }
        }

        ArrayList<Integer> al = new ArrayList<Integer>(pq);
        Collections.sort(al, Collections.reverseOrder());

        for(int i: al)
        {
            System.out.println(i);
        }


    }
}
