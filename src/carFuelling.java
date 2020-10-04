import java.util.*;
import java.io.*;

public class carFuelling {
    static int computeMinRefills(long dist, long tank, long[] stops, long n)
    {
        int current=0, last=0;
        int count=0;
        while(current<n)
        {
            last=current;
            while(stops[current+1]-stops[last]<=tank)
            {
                current++;
            }
            if(current==last)
                return(-1);
            if(current<=n)
                count++;

        }
        return(count);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long dist = scanner.nextInt();
        long tank = scanner.nextInt();
        int n = scanner.nextInt();
        long stops[] = new long[n+2];
        for (int i = 1; i <= n; i++) {
            stops[i] = scanner.nextInt();
        }
        stops[0]=0;
        stops[n] = dist;

        System.out.println(computeMinRefills(dist, tank, stops, n+2));
    }
}
