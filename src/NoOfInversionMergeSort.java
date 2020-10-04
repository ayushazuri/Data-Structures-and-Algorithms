import java.util.*;

public class NoOfInversionMergeSort {

    private static long getNumberOfInversions(int[] a, int start, int end) {
        long numberOfInversions = 0;
        if (start >= end) {
            return numberOfInversions;
        }
        int mid = (start + end) / 2;
        numberOfInversions += getNumberOfInversions(a, start, mid);
        System.out.println("merge 1 " + numberOfInversions);
        numberOfInversions += getNumberOfInversions(a, mid + 1, end);
        System.out.println("merge 2 " + numberOfInversions);
        numberOfInversions += merge(a, start, mid, end);
        System.out.println("merge 3 " + numberOfInversions);
        return numberOfInversions;
    }

    static long merge(int a[], int start, int mid, int end)
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
        int swaps = 0;
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
                swaps = swaps + (mid - 1) + (1 - i);
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
        return swaps;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println(getNumberOfInversions(a, 0, a.length - 1));
    }
}


