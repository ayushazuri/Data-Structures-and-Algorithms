import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


//        7
//        100 100 50 40 40 20 10
//        4
//        5 25 50 120
//        ans 6 4 2 1
public class climbing_the_leaderboard {

    // Complete the climbingLeaderboard function below.
    static void climbingLeaderboard(int[] s, int[] a) {
        Map<Integer, Integer> map = new HashMap<>();
        int t=1;
        for(int i: s){
            if(!map.containsValue(i))
                map.put(t++, i);
        }
        int[] c = new int[a.length];
        for(int i=0;i<a.length;i++){
            for(int j=1;j<=map.size();j++){
                if(a[i] > map.get(j)){
                    c[i] = j;
                    break;
                }
                else if(a[i] == map.get(j)){
                    c[i] = j;
                    break;
                }
                else if(a[i] < map.get(j)){
                    if(j == map.size())
                        c[i] = j+1;
                    else
                        continue;
                }
            }
            System.out.println(c[i]);
        }
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Scanner scanner =new Scanner(System.in);

        int scoresCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[scoresCount];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < scoresCount; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int aliceCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] alice = new int[aliceCount];

        String[] aliceItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < aliceCount; i++) {
            int aliceItem = Integer.parseInt(aliceItems[i]);
            alice[i] = aliceItem;
        }

        climbingLeaderboard(scores, alice);




    }
}
