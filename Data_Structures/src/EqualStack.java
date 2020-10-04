import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class EqualStack {

    /*
     * Complete the equalStacks function below.
     */
    static long equalStacks(long[] h1, long[] h2, long[] h3) {

        Stack<Long> s1 = new Stack<>();
        Stack<Long> s2 = new Stack<>();
        Stack<Long> s3 = new Stack<>();

        long sum=0;
        for( int i=h1.length - 1; i>=0; i--)
        {
            sum += h1[i];
            s1.push(sum);
        }

        sum =0;
        for( int i=h2.length - 1; i>=0; i--)
        {
            sum += h2[i];
            s2.push(sum);
        }

        sum=0;
        for( int i=h3.length - 1; i>=0; i--)
        {
            sum += h3[i];
            s3.push(sum);
        }

        //long max=Math.max(s1.peek(), Math.max(s2.peek(), s3.peek()));

        while(true)
        {
            if(s1.isEmpty() || s2.isEmpty() || s3.isEmpty())
                return 0;

            long s1h=s1.peek();
            long s2h=s2.peek();
            long s3h=s3.peek();

            if( s1h == s2h && s1h == s3h)
                return s1h;

            if(s1h >= s2h && s1h >= s3h)
                s1.pop();
            else if(s2h >= s1h && s2h >= s3h)
                s2.pop();
            else if(s3h >= s1h && s3h >= s2h)
                s3.pop();


        }

    }



    public static void main(String[] args) throws IOException {


        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();

        int n2 = sc.nextInt();

        int n3 = sc.nextInt();

        long[] h1 = new long[n1];

        for (int h1Itr = 0; h1Itr < n1; h1Itr++) {

            h1[h1Itr] = sc.nextInt();;
        }

        long[] h2 = new long[n2];

        for (int h2Itr = 0; h2Itr < n2; h2Itr++) {

            h2[h2Itr] = sc.nextInt();;
        }

        long[] h3 = new long[n3];



        for (int h3Itr = 0; h3Itr < n3; h3Itr++) {

            h3[h3Itr] = sc.nextInt();
        }

        System.out.println(equalStacks(h1, h2, h3));

    }
}
