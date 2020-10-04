import java.util.*;
import java.io.*;

public class quicksort3
{
    private static Random random = new Random();

    static void quicksort3(long[] a, int p, int q)
    {
        if(p > q)
            return;

        int k = random.nextInt(q - p + 1) + p;
        long t = a[p];
        a[p] = a[k];
        a[k] = t;
        int r[] = partition(a, p, q);
        quicksort3(a, p, r[0] - 1);
        quicksort3(a, r[1] + 1, q);
    }

    static int[] partition(long[] a, int p, int q)
    {
        int m1, m2;
        m1 = p;
        m2 = q;
        int pivot = q;
        int i = p;
        int m[] = {m1, m2} ;
        while(i <= m2)
        {
            if(a[i] < a[pivot])
            {
                long t = a[i];
                a[i] = a[m1];
                a[m1] = t;
                m1++;
                i++;
            }
            else if(a[i] == a[pivot])
            {
                i++;
            }
            else
            {
                long t = a[i];
                a[i] = a[m2];
                a[m2] = t;
                m2--;
            }
            m[0] = m1;
            m[1] = m2;

        }


        return m;
    }

    static void print(long[] a)
    {
        for(long i : a)
        {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];

        for(int i=0; i<n; i++)
        {
            a[i] = sc.nextLong();
        }

        quicksort3(a, 0, a.length - 1);

        print(a);

    }
}
