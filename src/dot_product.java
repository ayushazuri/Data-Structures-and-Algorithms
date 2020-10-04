// Maximum Advertisement Revenue

import java.util.*;

import static java.util.Arrays.*;

public class dot_product
{
    private static long maxDotProduct(int n, long a[], long b[])
    {
        Arrays.sort(a);
        Arrays.sort(b);
        long res=0;
        for(int i=0;i<n;i++)
        {
            res += a[i]*b[i];
        }
        return res;
    }
    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        long a[]= new long[n];
        long b[]= new long[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextLong();
        }
        for(int i=0;i<n;i++)
        {
            b[i]=sc.nextLong();
        }
        long res=maxDotProduct(n, a, b);
        System.out.println(res);
    }
}
