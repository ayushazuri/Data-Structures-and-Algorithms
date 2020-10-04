import java.util.Scanner;

public class insertion_sort {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        long a[] = new long[n];
        for(int i = 0;i < n;i++)
        {
            a[i] = sc.nextLong();
        }

        for(int i = 0; i < n; i++)
        {
            long current = a[i];
            int j = i;

            while(j > 0 && a[j - 1] > a[j])
            {
                long t = a[j];
                a[j] = a[j - 1];
                a[j - 1] = t;
                j--;

            }


        }
        for(int i = 0;i<n;i++)
            System.out.println(a[i]);
    }
}
