import java.util.Arrays;
import java.util.Scanner;


public class binarySearch
{
    static int BinarySearch(long[] a, int low, int high, long key)
    {
        int mid;
        while(low<=high)
        {
            mid=low+(high-low)/2;
            if(a[mid]==key)
                return(mid);
            else if(a[mid] < key)
            {
                low=mid+1;
            }
            else if(a[mid]>key)
            {
                high=mid-1;
            }

        }
        return(-1);


    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        long a[]=new long[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextLong();
        }
        int k;
        k=sc.nextInt();
        long b[]=new long[k];
        for(int i=0;i<k;i++)
        {
            b[i]=sc.nextLong();
        }
        Arrays.sort(a);
        int low=0;
        int high=n-1;
        for(int i=0;i<k;i++)
        {
            System.out.print(BinarySearch(a, low, high, b[i])+" ");
        }

    }


}
