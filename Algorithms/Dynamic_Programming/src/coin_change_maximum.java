public class coin_change_maximum {
    public static void main(String[] args) {

        int[] coin = {1, 2, 3};
        int sum=5;
        int l=coin.length;
        int[][] t = new int[l+1][sum+1];
        for(int i=0;i<l+1;i++){
            for(int j =0;j<sum+1;j++){
                if(i==0)
                    t[i][j] = 0;
                if(j == 0)
                    t[i][j] = 1;
            }
        }
        System.out.println(count(coin, sum, l, t));
    }

    static int count(int coin[], int sum, int l, int t[][]){

        for(int i=1;i<l+1;i++){
            for(int j=1;j<sum+1;j++){
                if(coin[i-1] <= j)
                    t[i][j] = t[i][j-coin[i-1]] + t[i-1][j];
                else
                    t[i][j] = t[i-1][j];
            }
        }
        return t[l][sum];
    }
}
