import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class stream_3 {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(7, 8, 3, 5, 0);

//        Operating on stream
        Stream<Integer> ss = arr.stream();
        Stream<Integer> ss2 = ss.map(x -> x*2);
        ss2.forEach(i -> System.out.print(i + " "));

        System.out.println();

//        Doing same thing in 1 step
        Stream<Integer> ss3 = arr.stream().map(x -> x*4);
        ss3.forEach(i -> System.out.print(i + " "));

        System.out.println();

//        Further short
        arr.stream()
                .map(x -> x*3)
                .forEach(i -> System.out.print(i + " "));

        System.out.println();

//      Additional features
        arr.stream()
                .sorted()
                .map(x -> x*3)
                .forEach(i -> System.out.print(i + " "));

        System.out.println();


//        Filter
        arr.stream()
                .filter(i -> i%2==1)
                .sorted()
                .map(x -> x*3)
                .forEach(i -> System.out.print(i + " "));

        System.out.println();

//        Adding stream
        int sum = arr.stream()
                .filter(n -> n%2==1)
                .map(x -> x*3)
                .reduce(0, (a, b) -> a+b);
        System.out.println("Sum: " + sum);
    }
}
