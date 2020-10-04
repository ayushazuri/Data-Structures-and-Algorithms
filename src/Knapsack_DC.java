public class Knapsack_DC
{
    static int knapsack(int profit[] , int wt[], int cap, int index)
    {
        if(index >= profit.length || cap <= 0 || index < 0)
            return 0;

        int profit1 = 0;
        if(wt[index] <= cap)
            profit1 = profit[index] + knapsack(profit, wt, cap - wt[index], index + 1);
        int profit2 = knapsack(profit, wt, cap, index + 1);
        return Math.max(profit1, profit2);

    }
    public static void main(String[] args)
    {
        int[] profits = { 31, 26, 72, 17 };
        int[] weights = { 3, 1, 5, 2 };
        int maxProfit = knapsack(profits, weights, 7, 0);
        System.out.println(maxProfit);

    }
}
