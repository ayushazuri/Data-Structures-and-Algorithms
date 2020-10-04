import java.util.Scanner;

public class Selection_Sort
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        n = sc.nextInt();
        Long a[] = new Long[n];

        for(int i = 0;i < n; i++)
        {
            a[i] = sc.nextLong();
        }

        int min, j, i;

        for(i = 0;i < n; i++)
        {
            min = i;
            for( j = i + 1;j < n; j++)
            {
                if(a[j] < a[min])
                    min = j;
            }
            if(min != j)
            {
                long t = a[i];
                a[i] = a[min];
                a[min] = t;
            }

        }

        for(i = 0; i < n; i++)
            System.out.print(a[i] + " ");

    }
}
