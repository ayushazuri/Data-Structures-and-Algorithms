public class SubsetWIthGivenSum {
    public static void main(String[] args) {
        int a[] = {2, -3, 2, 4, -1, 2, 3, -2};
        int sum = 1;

        int j=0; int cursum =0;
        for(int i=0;i<a.length;i++){
            cursum += a[i];
            while(cursum > sum && j < i-1){
                cursum -= a[i];
                j++;
            }

            if(cursum == sum){
                System.out.println(j + " "+ (i-1));
                break;
            }

            cursum+=a[i];

        }

    }
}
