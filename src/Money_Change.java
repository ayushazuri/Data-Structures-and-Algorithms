import java.util.Scanner;

public class Money_Change {
    private static long getChange(long m)
    {
        int denomination[]={10,5,1};
        int i=0;
        long count = 0;
        while(m!=0)
        {
            if(m>=denomination[i])
            {
                count++;
                m -= denomination[i];
            }
            else {
                i++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();
        System.out.println(getChange(m));

    }
}

