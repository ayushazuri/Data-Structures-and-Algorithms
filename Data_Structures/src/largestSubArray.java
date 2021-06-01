public class largestSubArray {
    public static void main(String[] args) {
        int a[] = {2, -3, 2, 4, -1, 2, 3, -2};
        int maxSum= Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0;i<a.length;i++){
            currSum += a[i];

            maxSum= Math.max(currSum, maxSum);
            if(currSum < 0)
                currSum = 0;
        }
        System.out.println(maxSum);
    }
}

