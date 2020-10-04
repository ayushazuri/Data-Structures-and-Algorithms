public class longest_subsequense
{
    static int subsequense(String s1, String s2, int i1, int i2)
    {
        int c1, c2, c3;

        if(i1 == s1.length() || i2 == s2.length())
            return 0;
        c3 = 0;
        if(s1.charAt(i1) == s2.charAt(i2))
            c3 = 1 + subsequense(s1, s2, i1 + 1, i2 + 1);
        c1 = subsequense(s1, s2, i1, i2 + 1); // Keeping letter from first String
        c2 = subsequense(s1, s2, i1 + 1, i2); // Keeping letter from Second String
         return Math.max(c1, Math.max(c2, c3));
    }
    public static void main(String[] args)
    {
        String s1 = "piyush";
        String s2 = "pratyush";

        int res = subsequense(s1, s2, 0, 0);
        System.out.println(res);

    }
}
