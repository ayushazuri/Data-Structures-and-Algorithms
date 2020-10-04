public class number_factor
{
    static int numberFactor(int n)
    {
        if(n == 0 || n == 1|| n==2){
            return 1;
        }
        if(n==3){
            return 2;
        }

        int sub1 = numberFactor(n-1);
        int sub2 = numberFactor(n-3);
        int sub3 = numberFactor(n-4);

        return sub1+sub2+sub3;
    }

    static int numberFactorDP(int a[], int n){
        if(n == 0 || n == 1|| n==2){
            return 1;
        }
        if(n==3){
            return 2;
        }

        if(a[n] == 0){
            int sub1 = numberFactor(n-1);
            int sub2 = numberFactor(n-3);
            int sub3 = numberFactor(n-4);

            a[n] = sub1 + sub2 + sub3;
        }
        return a[n];
    }

    static int nf_dp_Bottoms_approach(int n){

        int[] a = new int[n + 1];
        a[0] = a[1] = a[2] = 1;
        a[3] = 2;
        for(int i=4; i<=n;i++){
            a[i] = a[i-1] + a[i -3] + a[i - 4];
        }
        return a[n];
    }
    public static void main(String[] args)
    {
        int res=numberFactor(10);
        System.out.println("Divide and Conquer " +res);
        int a[] = new int[11];
        int res1=numberFactorDP(a,10);
        System.out.println("DDyanmic Programming Top down " +res1);
        int res3 = nf_dp_Bottoms_approach(10);
        System.out.println("DDyanmic Programming Bottoms up " +res3);

    }
}
