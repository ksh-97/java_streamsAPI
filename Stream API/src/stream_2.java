import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class stream_2 {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(7, 8, 3, 5, 0);

//      create immutable list
        Stream<Integer> data = arr.stream();

        data.forEach(i -> System.out.print(i + " "));

//        if stream has been used once, it can't be used again
//        Stream has been consumed earlier
        data.forEach(i -> System.out.print(i + " "));

    }
}
