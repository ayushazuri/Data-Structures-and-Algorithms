// Wrong, not working properly
public class convert_one_string_to_another
{
    static int convert(String s1, String s2, int i1, int i2)
    {
        int c1, c2, c3;
        if(s1.length() == i1){
            return s2.length() - i2;
        }
        else if(s2.length() == i2){
            return s1.length() - i1;
        }
        else{
            if(s1.charAt(i1) == s2.charAt(i2))
                return convert(s1, s2, i1+1, i2+1);

            c1 = 1 + convert(s1, s2, i1 + 1, i2);
            c2 = 1 + convert(s1, s2, i1, i2 + 1);
            c3 = 1 + convert(s1, s2, i1 + 1, i2 + 1);


        }
        int x = Math.min(c1, Math.min(c2, c3));
        return x;

    }

    static int convertDP(int a[][], String s1, String s2, int i1, int i2){
        if(a[i1][i2] == 0){

            if(s1.length() == i1){
                a[i1][i2] = s2.length() - i2;
            }
            else if(s2.length() == i2){
                a[i1][i2] = s1.length() - i1;
            }

            else if(s1.charAt(i1) == s2.charAt(i2)){
                a[i1][i2] = convertDP(a, s1, s2, i1+1, i2+1);
            }
            else{
                int c1 = 1 + convertDP(a,s1, s2, i1 + 1, i2);
                int c2 = 1 + convertDP(a, s1, s2, i1, i2 + 1);
                int c3 = 1 + convertDP(a, s1, s2, i1 + 1, i2 + 1);

                a[i1][i2] = Math.min(c1, Math.min(c2, c3));
            }
        }
        return a[i1][i2];
    }
    public static void main(String[] args)
    {
        String s1 = "table";
        String s2 = "tabres";

        int res = convert(s1, s2, 0, 0 );
        System.out.println(res);

        int a[][] = new int[s1.length() + 1][s2.length() + 1];
        res = convertDP(a, s1, s2, 0, 0 );
        System.out.println(res);

    }
}
