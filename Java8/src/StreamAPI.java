import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1);

//        List<Integer> list2 = Arrays.asList(
        System.out.println(list);

        List<Integer> evenList = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        list.stream().map(x -> x*x).forEach(x -> System.out.print(x + " "));
        System.out.println(evenList);

        int sum = list.stream().filter(x -> x % 2 != 0).reduce(0, (ans, i) -> ans + i);
        System.out.println(sum);

        System.out.println(list.stream().distinct().collect(Collectors.toList()));

        int min = list.stream().min(Comparator.reverseOrder()).get();
        System.out.println(min);

    }
}
