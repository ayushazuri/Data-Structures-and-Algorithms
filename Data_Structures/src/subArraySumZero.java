import java.util.HashSet;
import java.util.Set;

public class subArraySumZero {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        int a[] = {2, 1, 2, -4 , -2};

        int sum = 0;
        boolean flag = false;
        for( int i : a )
        {

            set.add(sum);
            sum += i;
            if(set.contains(sum)) {
                flag = true;
                break;
            }
        }
        if(flag)
            System.out.println("Found");
        else
            System.out.println("Not Found");
    }
}
