import java.util.Scanner;

public class quickSort
{
    static void quicksort(long[] a, int p, int q)
    {
        if(p > q)
            return;

        int r = partition(a, p, q);
        quicksort(a, p, r - 1);
        quicksort(a, r + 1, q);
    }

    static int partition(long[] a, int p, int q)
    {
        int pivot = q;
        int i = p - 1;
        for(int j = p;j <= q; j++)
        {
            if(a[j] <= a[pivot])
            {
                i++;
                long t = a[i];
                a[i] = a[j];
                a[j] = t;
            }

        }
        return i;
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

        quicksort(a, 0, a.length - 1);

        print(a);

    }
}
