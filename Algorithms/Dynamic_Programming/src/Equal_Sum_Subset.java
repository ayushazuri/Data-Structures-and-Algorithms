//wrong
public class Equal_Sum_Subset {
    public static void main(String[] args) {
        int a[] = {2, 4, 5, 1 ,10};
        int sum=0;
        int n=a.length;
        boolean t[][] = new boolean[a.length+1][sum/2+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<sum/2+1;j++){
                t[i][j] = false;
            }
        }

        for(int i=0;i<n;i++){
            sum+=a[i];
        }

        if(sum%2!=0)
            System.out.println(false);
        else
            System.out.println(subzero(a, n, sum/2, t));
    }

    static boolean subzero(int a[], int n, int sum, boolean t[][]){
        if(n == 0 || sum == 0)
            return false;

        if(t[n][sum] != false)
            return t[n][sum];

        if(a[n-1] <= sum)
            t[n][sum] = subzero(a, n-1, sum - a[n-1], t) || subzero(a, n-1, sum, t);
        else
            t[n][sum] = subzero(a, n-1, sum, t);
        return t[n][sum];
    }
}
