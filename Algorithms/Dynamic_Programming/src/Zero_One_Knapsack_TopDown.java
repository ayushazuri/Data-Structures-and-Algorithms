public class Zero_One_Knapsack_TopDown {

    public static void main(String[] args) {
        int[] wt = {1, 3, 4, 5};
        int[] val = {3, 5 , 1, 4};
        int w = 10;
        int n = wt.length;

        int t[][] = new int[n+1][w+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<w+1;j++){
                if(i == 0 || j == 0)
                    t[i][j] = 0;
            }
        }
        int maxProfit = knapsack(wt, val, w, n, t);
        System.out.println(maxProfit);
    }

    static int knapsack(int wt[], int val[], int w, int n, int t[][]){

        for(int i=1;i<n + 1;i++) {
            for (int j = 1; j < w + 1; j++) {

                if(wt[i-1] <= j)
                    t[i][j] = Math.max(val[i-1] + t[i-1][j - wt[i - 1]], t[i-1][j]);
                else if(wt[i-1] > j)
                    t[i][j] = t[i-1][j];
            }
        }
        return t[n][w];
    }





}
