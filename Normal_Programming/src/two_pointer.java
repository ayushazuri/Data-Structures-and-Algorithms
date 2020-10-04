import java.util.*;
//Find 3 numbers in a array with sum equals to x

public class two_pointer {
    public static void main(String[] args) {

        int a[] ={1, 4, 45, 6, 10, 8};
        int n=6;
        int k=13;
        System.out.println(triplet(a, k));
        System.out.println(triplet_sum(a, k));
    }

    static int triplet(int a[], int k){
        Arrays.sort(a);
        int l=0;
        int h=0;
        int count=0;
        for(int i=0;i<a.length - 2;i++) {
            l=i +1;
            h=a.length - 1;
            while(l<h){
                if((a[i] + a[l] + a[h])==k)
                { count++; return 1;}
                else if((a[i] + a[l] + a[h]) < k)
                    l++;
                else if((a[i] + a[l] + a[h]) > k)
                    h--;
            }
        }
        return count;
    }

    static int triplet_sum(int a[], int k){
        Arrays.sort(a);
        int l=0;
        int h=0;
        int max=0;
        int count=0;
        for(int i=0;i<a.length - 2;i++) {
            l=i +1;
            h=a.length -1;
            while(l<h){

                if((a[i] + a[l] + a[h])==k)
                {
                    if((a[i] + a[l] + a[h]) > max){
                        max=(a[i] + a[l] + a[h]);
                    }
                }
                else if((a[i] + a[l] + a[h]) < k)
                    l++;
                else if((a[i] + a[l] + a[h]) > k)
                    h--;
            }
        }
        return max;
    }
}
