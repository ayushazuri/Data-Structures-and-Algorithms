public class longest_palindromic_subsequence
{
    static int check(String s, int start, int end)
    {
        if(start > end)
            return 0;
        if(start == end)
            return 1;

        int count1=0;
        if(s.charAt(start) == s.charAt(end))
            count1 = 2 + check(s, start + 1, end - 1);
        int count3 = check(s, start, end - 1);
        int count2 = check(s, start + 1, end);

        return Math.max(count1, Math.max(count2, count3));
    }
    public static void main(String[] args)
    {
        String s = "elrmenmet";
        System.out.println(check(s,0,s.length()-1));

    }
}
