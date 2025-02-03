import java.util.Arrays;
import java.util.List;

public class ForEach_method {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(7, 8, 3, 5, 0);

//        1. Normal for loop

//        2. Enhanced for loop
        for(int i : arr) System.out.println(i);

//        ForEach method [Lambda exp]
        arr.forEach(i -> System.out.print(i + " "));

    }
}
