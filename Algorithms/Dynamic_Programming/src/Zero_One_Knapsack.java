public class Zero_One_Knapsack {

    public static void main(String[] args) {
        int[] wt = {1, 3, 4, 5};
        int[] val = {3, 5 , 1, 4};
        int w = 10;
        int n = wt.length;
        int maxProfit = knapsack(wt, val, w, n);
        System.out.println(maxProfit);
        int t[][] = new int[n+1][w+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<w+1;j++){

                    t[i][j] = -1;
            }
        }
        maxProfit = knapsackDP(wt, val, w, n, t);
        System.out.println(maxProfit);
    }

    static int knapsack(int wt[], int val[], int w, int n){
        if(n==0 || w==0)
            return 0;

        if(wt[n-1] <= w)
            return Math.max(val[n-1] + knapsack(wt, val, w - wt[n-1], n -1), knapsack(wt, val, w, n - 1));
        else
            return knapsack(wt, val, w, n-1);
    }

    static int knapsackDP(int wt[], int val[], int w, int n, int t[][]){
        if(n==0 || w==0)
            return 0;

        if(t[n][w] != -1)
            return t[n][w];

        if(wt[n-1] <= w)
            t[n][w] = Math.max(val[n-1] + knapsackDP(wt, val, w - wt[n-1], n -1, t), knapsackDP(wt, val, w, n - 1, t));
        else
            t[n][w] = knapsackDP(wt, val, w, n-1, t);
        return t[n][w];

    }



}
