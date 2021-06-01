import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String s = "i.like.this.program.very.much"; //much.very.program.this.like.I
        System.out.println(reverseWords(s));
    }

    static String reverseWords(String s)
    {
        // code here
        String[] str = s.split("\\.");
        System.out.println(Arrays.toString(str));
        StringBuilder sb = new StringBuilder();
        for(int i = str.length - 1;i>=0;i--){
            sb.append(str[i]);
            sb.append(".");
        }
        System.out.println(sb);
        return sb.toString().substring(0, sb.length()-1);
    }
}
