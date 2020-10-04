public class Minimum_Deletion_To_Make_Palindrome {
    public static void main(String[] args) {
        String x = "osohin";
        StringBuilder sb = new StringBuilder(x);
        sb.reverse();
        String y = new String(sb);
        int m = x.length();
        int n = y.length();
        int t[][] = new int[m+1][n+1];
        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                if(i == 0 || j == 0)
                    t[i][j] = 0;
            }
        }


        System.out.println(x.length() - lcs(x, y, m, n, t));
    }

    static int lcs(String x, String y, int m, int n, int t[][]){
        for(int i=1; i< m+1;i++){
            for(int j=1;j<n+1;j++){
                if(x.charAt(i-1) == y.charAt(j-1))
                    t[i][j] = 1 + t[i-1][j-1];
                else
                    t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
            }
        }
        return t[m][n];
    }
}
