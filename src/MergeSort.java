import java.util.Scanner;

public class MergeSort
{
    public void mergesort(int[] a, int start, int end)
    {
        if(start < end)
        {
            int mid = (start + end)/2;
            mergesort(a, start, mid);
            mergesort(a, mid + 1, end);
            merge(a, start, mid, end);
        }

    }

    public void merge(int[] a, int start, int mid, int end)
    {
        int n1 = mid - start + 1;
        int n2 = end - mid;
        int[] leftarray = new int[n1];
        int[] rightarray = new int[n2];


        for(int i=0;i<n1;i++)
        {
            leftarray[i] = a[start + i];
        }

        for(int j=0; j<n2;j++)
        {
            rightarray[j] = a[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = start;
        while (i < n1 && j < n2)
        {
            if(leftarray[i] <= rightarray[j])
            {
                a[k] = leftarray[i];
                i++;
            }
            else
            {
                a[k] = rightarray[j];
                j++;
            }
            k++;
        }


        while(i < n1)
        {
            a[k] = leftarray[i];
            i++; k++;
        }
        while(j < n2)
        {
            a[k] = rightarray[j];
            j++; k++;
        }
//        System.out.println(n);

    }
//    static void print(int a[])
//    {
//
//    }
    public static void main(String[] args)
    {
        int[] a = {12, 11, 13, 3, 4};
        MergeSort ms = new MergeSort();
        ms.mergesort(a, 0, a.length - 1);

        for(int i=0;i< a.length;i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}
