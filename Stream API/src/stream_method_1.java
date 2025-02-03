import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class stream_method_1 {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(7, 8, 3, 5, 0);

//      create immutable list
        Stream<Integer> data = arr.stream();

        data.forEach(i -> System.out.print(i + " "));
    }
}
