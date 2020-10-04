import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class a {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int c=0;
        for(int i=0; i<q.length-1;i++){

            if((q[i] > q[i+1])){
                if(!map.containsKey(q[i]))
                    map.put(q[i], 1);
                else
                    map.put(q[i], map.get(q[i]) + 1);

                int t = q[i];
                q[i] = q[i+1];
                q[i+1] = t;
                c++;

            }
            if(map.get(q[i]) >2){
                System.out.println("Too chaotic");
                return;
            }
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}
