public class maximum_insertion_deletion_to_convert_a_to_b {
    public static void main(String[] args){
        String x = "qayush";
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
        int lc = (lcs(x, y, m, n, t));

        int insertion = y.length() - lc;
        int deletion = x.length() - lc;
        System.out.println("insertion "+insertion+ " deletion "+ deletion);
        System.out.println(insertion+deletion);

    }
    static int lcs(String x, String y, int m, int n, int t[][]){
        for(int i=1; i< m+1;i++){
            for(int j=1;j<n+1;j++) {
                if(x.charAt(i-1) == y.charAt(j-1))
                    t[i][j] = 1 + t[i-1][j-1];
                else
                {
                    t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
                }
            }
        }
        return t[m][n];
    }

}
