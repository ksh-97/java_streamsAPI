package collection.list;

import java.util.ArrayList;
import java.util.List;

public class list_interfaces {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add(null);

//        Print entire list
        System.out.println(list);

//        Directly accessing an element by index
        System.out.println(list.get(1));

    }
}
