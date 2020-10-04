//Given an array of integers Arr of size N and a number K. Return the maximum sum of a subarray of size K.
//        Input: N = 4, K = 2
//        Arr = [100, 200, 300, 400]
//        Output: 700
//        Explanation:
//        Arr3  + Arr4 =700, which is maximum.

package SlindingWindow;

public class MaxSumSubarray_ofSizeK {
    public static void main(String[] args) {
        int a[] = {100, 200, 300, 400, 200};
        int i=0,j=0,sum = 0, max = Integer.MIN_VALUE;
        int k=2;

        while(j < a.length){
            sum = sum + a[j];
            if(j-i+1 < k){
                j++;
            }
            else if(j - i + 1 == k){
                max = Math.max(max, sum);
                sum -= a[i];
                i++;
                j++;
            }
        }
        System.out.println(max);
    }
}
