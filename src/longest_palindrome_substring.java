public class longest_palindrome_substring
{
    static int substring(String s, int start, int end)
    {
        if(start > end)
            return 0;
        if(start == end)
            return 1;

        int c1=0;
        if(s.charAt(start) == s.charAt(end))
        {
            int rem = end - start - 1;
            if(rem == substring(s, start + 1, end - 1))
                c1 = rem + 2;
        }
        int c2 = substring(s, start, end - 1);
        int c3 = substring(s, start + 1, end);

        return Math.max(c1, Math.max(c2,c3));
    }
    public static void main(String[] args)
    {
        String s = "mamdrdm";

        System.out.println(substring(s, 0, s.length() -1));

    }
}
