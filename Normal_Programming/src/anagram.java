public class anagram {

    static boolean anagram(String a, String b){

        int s1[] = new int[256];
        int s2[] = new int[256];

        if(a.length()!=b.length())
            return false;

        for(char c: a.toCharArray()){
            s1[(int)c]++;
        }
        for(char c: b.toCharArray()){
            s2[(int)c]++;
        }
        //boolean ans=true;
        for(int i=0;i<256;i++){
            if(s1[i] != s2[i])
            {
                return false;
            }
        }
        return true;
    }

    static boolean anagram2(String a, String b){
        int s1[] = new int[256];
        //int s2[] = new int[256];

        if(a.length()!=b.length())
            return false;

        for(char c: a.toCharArray()){
            s1[(int)c]++;
        }

        for(char c: b.toCharArray()){
            s1[(int)c]--;
        }

        for(int i=0;i<256;i++){
            if(s1[i] != 0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1="ccab";
        String s2="ccba";
        boolean ans =anagram(s1, s2);
        System.out.println((ans==true)?"Anagram":"Not Anagram");
        ans =anagram2(s1, s2);
        System.out.println((ans==true)?"Anagram":"Not Anagram");
    }
}
