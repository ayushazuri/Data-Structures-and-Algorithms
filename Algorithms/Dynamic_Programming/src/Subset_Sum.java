// Output should tell whether a subset with sum equal to given sum is present or not. That is, True or False.
public class Subset_Sum {
    public static void main(String[] args) {
        int a[] = {2, 4, 5, 1 ,10};
        int sum = 11;
        int n=a.length;
        boolean t[][] = new boolean[a.length+1][sum+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<sum+1;j++){
                if(i == 0)
                    t[i][j] = false;
                if(j == 0)
                    t[i][j] = true;
            }
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                if(a[i-1] <= j)
                    t[i][j] = t[i-1][j-a[i-1]] || t[i-1][j];
                else
                    t[i][j] = t[i-1][j];
            }
        }

        System.out.println(t[n][sum]);
    }
}
