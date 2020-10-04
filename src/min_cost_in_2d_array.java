public class min_cost_in_2d_array
{
    static int cost(int a[][], int row, int col)
    {
        if(col == 0 && row == 0){
            return a[0][0];
        }

        if(col == -1 || row == -1) {
            return 0;
        }

        int c1 = cost(a, row - 1, col); // top to bottom
        int c2 = cost(a, row, col - 1); // left to right
        int res = Integer.min(c1, c2) + a[row][col];
        return res ;

    }
    public static void main(String[] args) {
        int[][] array =
                {
                        { 4, 7, 8, 6, 4 },
                        { 6, 7, 3, 9, 2 },
                        { 3, 8, 1, 2, 4 },
                        { 7, 1, 7, 3, 7 },
                        { 2, 9, 8, 9, 3 }
                };

        System.out.println(cost(array, array.length - 1, array[0].length -1));


    }
}