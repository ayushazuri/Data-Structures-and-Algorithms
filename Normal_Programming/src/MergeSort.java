public class MergeSort {
    public static void main(String[] args)
    {
        int[] a = {12, 11, 13, 3, 4, 5};

        mergesort(a, 0, a.length - 1);

        for(int i=0;i< a.length;i++)
        {
            System.out.print(a[i] + " ");
        }
    }

    static void mergesort(int a[], int start, int end){
        if(start < end) {
            int mid = start + (end - start) / 2;
            mergesort(a, start, mid);
            mergesort(a, mid + 1, end);
            merge(a, start, mid, end);
        }
    }

    static void merge(int a[], int start, int mid, int end){
        int n1 = mid - start + 1;
        int n2 = end - mid;

        int left[] = new int[n1];
        int right[] = new int[n2];

        for(int i = 0;i < n1;i++)
            left[i] = a[start + i];

        for(int i = 0;i < n2;i++){
            right[i] = a[mid + 1 + i];
        }

        int i=0, j=0;
        int k=start;
        while(i < n1 && j < n2){
            if(left[i] > right[j]){
                a[k++]=right[j++];
            }
            else{
                a[k++] = left[i++];
            }
        }
        while (i < n1){
            a[k++] = left[i++];
        }
        while (j < n2){
            a[k++] = right[j++];
        }
    }
}
