public class Shortest_Common_Subsequence {
    public static void main(String[] args) {
        String x = "piyush";
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


        System.out.println(lcs(x, y, m, n, t));
    }

    static StringBuilder lcs(String x, String y, int m, int n, int t[][]){

        for(int i=1; i< m+1;i++){
            for(int j=1;j<n+1;j++){
                if(x.charAt(i-1) == y.charAt(j-1))
                    t[i][j] = 1 + t[i-1][j-1];
                else
                    t[i][j] = Math.max(t[i][j-1], t[i-1][j]);
            }
        }

        String s="";
        int i=m, j=n;
        while(i>0 && j>0){
            if(x.charAt(i-1) == y.charAt(j-1))
            {
                s+=x.charAt(i-1);
                i--; j--;
            }
            else {
                if(t[i][j-1] > t[i-1][j])
                {
                    s+=(y.charAt(j-1));
                    j--;
                }
                else
                {
                    s+=x.charAt(i-1);
                    i--;
                }
            }

        }
        while(i>0){
            s+=x.charAt(i-1);
            i--;
        }
        while(j>0){
            s+=y.charAt(j-1);
            j--;
        }
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse();

    }
}
