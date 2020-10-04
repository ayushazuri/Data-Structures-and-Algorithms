public class Print_LCS {
    public static void main(String[] args) {
        String x = "tpayush";
        String y = "pratyush";
        int m = x.length();
        int n = y.length();
        int t[][] = new int[m+1][n+1];
        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                if(i == 0 || j == 0)
                    t[i][j] = 0;
            }
        }


        lcs(x, y, m, n, t);
    }
    static void lcs(String x, String y, int m, int n, int t[][]){

        int i,j;
        for( i=1; i< m+1;i++){
            for( j=1;j<n+1;j++){
                if(x.charAt(i-1) == y.charAt(j-1))
                    t[i][j] = 1 + t[i-1][j-1];
                else
                    t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
            }
        }
        i=m;
        j=n;
        StringBuilder s= new StringBuilder();
        while(i > 0 && j >0){
            if(x.charAt(i-1) == y.charAt(j-1))
            {
                s.append(x.charAt(i-1));
                i--;
                j--;
            }
            else
            {
                if(t[i-1][j] > t[i][j-1])
                    i--;
                else
                    j--;
            }
        }
        System.out.println(s.reverse());

    }
}
