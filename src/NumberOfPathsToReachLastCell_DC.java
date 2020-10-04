public class NumberOfPathsToReachLastCell_DC
{
    static int noOfPath(int a[][], int row, int col, int cost)
    {
        if(cost < 0)
            return 0;

        if(row == 0 && col == 0)
            return (a[0][0] - 1 == 0) ? 1 : 0;

        if(row == 0)
            return noOfPath(a, 0, col - 1, cost - a[row][col]);

        if(col == 0)
            return noOfPath(a, row - 1, 0, cost - a[row][col]);

        int c1 = noOfPath(a, row - 1, col, cost - a[row][col]);
        int c2 = noOfPath(a, row, col - 1, cost - a[row][col]);

        return c1 + c2;

    }
    public static void main(String[] args) {
        int[][] a = {
                { 4, 7, 1, 6 },
                { 5, 7, 3, 9 },
                { 3, 2, 1, 2 },
                { 7, 1, 6, 3 } };
        int cost = 25;
        System.out.println(noOfPath(a, a.length - 1, a[0].length - 1, cost));

    }
}
