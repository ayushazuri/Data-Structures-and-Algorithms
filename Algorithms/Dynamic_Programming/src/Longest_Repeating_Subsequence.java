//AABBCEDD it has ABD as repeated subsequence

public class Longest_Repeating_Subsequence {
    public static void main(String[] args) {
        String x = "AABBCEDD";
        String y = x;
        int m = x.length();
        int n = y.length();
        int t[][] = new int[m+1][n+1];
        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                if(i == 0 || j == 0)
                    t[i][j] = 0;
            }
        }


        System.out.println(lcs(x, y, m, n, t));
    }
    static int lcs(String x, String y, int m, int n, int t[][]){

        for(int i=1; i< m+1;i++){
            for(int j=1;j<n+1;j++){
                if(x.charAt(i-1) == y.charAt(j-1) && i!=j)
                    t[i][j] = 1 + t[i-1][j-1];
                else
                    t[i][j] = Math.max(t[i][j-1], t[i-1][j]);
            }
        }
        return t[m][n];
    }
}
